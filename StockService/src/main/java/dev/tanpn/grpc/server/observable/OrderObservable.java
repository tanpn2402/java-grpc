package dev.tanpn.grpc.server.observable;

import java.util.Observable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dev.tanpn.grpc.proto.OrderDetail;

@Component
@Scope(scopeName = "singleton")
public class OrderObservable extends Observable {

    public void updateOrder(OrderDetail pOrderDetail) {
        this.setChanged();
        this.notifyObservers(pOrderDetail);
    }
}
