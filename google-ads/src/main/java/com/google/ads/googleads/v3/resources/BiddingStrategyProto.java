// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/bidding_strategy.proto

package com.google.ads.googleads.v3.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v3/resources/bidd" +
      "ing_strategy.proto\022!google.ads.googleads" +
      ".v3.resources\032,google/ads/googleads/v3/c" +
      "ommon/bidding.proto\032;google/ads/googlead" +
      "s/v3/enums/bidding_strategy_status.proto" +
      "\0329google/ads/googleads/v3/enums/bidding_" +
      "strategy_type.proto\032\031google/api/resource" +
      ".proto\032\036google/protobuf/wrappers.proto\032\034" +
      "google/api/annotations.proto\"\211\007\n\017Bidding" +
      "Strategy\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\003 " +
      "\001(\0132\033.google.protobuf.Int64Value\022*\n\004name" +
      "\030\004 \001(\0132\034.google.protobuf.StringValue\022^\n\006" +
      "status\030\017 \001(\0162N.google.ads.googleads.v3.e" +
      "nums.BiddingStrategyStatusEnum.BiddingSt" +
      "rategyStatus\022X\n\004type\030\005 \001(\0162J.google.ads." +
      "googleads.v3.enums.BiddingStrategyTypeEn" +
      "um.BiddingStrategyType\0223\n\016campaign_count" +
      "\030\r \001(\0132\033.google.protobuf.Int64Value\022?\n\032n" +
      "on_removed_campaign_count\030\016 \001(\0132\033.google" +
      ".protobuf.Int64Value\022C\n\014enhanced_cpc\030\007 \001" +
      "(\0132+.google.ads.googleads.v3.common.Enha" +
      "ncedCpcH\000\022?\n\ntarget_cpa\030\t \001(\0132).google.a" +
      "ds.googleads.v3.common.TargetCpaH\000\022X\n\027ta" +
      "rget_impression_share\0300 \001(\01325.google.ads" +
      ".googleads.v3.common.TargetImpressionSha" +
      "reH\000\022A\n\013target_roas\030\013 \001(\0132*.google.ads.g" +
      "oogleads.v3.common.TargetRoasH\000\022C\n\014targe" +
      "t_spend\030\014 \001(\0132+.google.ads.googleads.v3." +
      "common.TargetSpendH\000:h\352Ae\n(googleads.goo" +
      "gleapis.com/BiddingStrategy\0229customers/{" +
      "customer}/biddingStrategies/{bidding_str" +
      "ategy}B\010\n\006schemeB\201\002\n%com.google.ads.goog" +
      "leads.v3.resourcesB\024BiddingStrategyProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v3/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V3.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V3::Resourcesb\006pr" +
      "oto3"
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
          com.google.ads.googleads.v3.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.BiddingStrategyStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "CampaignCount", "NonRemovedCampaignCount", "EnhancedCpc", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "Scheme", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v3.enums.BiddingStrategyStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
