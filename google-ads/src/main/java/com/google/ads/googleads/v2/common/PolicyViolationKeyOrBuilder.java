// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/policy.proto

package com.google.ads.googleads.v2.common;

public interface PolicyViolationKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.PolicyViolationKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>.google.protobuf.StringValue policy_name = 1;</code>
   */
  boolean hasPolicyName();
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>.google.protobuf.StringValue policy_name = 1;</code>
   */
  com.google.protobuf.StringValue getPolicyName();
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>.google.protobuf.StringValue policy_name = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPolicyNameOrBuilder();

  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (e.g., when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue violating_text = 2;</code>
   */
  boolean hasViolatingText();
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (e.g., when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue violating_text = 2;</code>
   */
  com.google.protobuf.StringValue getViolatingText();
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (e.g., when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue violating_text = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getViolatingTextOrBuilder();
}
