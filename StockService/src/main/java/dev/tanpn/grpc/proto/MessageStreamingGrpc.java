package dev.tanpn.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: MessageStreaming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessageStreamingGrpc {

  private MessageStreamingGrpc() {}

  public static final String SERVICE_NAME = "stock.MessageStreaming";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.MessageDetail,
      dev.tanpn.grpc.proto.MessageDetail> getMessageStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "messageStreaming",
      requestType = dev.tanpn.grpc.proto.MessageDetail.class,
      responseType = dev.tanpn.grpc.proto.MessageDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.MessageDetail,
      dev.tanpn.grpc.proto.MessageDetail> getMessageStreamingMethod() {
    io.grpc.MethodDescriptor<dev.tanpn.grpc.proto.MessageDetail, dev.tanpn.grpc.proto.MessageDetail> getMessageStreamingMethod;
    if ((getMessageStreamingMethod = MessageStreamingGrpc.getMessageStreamingMethod) == null) {
      synchronized (MessageStreamingGrpc.class) {
        if ((getMessageStreamingMethod = MessageStreamingGrpc.getMessageStreamingMethod) == null) {
          MessageStreamingGrpc.getMessageStreamingMethod = getMessageStreamingMethod =
              io.grpc.MethodDescriptor.<dev.tanpn.grpc.proto.MessageDetail, dev.tanpn.grpc.proto.MessageDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "messageStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.MessageDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.tanpn.grpc.proto.MessageDetail.getDefaultInstance()))
              .setSchemaDescriptor(new MessageStreamingMethodDescriptorSupplier("messageStreaming"))
              .build();
        }
      }
    }
    return getMessageStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageStreamingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageStreamingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageStreamingStub>() {
        @java.lang.Override
        public MessageStreamingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageStreamingStub(channel, callOptions);
        }
      };
    return MessageStreamingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageStreamingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageStreamingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageStreamingBlockingStub>() {
        @java.lang.Override
        public MessageStreamingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageStreamingBlockingStub(channel, callOptions);
        }
      };
    return MessageStreamingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageStreamingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageStreamingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageStreamingFutureStub>() {
        @java.lang.Override
        public MessageStreamingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageStreamingFutureStub(channel, callOptions);
        }
      };
    return MessageStreamingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessageStreamingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.MessageDetail> messageStreaming(
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.MessageDetail> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMessageStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMessageStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                dev.tanpn.grpc.proto.MessageDetail,
                dev.tanpn.grpc.proto.MessageDetail>(
                  this, METHODID_MESSAGE_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class MessageStreamingStub extends io.grpc.stub.AbstractAsyncStub<MessageStreamingStub> {
    private MessageStreamingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageStreamingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageStreamingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.MessageDetail> messageStreaming(
        io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.MessageDetail> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getMessageStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MessageStreamingBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessageStreamingBlockingStub> {
    private MessageStreamingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageStreamingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageStreamingBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class MessageStreamingFutureStub extends io.grpc.stub.AbstractFutureStub<MessageStreamingFutureStub> {
    private MessageStreamingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageStreamingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageStreamingFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MESSAGE_STREAMING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageStreamingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageStreamingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MESSAGE_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.messageStreaming(
              (io.grpc.stub.StreamObserver<dev.tanpn.grpc.proto.MessageDetail>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessageStreamingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageStreamingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.tanpn.grpc.proto.MessageStreamingSvc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageStreaming");
    }
  }

  private static final class MessageStreamingFileDescriptorSupplier
      extends MessageStreamingBaseDescriptorSupplier {
    MessageStreamingFileDescriptorSupplier() {}
  }

  private static final class MessageStreamingMethodDescriptorSupplier
      extends MessageStreamingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageStreamingMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessageStreamingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageStreamingFileDescriptorSupplier())
              .addMethod(getMessageStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
