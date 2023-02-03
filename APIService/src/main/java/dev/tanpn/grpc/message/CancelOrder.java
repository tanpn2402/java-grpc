package dev.tanpn.grpc.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.tanpn.grpc.proto.CancelOrderReply;
import dev.tanpn.grpc.proto.CancelOrderRequest;
import dev.tanpn.grpc.proto.OrderDetail;
import dev.tanpn.grpc.proto.StockTradingGrpc.StockTradingStub;
import dev.tanpn.utils.tags.TagName;
import io.grpc.stub.StreamObserver;

@Service(TagName.B_CANCELORDER)
public class CancelOrder implements BaseMessage<Object, Object> {
    private StockTradingStub mvStockTradingStub;

    @Autowired
    public CancelOrder(StockTradingStub pStockTradingStub) {
        this.mvStockTradingStub = pStockTradingStub;
    }

    @Override
    public Map doExecute(Map<String, Object> pMessage) throws Exception {
        Map lvResponse = new HashMap<>();
        lvResponse.put(TagName.LIST, new ArrayList<Map<String, String>>());

        CountDownLatch lvLatch = new CountDownLatch(1);

        StreamObserver<CancelOrderRequest> lvCancelOrderObs = this.mvStockTradingStub
                .cancelOrders(new StreamObserver<CancelOrderReply>() {

                    public void onNext(CancelOrderReply value) {
                        value.getResponsesList().forEach(resp -> {
                            Map<String, String> lvCancelOrderDetail = new HashMap<>();
                            lvCancelOrderDetail.put(TagName.SUCCESS, resp.getSuccess() ? "Y" : "N");
                            lvCancelOrderDetail.put(TagName.MESSAGE, resp.getMessage());
                            lvCancelOrderDetail.put(TagName.ORDERID, resp.getOrderDetail().getOrderID());
                            ((List) lvResponse.get(TagName.LIST)).add(lvCancelOrderDetail);
                        });
                    };

                    @Override
                    public void onError(Throwable t) {
                        lvResponse.put(TagName.SUCCESS, "N");
                        lvResponse.put(TagName.MESSAGE, t.getMessage());
                        lvLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        lvResponse.put(TagName.SUCCESS, "Y");
                        lvResponse.put(TagName.MESSAGE, TagName.SUCCESS.toString());
                        lvLatch.countDown();
                    }
                });

        List<Map<String, String>> lvOrders = (List<Map<String, String>>) pMessage.get(TagName.LIST);
        lvOrders.forEach(order -> {
            CancelOrderRequest lvCancelOrderRequest = CancelOrderRequest.newBuilder()
                    .setOrderDetail(OrderDetail.newBuilder()
                            .setOrderID(order.get(TagName.ORDERID))
                            .setClientID(order.get(TagName.CLIENTID))
                            .build())
                    .build();
            lvCancelOrderObs.onNext(lvCancelOrderRequest);
        });
        lvCancelOrderObs.onCompleted();
        lvLatch.await(60, TimeUnit.SECONDS);
        return lvResponse;
    }
}
