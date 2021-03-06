// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public interface AgentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Agent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of this agent.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of this agent.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The default language of the agent as a language tag. See
   * [Language Support](https://dialogflow.com/docs/reference/language) for a
   * list of the currently supported language codes.
   * This field cannot be set by the `Update` method.
   * </pre>
   *
   * <code>string default_language_code = 3;</code>
   */
  java.lang.String getDefaultLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The default language of the agent as a language tag. See
   * [Language Support](https://dialogflow.com/docs/reference/language) for a
   * list of the currently supported language codes.
   * This field cannot be set by the `Update` method.
   * </pre>
   *
   * <code>string default_language_code = 3;</code>
   */
  com.google.protobuf.ByteString getDefaultLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   */
  java.util.List<java.lang.String> getSupportedLanguageCodesList();
  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   */
  int getSupportedLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   */
  java.lang.String getSupportedLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4;</code>
   */
  com.google.protobuf.ByteString getSupportedLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The time zone of this agent from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris.
   * </pre>
   *
   * <code>string time_zone = 5;</code>
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Required. The time zone of this agent from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris.
   * </pre>
   *
   * <code>string time_zone = 5;</code>
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of this agent.
   * The maximum length is 500 characters. If exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of this agent.
   * The maximum length is 500 characters. If exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the agent's avatar.
   * Avatars are used throughout the Dialogflow console and in the self-hosted
   * [Web Demo](https://dialogflow.com/docs/integrations/web-demo) integration.
   * </pre>
   *
   * <code>string avatar_uri = 7;</code>
   */
  java.lang.String getAvatarUri();
  /**
   *
   *
   * <pre>
   * Optional. The URI of the agent's avatar.
   * Avatars are used throughout the Dialogflow console and in the self-hosted
   * [Web Demo](https://dialogflow.com/docs/integrations/web-demo) integration.
   * </pre>
   *
   * <code>string avatar_uri = 7;</code>
   */
  com.google.protobuf.ByteString getAvatarUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Determines whether this agent should log conversation queries.
   * </pre>
   *
   * <code>bool enable_logging = 8;</code>
   */
  boolean getEnableLogging();

  /**
   *
   *
   * <pre>
   * Optional. Determines how intents are detected from user queries.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Agent.MatchMode match_mode = 9;</code>
   */
  int getMatchModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Determines how intents are detected from user queries.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Agent.MatchMode match_mode = 9;</code>
   */
  com.google.cloud.dialogflow.v2.Agent.MatchMode getMatchMode();

  /**
   *
   *
   * <pre>
   * Optional. To filter out false positive results and still get variety in
   * matched natural language inputs for your agent, you can tune the machine
   * learning classification threshold. If the returned score value is less than
   * the threshold value, then a fallback intent is be triggered or, if there
   * are no fallback intents defined, no intent will be triggered. The score
   * values range from 0.0 (completely uncertain) to 1.0 (completely certain).
   * If set to 0.0, the default of 0.3 is used.
   * </pre>
   *
   * <code>float classification_threshold = 10;</code>
   */
  float getClassificationThreshold();
}
