package dev.tanpn.grpc.impl;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dev.tanpn.grpc.proto.MessageDetail;
import dev.tanpn.grpc.proto.OrderDetail;
import dev.tanpn.grpc.proto.MessageStreamingGrpc.MessageStreamingImplBase;
import dev.tanpn.grpc.server.observable.OrderObservable;
import dev.tanpn.repositories.OrderRepository;
import io.grpc.stub.StreamObserver;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

class OrderUpdateStreaming implements StreamObserver<MessageDetail>, Observer {
    private static final Logger LOGGER = Logger.getLogger(OrderUpdateStreaming.class.getName());
    private OrderObservable mvOrderObservable;
    private StreamObserver<MessageDetail> mvResponseObserver;

    public OrderUpdateStreaming(OrderObservable pOrderObservable, StreamObserver<MessageDetail> pResponseObserver) {
        this.mvOrderObservable = pOrderObservable;
        this.mvResponseObserver = pResponseObserver;
        this.mvOrderObservable.addObserver(this);
    }

    @Override
    public void onNext(MessageDetail value) {
        LOGGER.info("Receive new message: " + value.getMessageType());
        if (value.getMessageType().equals("PING")) {
            this.mvResponseObserver.onNext(MessageDetail.newBuilder()
                    .setMessageType("PING")
                    .setData("SERVER_TIMESTAMP: " + System.currentTimeMillis())
                    .build());
        }
    }

    @Override
    public void onCompleted() {
        this.mvOrderObservable.deleteObserver(this);
    }

    @Override
    public void onError(Throwable t) {
        this.mvOrderObservable.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object data) {
        if (data instanceof OrderDetail) {
            try {
                MessageDetail lvMessageDetail = MessageDetail.newBuilder()
                        .setMessageType("ORDER_UPDATE")
                        .setData(JsonFormat.printer().print((OrderDetail) data))
                        .build();
                this.mvResponseObserver.onNext(lvMessageDetail);
            } catch (InvalidProtocolBufferException e) {
                LOGGER.log(Level.WARNING, "Parse throw error: " + e.getMessage());
            }
        } else {
            LOGGER.log(Level.WARNING, "Invalid data type: " + (data.getClass().getName()));
        }
    }
}

@Component
@DependsOn(value = { "orderRepository" })
@Scope(scopeName = "prototype")
public class MessageStreamingImpl extends MessageStreamingImplBase {
    private static final Logger LOGGER = Logger.getLogger(MessageStreamingImpl.class.getName());

    OrderRepository mvOrderRepository;
    OrderObservable mvOrderObserverable;

    @Autowired
    public MessageStreamingImpl(OrderRepository orderRepository, OrderObservable orderObserverable) {
        this.mvOrderRepository = orderRepository;
        this.mvOrderObserverable = orderObserverable;
    }

    @Override
    public StreamObserver<MessageDetail> messageStreaming(StreamObserver<MessageDetail> responseObserver) {
        LOGGER.info("Init message streaming");
        return new OrderUpdateStreaming(this.mvOrderObserverable, responseObserver);
    }
}
