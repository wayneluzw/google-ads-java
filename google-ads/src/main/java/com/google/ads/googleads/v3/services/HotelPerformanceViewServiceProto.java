// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/hotel_performance_view_service.proto

package com.google.ads.googleads.v3.services;

public final class HotelPerformanceViewServiceProto {
  private HotelPerformanceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v3/services/hotel" +
      "_performance_view_service.proto\022 google." +
      "ads.googleads.v3.services\032>google/ads/go" +
      "ogleads/v3/resources/hotel_performance_v" +
      "iew.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\"<\n\036GetHotelPerformance" +
      "ViewRequest\022\032\n\rresource_name\030\001 \001(\tB\003\340A\0022" +
      "\237\002\n\033HotelPerformanceViewService\022\342\001\n\027GetH" +
      "otelPerformanceView\022@.google.ads.googlea" +
      "ds.v3.services.GetHotelPerformanceViewRe" +
      "quest\0327.google.ads.googleads.v3.resource" +
      "s.HotelPerformanceView\"L\202\323\344\223\0026\0224/v3/{res" +
      "ource_name=customers/*/hotelPerformanceV" +
      "iew}\332A\rresource_name\032\033\312A\030googleads.googl" +
      "eapis.comB\207\002\n$com.google.ads.googleads.v" +
      "3.servicesB HotelPerformanceViewServiceP" +
      "rotoP\001ZHgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v3/services;services" +
      "\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Service" +
      "s\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$G" +
      "oogle::Ads::GoogleAds::V3::Servicesb\006pro" +
      "to3"
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
          com.google.ads.googleads.v3.resources.HotelPerformanceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetHotelPerformanceViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.HotelPerformanceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
