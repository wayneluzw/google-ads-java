// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/bidding.proto

package com.google.ads.googleads.v3.common;

public interface TargetCpaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.TargetCpa)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 1;</code>
   */
  boolean hasTargetCpaMicros();
  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 1;</code>
   */
  com.google.protobuf.Int64Value getTargetCpaMicros();
  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_cpa_micros = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTargetCpaMicrosOrBuilder();

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   */
  com.google.protobuf.Int64Value getCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder();

  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_floor_micros = 3;</code>
   */
  boolean hasCpcBidFloorMicros();
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_floor_micros = 3;</code>
   */
  com.google.protobuf.Int64Value getCpcBidFloorMicros();
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_floor_micros = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidFloorMicrosOrBuilder();
}
