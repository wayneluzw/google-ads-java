// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/mobile_device_constant.proto

package com.google.ads.googleads.v3.resources;

public final class MobileDeviceConstantProto {
  private MobileDeviceConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_MobileDeviceConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_MobileDeviceConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v3/resources/mobi" +
      "le_device_constant.proto\022!google.ads.goo" +
      "gleads.v3.resources\0326google/ads/googlead" +
      "s/v3/enums/mobile_device_type.proto\032\031goo" +
      "gle/api/resource.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\260\003\n\024MobileDeviceConstant\022\025\n\rresourc" +
      "e_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protob" +
      "uf.Int64Value\022*\n\004name\030\003 \001(\0132\034.google.pro" +
      "tobuf.StringValue\0227\n\021manufacturer_name\030\004" +
      " \001(\0132\034.google.protobuf.StringValue\022;\n\025op" +
      "erating_system_name\030\005 \001(\0132\034.google.proto" +
      "buf.StringValue\022R\n\004type\030\006 \001(\0162D.google.a" +
      "ds.googleads.v3.enums.MobileDeviceTypeEn" +
      "um.MobileDeviceType:b\352A_\n-googleads.goog" +
      "leapis.com/MobileDeviceConstant\022.mobileD" +
      "eviceConstants/{mobile_device_constant}B" +
      "\206\002\n%com.google.ads.googleads.v3.resource" +
      "sB\031MobileDeviceConstantProtoP\001ZJgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v3/resources;resources\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V3.Resources\312\002!Google\\Ad" +
      "s\\GoogleAds\\V3\\Resources\352\002%Google::Ads::" +
      "GoogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.MobileDeviceTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_MobileDeviceConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_MobileDeviceConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_MobileDeviceConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "ManufacturerName", "OperatingSystemName", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.MobileDeviceTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
