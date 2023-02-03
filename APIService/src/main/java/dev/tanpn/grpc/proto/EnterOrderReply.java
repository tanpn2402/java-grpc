// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTrading.proto

package dev.tanpn.grpc.proto;

/**
 * Protobuf type {@code stock.EnterOrderReply}
 */
public  final class EnterOrderReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stock.EnterOrderReply)
    EnterOrderReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnterOrderReply.newBuilder() to construct.
  private EnterOrderReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnterOrderReply() {
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EnterOrderReply(
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
          case 8: {

            success_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
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
    return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_EnterOrderReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_EnterOrderReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.tanpn.grpc.proto.EnterOrderReply.class, dev.tanpn.grpc.proto.EnterOrderReply.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERDETAIL_FIELD_NUMBER = 3;
  private dev.tanpn.grpc.proto.OrderDetail orderDetail_;
  /**
   * <code>.OrderDetail orderDetail = 3;</code>
   */
  public boolean hasOrderDetail() {
    return orderDetail_ != null;
  }
  /**
   * <code>.OrderDetail orderDetail = 3;</code>
   */
  public dev.tanpn.grpc.proto.OrderDetail getOrderDetail() {
    return orderDetail_ == null ? dev.tanpn.grpc.proto.OrderDetail.getDefaultInstance() : orderDetail_;
  }
  /**
   * <code>.OrderDetail orderDetail = 3;</code>
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (orderDetail_ != null) {
      output.writeMessage(3, getOrderDetail());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (orderDetail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOrderDetail());
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
    if (!(obj instanceof dev.tanpn.grpc.proto.EnterOrderReply)) {
      return super.equals(obj);
    }
    dev.tanpn.grpc.proto.EnterOrderReply other = (dev.tanpn.grpc.proto.EnterOrderReply) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasOrderDetail()) {
      hash = (37 * hash) + ORDERDETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getOrderDetail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.tanpn.grpc.proto.EnterOrderReply parseFrom(
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
  public static Builder newBuilder(dev.tanpn.grpc.proto.EnterOrderReply prototype) {
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
   * Protobuf type {@code stock.EnterOrderReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stock.EnterOrderReply)
      dev.tanpn.grpc.proto.EnterOrderReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_EnterOrderReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_EnterOrderReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.tanpn.grpc.proto.EnterOrderReply.class, dev.tanpn.grpc.proto.EnterOrderReply.Builder.class);
    }

    // Construct using dev.tanpn.grpc.proto.EnterOrderReply.newBuilder()
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
      success_ = false;

      message_ = "";

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
      return dev.tanpn.grpc.proto.StockTradingSvc.internal_static_stock_EnterOrderReply_descriptor;
    }

    @java.lang.Override
    public dev.tanpn.grpc.proto.EnterOrderReply getDefaultInstanceForType() {
      return dev.tanpn.grpc.proto.EnterOrderReply.getDefaultInstance();
    }

    @java.lang.Override
    public dev.tanpn.grpc.proto.EnterOrderReply build() {
      dev.tanpn.grpc.proto.EnterOrderReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.tanpn.grpc.proto.EnterOrderReply buildPartial() {
      dev.tanpn.grpc.proto.EnterOrderReply result = new dev.tanpn.grpc.proto.EnterOrderReply(this);
      result.success_ = success_;
      result.message_ = message_;
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
      if (other instanceof dev.tanpn.grpc.proto.EnterOrderReply) {
        return mergeFrom((dev.tanpn.grpc.proto.EnterOrderReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.tanpn.grpc.proto.EnterOrderReply other) {
      if (other == dev.tanpn.grpc.proto.EnterOrderReply.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
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
      dev.tanpn.grpc.proto.EnterOrderReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.tanpn.grpc.proto.EnterOrderReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private dev.tanpn.grpc.proto.OrderDetail orderDetail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.tanpn.grpc.proto.OrderDetail, dev.tanpn.grpc.proto.OrderDetail.Builder, dev.tanpn.grpc.proto.OrderDetailOrBuilder> orderDetailBuilder_;
    /**
     * <code>.OrderDetail orderDetail = 3;</code>
     */
    public boolean hasOrderDetail() {
      return orderDetailBuilder_ != null || orderDetail_ != null;
    }
    /**
     * <code>.OrderDetail orderDetail = 3;</code>
     */
    public dev.tanpn.grpc.proto.OrderDetail getOrderDetail() {
      if (orderDetailBuilder_ == null) {
        return orderDetail_ == null ? dev.tanpn.grpc.proto.OrderDetail.getDefaultInstance() : orderDetail_;
      } else {
        return orderDetailBuilder_.getMessage();
      }
    }
    /**
     * <code>.OrderDetail orderDetail = 3;</code>
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
     * <code>.OrderDetail orderDetail = 3;</code>
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
     * <code>.OrderDetail orderDetail = 3;</code>
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
     * <code>.OrderDetail orderDetail = 3;</code>
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
     * <code>.OrderDetail orderDetail = 3;</code>
     */
    public dev.tanpn.grpc.proto.OrderDetail.Builder getOrderDetailBuilder() {
      
      onChanged();
      return getOrderDetailFieldBuilder().getBuilder();
    }
    /**
     * <code>.OrderDetail orderDetail = 3;</code>
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
     * <code>.OrderDetail orderDetail = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:stock.EnterOrderReply)
  }

  // @@protoc_insertion_point(class_scope:stock.EnterOrderReply)
  private static final dev.tanpn.grpc.proto.EnterOrderReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.tanpn.grpc.proto.EnterOrderReply();
  }

  public static dev.tanpn.grpc.proto.EnterOrderReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnterOrderReply>
      PARSER = new com.google.protobuf.AbstractParser<EnterOrderReply>() {
    @java.lang.Override
    public EnterOrderReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EnterOrderReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnterOrderReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnterOrderReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.tanpn.grpc.proto.EnterOrderReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

