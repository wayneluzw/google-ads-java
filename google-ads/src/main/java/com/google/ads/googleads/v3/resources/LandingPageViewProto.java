// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/landing_page_view.proto

package com.google.ads.googleads.v3.resources;

public final class LandingPageViewProto {
  private LandingPageViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_LandingPageView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_LandingPageView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v3/resources/land" +
      "ing_page_view.proto\022!google.ads.googlead" +
      "s.v3.resources\032\031google/api/resource.prot" +
      "o\032\036google/protobuf/wrappers.proto\032\034googl" +
      "e/api/annotations.proto\"\316\001\n\017LandingPageV" +
      "iew\022\025\n\rresource_name\030\001 \001(\t\022:\n\024unexpanded" +
      "_final_url\030\002 \001(\0132\034.google.protobuf.Strin" +
      "gValue:h\352Ae\n(googleads.googleapis.com/La" +
      "ndingPageView\0229customers/{customer}/land" +
      "ingPageViews/{landing_page_view}B\201\002\n%com" +
      ".google.ads.googleads.v3.resourcesB\024Land" +
      "ingPageViewProtoP\001ZJgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v3/resou" +
      "rces;resources\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V3.Resources\312\002!Google\\Ads\\GoogleAds\\" +
      "V3\\Resources\352\002%Google::Ads::GoogleAds::V" +
      "3::Resourcesb\006proto3"
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
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_LandingPageView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_LandingPageView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_LandingPageView_descriptor,
        new java.lang.String[] { "ResourceName", "UnexpandedFinalUrl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
