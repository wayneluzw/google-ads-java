// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v3.services;

public final class ConversionAdjustmentUploadServiceProto {
  private ConversionAdjustmentUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ConversionAdjustment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ConversionAdjustment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_RestatementValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_RestatementValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GclidDateTimePair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GclidDateTimePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v3/services/conve" +
      "rsion_adjustment_upload_service.proto\022 g" +
      "oogle.ads.googleads.v3.services\032>google/" +
      "ads/googleads/v3/enums/conversion_adjust" +
      "ment_type.proto\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\032\037google/a" +
      "pi/field_behavior.proto\032\036google/protobuf" +
      "/wrappers.proto\032\027google/rpc/status.proto" +
      "\"\313\001\n\"UploadConversionAdjustmentsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022[\n\026conversion_" +
      "adjustments\030\002 \003(\01326.google.ads.googleads" +
      ".v3.services.ConversionAdjustmentB\003\340A\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\"\247\001\n#UploadConversionAdjustmentsRe" +
      "sponse\0221\n\025partial_failure_error\030\001 \001(\0132\022." +
      "google.rpc.Status\022M\n\007results\030\002 \003(\0132<.goo" +
      "gle.ads.googleads.v3.services.Conversion" +
      "AdjustmentResult\"\351\003\n\024ConversionAdjustmen" +
      "t\0227\n\021conversion_action\030\003 \001(\0132\034.google.pr" +
      "otobuf.StringValue\022:\n\024adjustment_date_ti" +
      "me\030\004 \001(\0132\034.google.protobuf.StringValue\022m" +
      "\n\017adjustment_type\030\005 \001(\0162T.google.ads.goo" +
      "gleads.v3.enums.ConversionAdjustmentType" +
      "Enum.ConversionAdjustmentType\022M\n\021restate" +
      "ment_value\030\006 \001(\01322.google.ads.googleads." +
      "v3.services.RestatementValue\022S\n\024gclid_da" +
      "te_time_pair\030\001 \001(\01323.google.ads.googlead" +
      "s.v3.services.GclidDateTimePairH\000\0220\n\010ord" +
      "er_id\030\002 \001(\0132\034.google.protobuf.StringValu" +
      "eH\000B\027\n\025conversion_identifier\"}\n\020Restatem" +
      "entValue\0224\n\016adjusted_value\030\001 \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\0223\n\rcurrency_code\030" +
      "\002 \001(\0132\034.google.protobuf.StringValue\"|\n\021G" +
      "clidDateTimePair\022+\n\005gclid\030\001 \001(\0132\034.google" +
      ".protobuf.StringValue\022:\n\024conversion_date" +
      "_time\030\002 \001(\0132\034.google.protobuf.StringValu" +
      "e\"\240\003\n\032ConversionAdjustmentResult\0227\n\021conv" +
      "ersion_action\030\003 \001(\0132\034.google.protobuf.St" +
      "ringValue\022:\n\024adjustment_date_time\030\004 \001(\0132" +
      "\034.google.protobuf.StringValue\022m\n\017adjustm" +
      "ent_type\030\005 \001(\0162T.google.ads.googleads.v3" +
      ".enums.ConversionAdjustmentTypeEnum.Conv" +
      "ersionAdjustmentType\022S\n\024gclid_date_time_" +
      "pair\030\001 \001(\01323.google.ads.googleads.v3.ser" +
      "vices.GclidDateTimePairH\000\0220\n\010order_id\030\002 " +
      "\001(\0132\034.google.protobuf.StringValueH\000B\027\n\025c" +
      "onversion_identifier2\330\002\n!ConversionAdjus" +
      "tmentUploadService\022\225\002\n\033UploadConversionA" +
      "djustments\022D.google.ads.googleads.v3.ser" +
      "vices.UploadConversionAdjustmentsRequest" +
      "\032E.google.ads.googleads.v3.services.Uplo" +
      "adConversionAdjustmentsResponse\"i\202\323\344\223\002>\"" +
      "9/v3/customers/{customer_id=*}:uploadCon" +
      "versionAdjustments:\001*\332A\"customer_id,conv" +
      "ersion_adjustments\032\033\312A\030googleads.googlea" +
      "pis.comB\215\002\n$com.google.ads.googleads.v3." +
      "servicesB&ConversionAdjustmentUploadServ" +
      "iceProtoP\001ZHgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v3/services;serv" +
      "ices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Ser" +
      "vices\312\002 Google\\Ads\\GoogleAds\\V3\\Services" +
      "\352\002$Google::Ads::GoogleAds::V3::Servicesb" +
      "\006proto3"
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
          com.google.ads.googleads.v3.enums.ConversionAdjustmentTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "ConversionAdjustments", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_UploadConversionAdjustmentsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_ConversionAdjustment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_ConversionAdjustment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ConversionAdjustment_descriptor,
        new java.lang.String[] { "ConversionAction", "AdjustmentDateTime", "AdjustmentType", "RestatementValue", "GclidDateTimePair", "OrderId", "ConversionIdentifier", });
    internal_static_google_ads_googleads_v3_services_RestatementValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_RestatementValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_RestatementValue_descriptor,
        new java.lang.String[] { "AdjustedValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v3_services_GclidDateTimePair_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_GclidDateTimePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GclidDateTimePair_descriptor,
        new java.lang.String[] { "Gclid", "ConversionDateTime", });
    internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_ConversionAdjustmentResult_descriptor,
        new java.lang.String[] { "ConversionAction", "AdjustmentDateTime", "AdjustmentType", "GclidDateTimePair", "OrderId", "ConversionIdentifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.ConversionAdjustmentTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
