package dev.tanpn.grpc.impl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dev.tanpn.grpc.proto.MessageDetail;
import dev.tanpn.grpc.proto.MessageStreamingGrpc.MessageStreamingImplBase;
import dev.tanpn.repositories.OrderRepository;
import io.grpc.stub.StreamObserver;

@Component
@DependsOn(value = { "orderRepository" })
@Scope(scopeName = "prototype")
public class MessageStreamingImpl extends MessageStreamingImplBase {
    private static final Logger LOGGER = Logger.getLogger(MessageStreamingImpl.class.getName());

    OrderRepository mvOrderRepository;

    @Autowired
    public MessageStreamingImpl(OrderRepository orderRepository) {
        this.mvOrderRepository = orderRepository;
    }

    @Override
    public StreamObserver<MessageDetail> messageStreaming(StreamObserver<MessageDetail> responseObserver) {
        return super.messageStreaming(responseObserver);
    }
}
