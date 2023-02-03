package dev.tanpn.grpc.message;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.tanpn.grpc.proto.EnterOrderReply;
import dev.tanpn.grpc.proto.EnterOrderRequest;
import dev.tanpn.grpc.proto.StockTradingGrpc.StockTradingStub;
import dev.tanpn.utils.tags.TagName;
import io.grpc.stub.StreamObserver;

@Service(TagName.B_ENTERORDER)
public class EnterOrder implements BaseMessage<String, String> {
    private StockTradingStub mvStockTradingStub;

    @Autowired
    public EnterOrder(StockTradingStub pStockTradingStub) {
        this.mvStockTradingStub = pStockTradingStub;
    }

    @Override
    public Map<String, String> doExecute(Map<String, String> pMessage) throws InterruptedException {
        Map<String, String> lvResponse = new HashMap<>();
        EnterOrderRequest lvEnterOrderRequest = EnterOrderRequest.newBuilder()
                .setClientID(pMessage.get(TagName.CLIENTID))
                .setStockID(pMessage.get(TagName.STOCKID))
                .setMarketID(pMessage.get(TagName.MARKETID))
                .setQuantity(Integer.parseInt(pMessage.get(TagName.QTY)))
                .setPrice(Double.parseDouble(pMessage.get(TagName.PRICE)))
                .build();

        CountDownLatch lvLatch = new CountDownLatch(1);
        this.mvStockTradingStub.enterOrder(lvEnterOrderRequest, new StreamObserver<EnterOrderReply>() {

            @Override
            public void onNext(EnterOrderReply value) {
                lvResponse.put(TagName.SUCCESS, value.getSuccess() ? "Y" : "N");
                lvResponse.put(TagName.MESSAGE, value.getMessage());
                lvResponse.put(TagName.ORDERID, value.getOrderDetail().getOrderID());
            }

            @Override
            public void onError(Throwable t) {
                lvResponse.put(TagName.SUCCESS, "N");
                lvResponse.put(TagName.MESSAGE, t.getMessage());
                lvLatch.countDown();
            }

            @Override
            public void onCompleted() {
                lvLatch.countDown();
            }
        });
        lvLatch.await(60, TimeUnit.SECONDS);
        return lvResponse;
    }
}
