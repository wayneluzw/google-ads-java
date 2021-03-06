// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_service.proto

package com.google.ads.googleads.v3.services;

public final class KeywordPlanServiceProto {
  private KeywordPlanServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetKeywordPlanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlansRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanCampaignForecast_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanCampaignForecast_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanAdGroupForecast_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanAdGroupForecast_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ForecastMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ForecastMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordHistoricalMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordHistoricalMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v3/services/keywo" +
      "rd_plan_service.proto\022 google.ads.google" +
      "ads.v3.services\0328google/ads/googleads/v3" +
      "/common/keyword_plan_common.proto\0324googl" +
      "e/ads/googleads/v3/resources/keyword_pla" +
      "n.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032 google/protobuf/field_m" +
      "ask.proto\032\036google/protobuf/wrappers.prot" +
      "o\032\027google/rpc/status.proto\"3\n\025GetKeyword" +
      "PlanRequest\022\032\n\rresource_name\030\001 \001(\tB\003\340A\002\"" +
      "\266\001\n\031MutateKeywordPlansRequest\022\030\n\013custome" +
      "r_id\030\001 \001(\tB\003\340A\002\022O\n\noperations\030\002 \003(\01326.go" +
      "ogle.ads.googleads.v3.services.KeywordPl" +
      "anOperationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(" +
      "\010\022\025\n\rvalidate_only\030\004 \001(\010\"\352\001\n\024KeywordPlan" +
      "Operation\022/\n\013update_mask\030\004 \001(\0132\032.google." +
      "protobuf.FieldMask\022@\n\006create\030\001 \001(\0132..goo" +
      "gle.ads.googleads.v3.resources.KeywordPl" +
      "anH\000\022@\n\006update\030\002 \001(\0132..google.ads.google" +
      "ads.v3.resources.KeywordPlanH\000\022\020\n\006remove" +
      "\030\003 \001(\tH\000B\013\n\toperation\"\234\001\n\032MutateKeywordP" +
      "lansResponse\0221\n\025partial_failure_error\030\003 " +
      "\001(\0132\022.google.rpc.Status\022K\n\007results\030\002 \003(\013" +
      "2:.google.ads.googleads.v3.services.Muta" +
      "teKeywordPlansResult\"1\n\030MutateKeywordPla" +
      "nsResult\022\025\n\rresource_name\030\001 \001(\t\";\n\036Gener" +
      "ateForecastMetricsRequest\022\031\n\014keyword_pla" +
      "n\030\001 \001(\tB\003\340A\002\"\257\002\n\037GenerateForecastMetrics" +
      "Response\022Y\n\022campaign_forecasts\030\001 \003(\0132=.g" +
      "oogle.ads.googleads.v3.services.KeywordP" +
      "lanCampaignForecast\022X\n\022ad_group_forecast" +
      "s\030\002 \003(\0132<.google.ads.googleads.v3.servic" +
      "es.KeywordPlanAdGroupForecast\022W\n\021keyword" +
      "_forecasts\030\003 \003(\0132<.google.ads.googleads." +
      "v3.services.KeywordPlanKeywordForecast\"\250" +
      "\001\n\033KeywordPlanCampaignForecast\022;\n\025keywor" +
      "d_plan_campaign\030\001 \001(\0132\034.google.protobuf." +
      "StringValue\022L\n\021campaign_forecast\030\002 \001(\01321" +
      ".google.ads.googleads.v3.services.Foreca" +
      "stMetrics\"\247\001\n\032KeywordPlanAdGroupForecast" +
      "\022;\n\025keyword_plan_ad_group\030\001 \001(\0132\034.google" +
      ".protobuf.StringValue\022L\n\021ad_group_foreca" +
      "st\030\002 \001(\01321.google.ads.googleads.v3.servi" +
      "ces.ForecastMetrics\"\256\001\n\032KeywordPlanKeywo" +
      "rdForecast\022C\n\035keyword_plan_ad_group_keyw" +
      "ord\030\001 \001(\0132\034.google.protobuf.StringValue\022" +
      "K\n\020keyword_forecast\030\002 \001(\01321.google.ads.g" +
      "oogleads.v3.services.ForecastMetrics\"\201\002\n" +
      "\017ForecastMetrics\0221\n\013impressions\030\001 \001(\0132\034." +
      "google.protobuf.DoubleValue\022)\n\003ctr\030\002 \001(\013" +
      "2\034.google.protobuf.DoubleValue\0220\n\013averag" +
      "e_cpc\030\003 \001(\0132\033.google.protobuf.Int64Value" +
      "\022,\n\006clicks\030\005 \001(\0132\034.google.protobuf.Doubl" +
      "eValue\0220\n\013cost_micros\030\006 \001(\0132\033.google.pro" +
      "tobuf.Int64Value\"=\n GenerateHistoricalMe" +
      "tricsRequest\022\031\n\014keyword_plan\030\001 \001(\tB\003\340A\002\"" +
      "{\n!GenerateHistoricalMetricsResponse\022V\n\007" +
      "metrics\030\001 \003(\0132E.google.ads.googleads.v3." +
      "services.KeywordPlanKeywordHistoricalMet" +
      "rics\"\260\001\n#KeywordPlanKeywordHistoricalMet" +
      "rics\0222\n\014search_query\030\001 \001(\0132\034.google.prot" +
      "obuf.StringValue\022U\n\017keyword_metrics\030\002 \001(" +
      "\0132<.google.ads.googleads.v3.common.Keywo" +
      "rdPlanHistoricalMetrics2\352\007\n\022KeywordPlanS" +
      "ervice\022\301\001\n\016GetKeywordPlan\0227.google.ads.g" +
      "oogleads.v3.services.GetKeywordPlanReque" +
      "st\032..google.ads.googleads.v3.resources.K" +
      "eywordPlan\"F\202\323\344\223\0020\022./v3/{resource_name=c" +
      "ustomers/*/keywordPlans/*}\332A\rresource_na" +
      "me\022\346\001\n\022MutateKeywordPlans\022;.google.ads.g" +
      "oogleads.v3.services.MutateKeywordPlansR" +
      "equest\032<.google.ads.googleads.v3.service" +
      "s.MutateKeywordPlansResponse\"U\202\323\344\223\0026\"1/v" +
      "3/customers/{customer_id=*}/keywordPlans" +
      ":mutate:\001*\332A\026customer_id,operations\022\377\001\n\027" +
      "GenerateForecastMetrics\022@.google.ads.goo" +
      "gleads.v3.services.GenerateForecastMetri" +
      "csRequest\032A.google.ads.googleads.v3.serv" +
      "ices.GenerateForecastMetricsResponse\"_\202\323" +
      "\344\223\002J\"E/v3/{keyword_plan=customers/*/keyw" +
      "ordPlans/*}:generateForecastMetrics:\001*\332A" +
      "\014keyword_plan\022\207\002\n\031GenerateHistoricalMetr" +
      "ics\022B.google.ads.googleads.v3.services.G" +
      "enerateHistoricalMetricsRequest\032C.google" +
      ".ads.googleads.v3.services.GenerateHisto" +
      "ricalMetricsResponse\"a\202\323\344\223\002L\"G/v3/{keywo" +
      "rd_plan=customers/*/keywordPlans/*}:gene" +
      "rateHistoricalMetrics:\001*\332A\014keyword_plan\032" +
      "\033\312A\030googleads.googleapis.comB\376\001\n$com.goo" +
      "gle.ads.googleads.v3.servicesB\027KeywordPl" +
      "anServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v3/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V3::Ser" +
      "vicesb\006proto3"
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
          com.google.ads.googleads.v3.common.KeywordPlanCommonProto.getDescriptor(),
          com.google.ads.googleads.v3.resources.KeywordPlanProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetKeywordPlanRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlansRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_KeywordPlanOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlansResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsRequest_descriptor,
        new java.lang.String[] { "KeywordPlan", });
    internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GenerateForecastMetricsResponse_descriptor,
        new java.lang.String[] { "CampaignForecasts", "AdGroupForecasts", "KeywordForecasts", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanCampaignForecast_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v3_services_KeywordPlanCampaignForecast_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanCampaignForecast_descriptor,
        new java.lang.String[] { "KeywordPlanCampaign", "CampaignForecast", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanAdGroupForecast_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v3_services_KeywordPlanAdGroupForecast_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanAdGroupForecast_descriptor,
        new java.lang.String[] { "KeywordPlanAdGroup", "AdGroupForecast", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_descriptor,
        new java.lang.String[] { "KeywordPlanAdGroupKeyword", "KeywordForecast", });
    internal_static_google_ads_googleads_v3_services_ForecastMetrics_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v3_services_ForecastMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ForecastMetrics_descriptor,
        new java.lang.String[] { "Impressions", "Ctr", "AverageCpc", "Clicks", "CostMicros", });
    internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsRequest_descriptor,
        new java.lang.String[] { "KeywordPlan", });
    internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GenerateHistoricalMetricsResponse_descriptor,
        new java.lang.String[] { "Metrics", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordHistoricalMetrics_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordHistoricalMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordHistoricalMetrics_descriptor,
        new java.lang.String[] { "SearchQuery", "KeywordMetrics", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.KeywordPlanCommonProto.getDescriptor();
    com.google.ads.googleads.v3.resources.KeywordPlanProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
