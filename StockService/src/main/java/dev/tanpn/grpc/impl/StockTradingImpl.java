package dev.tanpn.grpc.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dev.tanpn.entity.OrderEntity;
import dev.tanpn.grpc.proto.CancelOrderReply;
import dev.tanpn.grpc.proto.CancelOrderReplyDetail;
import dev.tanpn.grpc.proto.CancelOrderRequest;
import dev.tanpn.grpc.proto.EnterOrderReply;
import dev.tanpn.grpc.proto.EnterOrderRequest;
import dev.tanpn.grpc.proto.OrderDetail;
import dev.tanpn.grpc.proto.OrderEnquiryRequest;
import dev.tanpn.grpc.proto.OrderStatus;
import dev.tanpn.grpc.proto.StockTradingGrpc.StockTradingImplBase;
import dev.tanpn.grpc.server.observable.OrderObservable;
import dev.tanpn.repositories.OrderRepository;
import io.grpc.stub.StreamObserver;

@Component
@DependsOn(value = { "orderRepository" })
@Scope(scopeName = "prototype")
public class StockTradingImpl extends StockTradingImplBase {
    private static final Logger LOGGER = Logger.getLogger(StockTradingImpl.class.getName());

    private OrderRepository mvOrderRepository;
    private OrderObservable mvOrderObservable;

    @Autowired
    public StockTradingImpl(OrderRepository orderRepository, OrderObservable orderObservable) {
        this.mvOrderRepository = orderRepository;
        this.mvOrderObservable = orderObservable;
    }

    private void notifyOrderUpdate(OrderEntity pOrderEntity) {
        OrderDetail lvOrderDetail = OrderDetail.newBuilder()
                .setOrderID(String.valueOf(pOrderEntity.getId()))
                .setClientID(pOrderEntity.getClientID())
                .setQuantity(pOrderEntity.getQty())
                .setPrice(pOrderEntity.getPrice())
                .setStockID(pOrderEntity.getStockID())
                .setMarketID(pOrderEntity.getMarketID())
                .setStatus(OrderStatus.valueOf(pOrderEntity.getStatus()))
                .build();
        this.mvOrderObservable.updateOrder(lvOrderDetail);
    }

    @Override
    public void enterOrder(EnterOrderRequest request, StreamObserver<EnterOrderReply> responseObserver) {
        LOGGER.info("Receive new EnterOrder request");

        OrderEntity lvOrder = new OrderEntity();
        lvOrder.setMarketID(request.getMarketID());
        lvOrder.setStockID(request.getStockID());
        lvOrder.setPrice(request.getPrice());
        lvOrder.setQty(request.getQuantity());
        lvOrder.setClientID(request.getClientID());
        lvOrder.setStatus(OrderStatus.PENDING.toString());
        OrderEntity lvInsertedOrder = mvOrderRepository.save(lvOrder);

        OrderDetail lvOrderDetail = OrderDetail.newBuilder()
                .setOrderID(String.valueOf(lvInsertedOrder.getId()))
                .setClientID(request.getClientID())
                .setQuantity(request.getQuantity())
                .setPrice(request.getPrice())
                .setStockID(request.getStockID())
                .setMarketID(request.getMarketID())
                .setStatus(OrderStatus.valueOf(lvOrder.getStatus()))
                .build();

        EnterOrderReply lvResponse = EnterOrderReply.newBuilder()
                .setSuccess(true)
                .setOrderDetail(lvOrderDetail)
                .build();

        notifyOrderUpdate(lvOrder);
        responseObserver.onNext(lvResponse);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<CancelOrderRequest> cancelOrders(StreamObserver<CancelOrderReply> responseObserver) {
        return new StreamObserver<CancelOrderRequest>() {
            private List<OrderDetail> mvOrderCancelQueue = new ArrayList<>();

            @Override
            public void onNext(CancelOrderRequest value) {
                LOGGER.info("CancelOrderRequest onNext");
                mvOrderCancelQueue.add(value.getOrderDetail());
            }

            @Override
            public void onCompleted() {
                LOGGER.info("CancelOrderRequest onCompleted");
                // List<Integer> lvOrderIds = mvOrderCancelQueue.stream()
                // .map(order -> Integer.parseInt(order.getOrderID()))
                // .collect(Collectors.toList());
                // mvOrderRepository.deleteAllById(lvOrderIds);

                List<CancelOrderReplyDetail> lvDetail = new ArrayList<>();
                mvOrderCancelQueue.forEach(order -> {
                    Optional<OrderEntity> lvOrderDetailOpt = mvOrderRepository
                            .findById(Integer.parseInt(order.getOrderID()));

                    if (lvOrderDetailOpt.isPresent()) {
                        OrderEntity lvOrderDetail = lvOrderDetailOpt.get();

                        if (!lvOrderDetail.getStatus().equals(OrderStatus.CANCELLED.toString())) {
                            lvOrderDetail.setStatus(OrderStatus.CANCELLED.toString());
                            mvOrderRepository.save(lvOrderDetail);

                            lvDetail.add(CancelOrderReplyDetail.newBuilder()
                                    .setSuccess(true)
                                    .setMessage("SUCCESS")
                                    .setOrderDetail(order)
                                    .build());

                            notifyOrderUpdate(lvOrderDetail);

                        } else {
                            lvDetail.add(CancelOrderReplyDetail.newBuilder()
                                    .setSuccess(false)
                                    .setMessage("ORDER ALREADY CANNCELLED")
                                    .setOrderDetail(order)
                                    .build());
                        }

                    } else {
                        lvDetail.add(CancelOrderReplyDetail.newBuilder()
                                .setSuccess(false)
                                .setMessage("Invalid Order ID " + order.getOrderID())
                                .setOrderDetail(order)
                                .build());
                    }
                });

                CancelOrderReply lvCancelOrderReply = CancelOrderReply.newBuilder()
                        .addAllResponses(lvDetail).build();

                responseObserver.onNext(lvCancelOrderReply);
                responseObserver.onCompleted();
            }

            @Override
            public void onError(Throwable t) {
                LOGGER.info("Cancel order request error: " + t.getMessage());
                responseObserver.onError(t);
            }
        };
    }

    @Override
    public void orderEnquiry(OrderEnquiryRequest request, StreamObserver<OrderDetail> responseObserver) {
        List<OrderEntity> lvOrders = mvOrderRepository.findAll();

        if (lvOrders != null) {
            lvOrders.forEach(order -> {
                responseObserver.onNext(OrderDetail.newBuilder()
                        .setClientID(order.getClientID())
                        .setOrderID(String.valueOf(order.getId()))
                        .setStockID(String.valueOf(order.getStockID()))
                        .setMarketID(String.valueOf(order.getMarketID()))
                        .setQuantity(order.getQty())
                        .setPrice(order.getPrice())
                        .setStatus(OrderStatus.valueOf(order.getStatus()))
                        .build());
            });
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(new Throwable("EMPTY"));
        }
    }
}
