// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTrading.proto

package dev.tanpn.grpc.proto;

public interface EnterOrderReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stock.EnterOrderReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.OrderDetail orderDetail = 3;</code>
   */
  boolean hasOrderDetail();
  /**
   * <code>.OrderDetail orderDetail = 3;</code>
   */
  dev.tanpn.grpc.proto.OrderDetail getOrderDetail();
  /**
   * <code>.OrderDetail orderDetail = 3;</code>
   */
  dev.tanpn.grpc.proto.OrderDetailOrBuilder getOrderDetailOrBuilder();
}
