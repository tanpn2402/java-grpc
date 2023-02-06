package dev.tanpn.grpc.message;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import dev.tanpn.grpc.proto.MessageDetail;
import dev.tanpn.grpc.proto.MessageStreamingGrpc.MessageStreamingStub;
import io.grpc.stub.StreamObserver;

@Component
@DependsOn(value = { "messageStreamingStub" })
public class MessageStreaming {
    private static Logger LOGGER = Logger.getLogger(MessageStreaming.class.getName());

    private MessageStreamingStub mvMessageStreamingStub;
    private StreamObserver<MessageDetail> mvStreamObserver;

    @Autowired
    public MessageStreaming(MessageStreamingStub pMessageStreamingStub) {
        this.mvMessageStreamingStub = pMessageStreamingStub;
    }

    @PostConstruct
    public void init() {
        LOGGER.info("Post Contruct: Init stream channel");
        this.mvStreamObserver = this.mvMessageStreamingStub.messageStreaming(new StreamObserver<MessageDetail>() {

            @Override
            public void onNext(MessageDetail value) {
                LOGGER.info("Receive new message: " + value.toString());
            }

            @Override
            public void onError(Throwable t) {
                LOGGER.info("Streaming has interupted. Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                LOGGER.info("Streaming has completed");
            }
        });

        new Runner(mvStreamObserver).start();
    }

    private class Runner extends Thread {
        private StreamObserver<MessageDetail> mvStreamObserver;

        public Runner(StreamObserver<MessageDetail> pStreamObserver) {
            this.mvStreamObserver = pStreamObserver;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5 * 1000);
                    this.mvStreamObserver.onNext(MessageDetail.newBuilder().setMessageType("PING").build());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
