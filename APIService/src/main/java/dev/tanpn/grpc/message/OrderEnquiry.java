package dev.tanpn.grpc.message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.tanpn.grpc.proto.OrderDetail;
import dev.tanpn.grpc.proto.OrderEnquiryRequest;
import dev.tanpn.grpc.proto.StockTradingGrpc.StockTradingStub;
import dev.tanpn.utils.tags.TagName;
import io.grpc.stub.StreamObserver;

@Service(TagName.B_ORDERENQUIRY)
public class OrderEnquiry implements BaseMessage<Object, String> {
    private StockTradingStub mvStockTradingStub;

    @Autowired
    public OrderEnquiry(StockTradingStub pStockTradingStub) {
        this.mvStockTradingStub = pStockTradingStub;
    }

    @Override
    public Map doExecute(Map<String, String> pMessage) throws Exception {
        Map lvResponse = new HashMap<>();
        List<Map<String, String>> lvOrders = new ArrayList<>();

        OrderEnquiryRequest lvOrderEnquiryRequest = OrderEnquiryRequest.newBuilder()
                .setClientID(pMessage.get(TagName.CLIENTID))
                .setStockID(pMessage.get(TagName.STOCKID))
                .setMarketID(pMessage.get(TagName.MARKETID))
                .build();

        CountDownLatch lvLatch = new CountDownLatch(1);
        this.mvStockTradingStub.orderEnquiry(lvOrderEnquiryRequest, new StreamObserver<OrderDetail>() {
            @Override
            public void onNext(OrderDetail value) {
                Map<String, String> lvOrderDetail = new HashMap<>();
                lvOrderDetail.put(TagName.ORDERID, value.getOrderID());
                lvOrderDetail.put(TagName.CLIENTID, value.getClientID());
                lvOrderDetail.put(TagName.QTY, String.valueOf(value.getQuantity()));
                lvOrderDetail.put(TagName.PRICE, String.valueOf(value.getPrice()));
                lvOrderDetail.put(TagName.STOCKID, value.getStockID());
                lvOrderDetail.put(TagName.MARKETID, value.getMarketID());
                lvOrderDetail.put(TagName.STATUS, value.getStatus().toString());
                lvOrders.add(lvOrderDetail);
            }

            @Override
            public void onError(Throwable t) {
                lvResponse.put(TagName.SUCCESS, "N");
                lvResponse.put(TagName.MESSAGE, t.getMessage());
                lvLatch.countDown();
            }

            @Override
            public void onCompleted() {
                lvResponse.put(TagName.SUCCESS, "Y");
                lvResponse.put(TagName.MESSAGE, TagName.SUCCESS);
                lvLatch.countDown();
            }
        });
        lvLatch.await(60, TimeUnit.SECONDS);
        lvResponse.put(TagName.LIST, lvOrders);
        return lvResponse;
    }
}
