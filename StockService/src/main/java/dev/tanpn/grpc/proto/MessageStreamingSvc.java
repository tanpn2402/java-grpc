// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageStreaming.proto

package dev.tanpn.grpc.proto;

public final class MessageStreamingSvc {
  private MessageStreamingSvc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_MessageDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_MessageDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MessageStreaming.proto\022\005stock\"2\n\rMessa" +
      "geDetail\022\023\n\013messageType\030\001 \001(\t\022\014\n\004data\030\002 " +
      "\001(\t2V\n\020MessageStreaming\022B\n\020messageStream" +
      "ing\022\024.stock.MessageDetail\032\024.stock.Messag" +
      "eDetail\"\000(\001B0\n\024dev.tanpn.grpc.protoB\023Mes" +
      "sageStreamingSvcP\001\242\002\000b\006proto3"
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
        }, assigner);
    internal_static_stock_MessageDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stock_MessageDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_MessageDetail_descriptor,
        new java.lang.String[] { "MessageType", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
