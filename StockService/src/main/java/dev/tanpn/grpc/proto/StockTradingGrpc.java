package dev.tanpn.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: StockTrading.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StockTradingGrpc {

  private StockTradingGrpc() {}

  public static final String SERVICE_NAME = "stock.StockTrading";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.EnterOrderRequest,
      dev.tanpn.grpc.proto.EnterOrderReply> getEnterOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enterOrder",
      requestType = dev.tanpn.grpc.proto.EnterOrderRequest.class,
      responseType = dev.tanpn.grpc.proto.EnterOrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.EnterOrderRequest,
      dev.tanpn.grpc.proto.EnterOrderReply> getEnterOrderMethod() {
    io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.EnterOrderRequest, dev.tanpn.grpc.proto.EnterOrderReply> getEnterOrderMethod;
    if ((getEnterOrderMethod = StockTradingGrpc.getEnterOrderMethod) == null) {
      synchronized (StockTradingGrpc.class) {
        if ((getEnterOrderMethod = StockTradingGrpc.getEnterOrderMethod) == null) {
          StockTradingGrpc.getEnterOrderMethod = getEnterOrderMethod =
              io.grpc.MethodDescriptor.<dev.tanpn.grpc.proto.EnterOrderRequest, dev.tanpn.grpc.proto.EnterOrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enterOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.EnterOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.EnterOrderReply.getDefaultInstance()))
              .setSchemaDescriptor(new StockTradingMethodDescriptorSupplier("enterOrder"))
              .build();
        }
      }
    }
    return getEnterOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.CancelOrderRequest,
      dev.tanpn.grpc.proto.CancelOrderReply> getCancelOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelOrders",
      requestType = dev.tanpn.grpc.proto.CancelOrderRequest.class,
      responseType = dev.tanpn.grpc.proto.CancelOrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.CancelOrderRequest,
      dev.tanpn.grpc.proto.CancelOrderReply> getCancelOrdersMethod() {
    io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.CancelOrderRequest, dev.tanpn.grpc.proto.CancelOrderReply> getCancelOrdersMethod;
    if ((getCancelOrdersMethod = StockTradingGrpc.getCancelOrdersMethod) == null) {
      synchronized (StockTradingGrpc.class) {
        if ((getCancelOrdersMethod = StockTradingGrpc.getCancelOrdersMethod) == null) {
          StockTradingGrpc.getCancelOrdersMethod = getCancelOrdersMethod =
              io.grpc.MethodDescriptor.<dev.tanpn.grpc.proto.CancelOrderRequest, dev.tanpn.grpc.proto.CancelOrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cancelOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.CancelOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.CancelOrderReply.getDefaultInstance()))
              .setSchemaDescriptor(new StockTradingMethodDescriptorSupplier("cancelOrders"))
              .build();
        }
      }
    }
    return getCancelOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.OrderEnquiryRequest,
      dev.tanpn.grpc.proto.OrderDetail> getOrderEnquiryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderEnquiry",
      requestType = dev.tanpn.grpc.proto.OrderEnquiryRequest.class,
      responseType = dev.tanpn.grpc.proto.OrderDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.OrderEnquiryRequest,
      dev.tanpn.grpc.proto.OrderDetail> getOrderEnquiryMethod() {
    io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.OrderEnquiryRequest, dev.tanpn.grpc.proto.OrderDetail> getOrderEnquiryMethod;
    if ((getOrderEnquiryMethod = StockTradingGrpc.getOrderEnquiryMethod) == null) {
      synchronized (StockTradingGrpc.class) {
        if ((getOrderEnquiryMethod = StockTradingGrpc.getOrderEnquiryMethod) == null) {
          StockTradingGrpc.getOrderEnquiryMethod = getOrderEnquiryMethod =
              io.grpc.MethodDescriptor.<dev.tanpn.grpc.proto.OrderEnquiryRequest, dev.tanpn.grpc.proto.OrderDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "orderEnquiry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.OrderEnquiryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.OrderDetail.getDefaultInstance()))
              .setSchemaDescriptor(new StockTradingMethodDescriptorSupplier("orderEnquiry"))
              .build();
        }
      }
    }
    return getOrderEnquiryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockTradingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockTradingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockTradingStub>() {
        @java.lang.Override
        public StockTradingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockTradingStub(channel, callOptions);
        }
      };
    return StockTradingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockTradingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockTradingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockTradingBlockingStub>() {
        @java.lang.Override
        public StockTradingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockTradingBlockingStub(channel, callOptions);
        }
      };
    return StockTradingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockTradingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockTradingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockTradingFutureStub>() {
        @java.lang.Override
        public StockTradingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockTradingFutureStub(channel, callOptions);
        }
      };
    return StockTradingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StockTradingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A Unary RPC.
     * </pre>
     */
    public void enterOrder(dev.tanpn.grpc.proto.EnterOrderRequest request,
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.EnterOrderReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.CancelOrderRequest> cancelOrders(
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.CancelOrderReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCancelOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * </pre>
     */
    public void orderEnquiry(dev.tanpn.grpc.proto.OrderEnquiryRequest request,
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.OrderDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderEnquiryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.tanpn.grpc.proto.EnterOrderRequest,
                dev.tanpn.grpc.proto.EnterOrderReply>(
                  this, METHODID_ENTER_ORDER)))
          .addMethod(
            getCancelOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                dev.tanpn.grpc.proto.CancelOrderRequest,
                dev.tanpn.grpc.proto.CancelOrderReply>(
                  this, METHODID_CANCEL_ORDERS)))
          .addMethod(
            getOrderEnquiryMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dev.tanpn.grpc.proto.OrderEnquiryRequest,
                dev.tanpn.grpc.proto.OrderDetail>(
                  this, METHODID_ORDER_ENQUIRY)))
          .build();
    }
  }

  /**
   */
  public static final class StockTradingStub extends io.grpc.stub.AbstractAsyncStub<StockTradingStub> {
    private StockTradingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockTradingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockTradingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A Unary RPC.
     * </pre>
     */
    public void enterOrder(dev.tanpn.grpc.proto.EnterOrderRequest request,
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.EnterOrderReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.CancelOrderRequest> cancelOrders(
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.CancelOrderReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCancelOrdersMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * </pre>
     */
    public void orderEnquiry(dev.tanpn.grpc.proto.OrderEnquiryRequest request,
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.OrderDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOrderEnquiryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StockTradingBlockingStub extends io.grpc.stub.AbstractBlockingStub<StockTradingBlockingStub> {
    private StockTradingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockTradingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockTradingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A Unary RPC.
     * </pre>
     */
    public dev.tanpn.grpc.proto.EnterOrderReply enterOrder(dev.tanpn.grpc.proto.EnterOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * </pre>
     */
    public java.util.Iterator<dev.tanpn.grpc.proto.OrderDetail> orderEnquiry(
        dev.tanpn.grpc.proto.OrderEnquiryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOrderEnquiryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StockTradingFutureStub extends io.grpc.stub.AbstractFutureStub<StockTradingFutureStub> {
    private StockTradingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockTradingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockTradingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A Unary RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.tanpn.grpc.proto.EnterOrderReply> enterOrder(
        dev.tanpn.grpc.proto.EnterOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTER_ORDER = 0;
  private static final int METHODID_ORDER_ENQUIRY = 1;
  private static final int METHODID_CANCEL_ORDERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StockTradingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StockTradingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER_ORDER:
          serviceImpl.enterOrder((dev.tanpn.grpc.proto.EnterOrderRequest) request,
              (io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.EnterOrderReply>) responseObserver);
          break;
        case METHODID_ORDER_ENQUIRY:
          serviceImpl.orderEnquiry((dev.tanpn.grpc.proto.OrderEnquiryRequest) request,
              (io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.OrderDetail>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CANCEL_ORDERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cancelOrders(
              (io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.CancelOrderReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StockTradingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockTradingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.tanpn.grpc.proto.StockTradingSvc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockTrading");
    }
  }

  private static final class StockTradingFileDescriptorSupplier
      extends StockTradingBaseDescriptorSupplier {
    StockTradingFileDescriptorSupplier() {}
  }

  private static final class StockTradingMethodDescriptorSupplier
      extends StockTradingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockTradingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StockTradingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockTradingFileDescriptorSupplier())
              .addMethod(getEnterOrderMethod())
              .addMethod(getCancelOrdersMethod())
              .addMethod(getOrderEnquiryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
