// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Represents the options for views of an intent.
 * An intent can be a sizable object. Therefore, we provide a resource view that
 * does not return training phrases in the response by default.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.v2beta1.IntentView}
 */
public enum IntentView
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Training phrases field is not populated in the response.
   * </pre>
   *
   * <code>INTENT_VIEW_UNSPECIFIED = 0;</code>
   */
  INTENT_VIEW_UNSPECIFIED(0),
  /**
   * <pre>
   * All fields are populated.
   * </pre>
   *
   * <code>INTENT_VIEW_FULL = 1;</code>
   */
  INTENT_VIEW_FULL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Training phrases field is not populated in the response.
   * </pre>
   *
   * <code>INTENT_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int INTENT_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * All fields are populated.
   * </pre>
   *
   * <code>INTENT_VIEW_FULL = 1;</code>
   */
  public static final int INTENT_VIEW_FULL_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static IntentView valueOf(int value) {
    return forNumber(value);
  }

  public static IntentView forNumber(int value) {
    switch (value) {
      case 0: return INTENT_VIEW_UNSPECIFIED;
      case 1: return INTENT_VIEW_FULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IntentView>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IntentView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IntentView>() {
          public IntentView findValueByNumber(int number) {
            return IntentView.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IntentView[] VALUES = values();

  public static IntentView valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IntentView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2beta1.IntentView)
}
