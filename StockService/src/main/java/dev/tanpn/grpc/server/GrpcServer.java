package dev.tanpn.grpc.server;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import dev.tanpn.grpc.impl.MessageStreamingImpl;
import dev.tanpn.grpc.impl.StockTradingImpl;

@Component
public class GrpcServer extends Thread {
    private static final Logger LOGGER = Logger.getLogger(GrpcServer.class.getName());
    private Server mvGrpcServer;

    private StockTradingImpl mvStockTradingImpl;
    private MessageStreamingImpl mvMessageStreamingImpl;

    @Value("${grpc.port}")
    private int port;

    @Value("${grpc.maxThread}")
    private int maxThread;

    @Autowired
    public GrpcServer(@Qualifier("stockTradingImpl") StockTradingImpl pStockTradingImpl,
            @Qualifier("messageStreamingImpl") MessageStreamingImpl pMessageStreamingImpl) {
        this.mvStockTradingImpl = pStockTradingImpl;
        this.mvMessageStreamingImpl = pMessageStreamingImpl;
    }

    @PostConstruct
    public void init() {
        LOGGER.info("Init gRPC server with port: " + port);
        mvGrpcServer = ServerBuilder.forPort(port)
                .addServices(Arrays.asList(
                        this.mvStockTradingImpl.bindService(),
                        this.mvMessageStreamingImpl.bindService()))
                .executor(Executors.newFixedThreadPool(maxThread))
                .build();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                LOGGER.log(Level.WARNING, "*** shutting down gRPC server since JVM is shutting down");
                try {
                    GrpcServer.this.stopServer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LOGGER.log(Level.WARNING, "*** server shut down");
            }
        });

        this.start();
    }

    @Override
    public void run() {
        try {
            GrpcServer.this.startServer();
            GrpcServer.this.blockUntilShutdown();
        } catch (IOException | InterruptedException ex) {
            LOGGER.log(Level.WARNING, ex.getMessage());
        }
    }

    public void stopServer() throws InterruptedException {
        if (mvGrpcServer != null) {
            mvGrpcServer.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

    public void startServer() throws IOException {
        mvGrpcServer.start();
        LOGGER.info("Server started, listening on " + port);
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (mvGrpcServer != null) {
            mvGrpcServer.awaitTermination();
        }
    }
}
