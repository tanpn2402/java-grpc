// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockTrading.proto

package dev.tanpn.grpc.proto;

public final class StockTradingSvc {
  private StockTradingSvc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_EnterOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_EnterOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_EnterOrderReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_EnterOrderReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_CancelOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_CancelOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_CancelOrderReplyDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_CancelOrderReplyDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_CancelOrderReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_CancelOrderReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_OrderEnquiryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_OrderEnquiryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022StockTrading.proto\022\005stock\032\023common/comm" +
      "on.proto\"i\n\021EnterOrderRequest\022\020\n\010clientI" +
      "D\030\001 \001(\t\022\017\n\007stockID\030\002 \001(\t\022\020\n\010marketID\030\003 \001" +
      "(\t\022\020\n\010quantity\030\004 \001(\005\022\r\n\005price\030\005 \001(\001\"V\n\017E" +
      "nterOrderReply\022\017\n\007success\030\001 \001(\010\022\017\n\007messa" +
      "ge\030\002 \001(\t\022!\n\013orderDetail\030\003 \001(\0132\014.OrderDet" +
      "ail\"7\n\022CancelOrderRequest\022!\n\013orderDetail" +
      "\030\001 \001(\0132\014.OrderDetail\"]\n\026CancelOrderReply" +
      "Detail\022!\n\013orderDetail\030\001 \001(\0132\014.OrderDetai" +
      "l\022\017\n\007success\030\002 \001(\010\022\017\n\007message\030\003 \001(\t\"D\n\020C" +
      "ancelOrderReply\0220\n\tresponses\030\001 \003(\0132\035.sto" +
      "ck.CancelOrderReplyDetail\"J\n\023OrderEnquir" +
      "yRequest\022\020\n\010clientID\030\001 \001(\t\022\017\n\007stockID\030\002 " +
      "\001(\t\022\020\n\010marketID\030\003 \001(\t2\326\001\n\014StockTrading\022@" +
      "\n\nenterOrder\022\030.stock.EnterOrderRequest\032\026" +
      ".stock.EnterOrderReply\"\000\022F\n\014cancelOrders" +
      "\022\031.stock.CancelOrderRequest\032\027.stock.Canc" +
      "elOrderReply\"\000(\001\022<\n\014orderEnquiry\022\032.stock" +
      ".OrderEnquiryRequest\032\014.OrderDetail\"\0000\001B," +
      "\n\024dev.tanpn.grpc.protoB\017StockTradingSvcP" +
      "\001\242\002\000b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          dev.tanpn.grpc.proto.MessageStreaming.getDescriptor(),
        }, assigner);
    internal_static_stock_EnterOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stock_EnterOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_EnterOrderRequest_descriptor,
        new java.lang.String[] { "ClientID", "StockID", "MarketID", "Quantity", "Price", });
    internal_static_stock_EnterOrderReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stock_EnterOrderReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_EnterOrderReply_descriptor,
        new java.lang.String[] { "Success", "Message", "OrderDetail", });
    internal_static_stock_CancelOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stock_CancelOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_CancelOrderRequest_descriptor,
        new java.lang.String[] { "OrderDetail", });
    internal_static_stock_CancelOrderReplyDetail_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stock_CancelOrderReplyDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_CancelOrderReplyDetail_descriptor,
        new java.lang.String[] { "OrderDetail", "Success", "Message", });
    internal_static_stock_CancelOrderReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_stock_CancelOrderReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_CancelOrderReply_descriptor,
        new java.lang.String[] { "Responses", });
    internal_static_stock_OrderEnquiryRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_stock_OrderEnquiryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_OrderEnquiryRequest_descriptor,
        new java.lang.String[] { "ClientID", "StockID", "MarketID", });
    dev.tanpn.grpc.proto.MessageStreaming.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
