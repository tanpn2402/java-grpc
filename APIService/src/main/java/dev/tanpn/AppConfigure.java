package dev.tanpn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import dev.tanpn.grpc.proto.MessageStreamingGrpc;
import dev.tanpn.grpc.proto.StockTradingGrpc;
import dev.tanpn.grpc.proto.MessageStreamingGrpc.MessageStreamingStub;
import dev.tanpn.grpc.proto.StockTradingGrpc.StockTradingStub;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;

@Configuration
public class AppConfigure {

    @Value("${grpc.port}")
    private int port;

    @Bean
    @Lazy
    public Channel grpcChannel() {
        String target = "localhost:" + String.valueOf(port);
        return Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                .build();
    }

    @Bean
    @Lazy
    public StockTradingStub stockTradingStub() {
        return StockTradingGrpc.newStub(grpcChannel());
    }

    @Bean
    @Lazy
    public MessageStreamingStub messageStreamingStub() {
        return MessageStreamingGrpc.newStub(grpcChannel());
    }
}
