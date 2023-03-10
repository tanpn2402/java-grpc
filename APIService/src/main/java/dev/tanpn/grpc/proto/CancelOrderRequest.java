// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTrading.proto

package dev.tanpn.grpc.proto;

/**
 * Protobuf type {@code stock.CancelOrderRequest}
 */
public  final class CancelOrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stock.CancelOrderRequest)
    CancelOrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CancelOrderRequest.newBuilder() to construct.
  private CancelOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CancelOrderRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CancelOrderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            dev.tanpn.grpc.proto.OrderDetail.Builder subBuilder = null;
            if (orderDetail_ != null) {
              subBuilder = orderDetail_.toBuilder();
            }
            orderDetail_ = input.readMessage(dev.tanpn.grpc.proto.OrderDetail.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(orderDetail_);
              orderDetail_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_CancelOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_CancelOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.tanpn.grpc.proto.CancelOrderRequest.class, dev.tanpn.grpc.proto.CancelOrderRequest.Builder.class);
  }

  public static final int ORDERDETAIL_FIELD_NUMBER = 1;
  private dev.tanpn.grpc.proto.OrderDetail orderDetail_;
  /**
   * <code>.OrderDetail orderDetail = 1;</code>
   */
  public boolean hasOrderDetail() {
    return orderDetail_ != null;
  }
  /**
   * <code>.OrderDetail orderDetail = 1;</code>
   */
  public dev.tanpn.grpc.proto.OrderDetail getOrderDetail() {
    return orderDetail_ == null ? dev.tanpn.grpc.proto.OrderDetail.getDefaultInstance() : orderDetail_;
  }
  /**
   * <code>.OrderDetail orderDetail = 1;</code>
   */
  public dev.tanpn.grpc.proto.OrderDetailOrBuilder getOrderDetailOrBuilder() {
    return getOrderDetail();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (orderDetail_ != null) {
      output.writeMessage(1, getOrderDetail());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderDetail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrderDetail());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dev.tanpn.grpc.proto.CancelOrderRequest)) {
      return super.equals(obj);
    }
    dev.tanpn.grpc.proto.CancelOrderRequest other = (dev.tanpn.grpc.proto.CancelOrderRequest) obj;

    if (hasOrderDetail() != other.hasOrderDetail()) return false;
    if (hasOrderDetail()) {
      if (!getOrderDetail()
          .equals(other.getOrderDetail())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOrderDetail()) {
      hash = (37 * hash) + ORDERDETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getOrderDetail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.tanpn.grpc.proto.CancelOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dev.tanpn.grpc.proto.CancelOrderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code stock.CancelOrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stock.CancelOrderRequest)
      dev.tanpn.grpc.proto.CancelOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_CancelOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_CancelOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.tanpn.grpc.proto.CancelOrderRequest.class, dev.tanpn.grpc.proto.CancelOrderRequest.Builder.class);
    }

    // Construct using dev.tanpn.grpc.proto.CancelOrderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (orderDetailBuilder_ == null) {
        orderDetail_ = null;
      } else {
        orderDetail_ = null;
        orderDetailBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_CancelOrderRequest_descriptor;
    }

    @java.lang.Override
    public dev.tanpn.grpc.proto.CancelOrderRequest getDefaultInstanceForType() {
      return dev.tanpn.grpc.proto.CancelOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public dev.tanpn.grpc.proto.CancelOrderRequest build() {
      dev.tanpn.grpc.proto.CancelOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.tanpn.grpc.proto.CancelOrderRequest buildPartial() {
      dev.tanpn.grpc.proto.CancelOrderRequest result = new dev.tanpn.grpc.proto.CancelOrderRequest(this);
      if (orderDetailBuilder_ == null) {
        result.orderDetail_ = orderDetail_;
      } else {
        result.orderDetail_ = orderDetailBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dev.tanpn.grpc.proto.CancelOrderRequest) {
        return mergeFrom((dev.tanpn.grpc.proto.CancelOrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.tanpn.grpc.proto.CancelOrderRequest other) {
      if (other == dev.tanpn.grpc.proto.CancelOrderRequest.getDefaultInstance()) return this;
      if (other.hasOrderDetail()) {
        mergeOrderDetail(other.getOrderDetail());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dev.tanpn.grpc.proto.CancelOrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.tanpn.grpc.proto.CancelOrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private dev.tanpn.grpc.proto.OrderDetail orderDetail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.tanpn.grpc.proto.OrderDetail, dev.tanpn.grpc.proto.OrderDetail.Builder, dev.tanpn.grpc.proto.OrderDetailOrBuilder> orderDetailBuilder_;
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public boolean hasOrderDetail() {
      return orderDetailBuilder_ != null || orderDetail_ != null;
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public dev.tanpn.grpc.proto.OrderDetail getOrderDetail() {
      if (orderDetailBuilder_ == null) {
        return orderDetail_ == null ? dev.tanpn.grpc.proto.OrderDetail.getDefaultInstance() : orderDetail_;
      } else {
        return orderDetailBuilder_.getMessage();
      }
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public Builder setOrderDetail(dev.tanpn.grpc.proto.OrderDetail value) {
      if (orderDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        orderDetail_ = value;
        onChanged();
      } else {
        orderDetailBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public Builder setOrderDetail(
        dev.tanpn.grpc.proto.OrderDetail.Builder builderForValue) {
      if (orderDetailBuilder_ == null) {
        orderDetail_ = builderForValue.build();
        onChanged();
      } else {
        orderDetailBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public Builder mergeOrderDetail(dev.tanpn.grpc.proto.OrderDetail value) {
      if (orderDetailBuilder_ == null) {
        if (orderDetail_ != null) {
          orderDetail_ =
            dev.tanpn.grpc.proto.OrderDetail.newBuilder(orderDetail_).mergeFrom(value).buildPartial();
        } else {
          orderDetail_ = value;
        }
        onChanged();
      } else {
        orderDetailBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public Builder clearOrderDetail() {
      if (orderDetailBuilder_ == null) {
        orderDetail_ = null;
        onChanged();
      } else {
        orderDetail_ = null;
        orderDetailBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public dev.tanpn.grpc.proto.OrderDetail.Builder getOrderDetailBuilder() {
      
      onChanged();
      return getOrderDetailFieldBuilder().getBuilder();
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    public dev.tanpn.grpc.proto.OrderDetailOrBuilder getOrderDetailOrBuilder() {
      if (orderDetailBuilder_ != null) {
        return orderDetailBuilder_.getMessageOrBuilder();
      } else {
        return orderDetail_ == null ?
            dev.tanpn.grpc.proto.OrderDetail.getDefaultInstance() : orderDetail_;
      }
    }
    /**
     * <code>.OrderDetail orderDetail = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.tanpn.grpc.proto.OrderDetail, dev.tanpn.grpc.proto.OrderDetail.Builder, dev.tanpn.grpc.proto.OrderDetailOrBuilder> 
        getOrderDetailFieldBuilder() {
      if (orderDetailBuilder_ == null) {
        orderDetailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dev.tanpn.grpc.proto.OrderDetail, dev.tanpn.grpc.proto.OrderDetail.Builder, dev.tanpn.grpc.proto.OrderDetailOrBuilder>(
                getOrderDetail(),
                getParentForChildren(),
                isClean());
        orderDetail_ = null;
      }
      return orderDetailBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:stock.CancelOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:stock.CancelOrderRequest)
  private static final dev.tanpn.grpc.proto.CancelOrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.tanpn.grpc.proto.CancelOrderRequest();
  }

  public static dev.tanpn.grpc.proto.CancelOrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancelOrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<CancelOrderRequest>() {
    @java.lang.Override
    public CancelOrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CancelOrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CancelOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancelOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.tanpn.grpc.proto.CancelOrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

