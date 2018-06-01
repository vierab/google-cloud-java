// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public final class SpeechProto {
  private SpeechProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_WordInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/speech/v1/cloud_speech.pr" +
      "oto\022\026google.cloud.speech.v1\032\034google/api/" +
      "annotations.proto\032#google/longrunning/op" +
      "erations.proto\032\031google/protobuf/any.prot" +
      "o\032\036google/protobuf/duration.proto\032\037googl" +
      "e/protobuf/timestamp.proto\032\027google/rpc/s" +
      "tatus.proto\"\206\001\n\020RecognizeRequest\0229\n\006conf" +
      "ig\030\001 \001(\0132).google.cloud.speech.v1.Recogn" +
      "itionConfig\0227\n\005audio\030\002 \001(\0132(.google.clou" +
      "d.speech.v1.RecognitionAudio\"\221\001\n\033LongRun",
      "ningRecognizeRequest\0229\n\006config\030\001 \001(\0132).g" +
      "oogle.cloud.speech.v1.RecognitionConfig\022" +
      "7\n\005audio\030\002 \001(\0132(.google.cloud.speech.v1." +
      "RecognitionAudio\"\231\001\n\031StreamingRecognizeR" +
      "equest\022N\n\020streaming_config\030\001 \001(\01322.googl" +
      "e.cloud.speech.v1.StreamingRecognitionCo" +
      "nfigH\000\022\027\n\raudio_content\030\002 \001(\014H\000B\023\n\021strea" +
      "ming_request\"\212\001\n\032StreamingRecognitionCon" +
      "fig\0229\n\006config\030\001 \001(\0132).google.cloud.speec" +
      "h.v1.RecognitionConfig\022\030\n\020single_utteran",
      "ce\030\002 \001(\010\022\027\n\017interim_results\030\003 \001(\010\"\264\003\n\021Re" +
      "cognitionConfig\022I\n\010encoding\030\001 \001(\01627.goog" +
      "le.cloud.speech.v1.RecognitionConfig.Aud" +
      "ioEncoding\022\031\n\021sample_rate_hertz\030\002 \001(\005\022\025\n" +
      "\rlanguage_code\030\003 \001(\t\022\030\n\020max_alternatives" +
      "\030\004 \001(\005\022\030\n\020profanity_filter\030\005 \001(\010\022>\n\017spee" +
      "ch_contexts\030\006 \003(\0132%.google.cloud.speech." +
      "v1.SpeechContext\022 \n\030enable_word_time_off" +
      "sets\030\010 \001(\010\"\213\001\n\rAudioEncoding\022\030\n\024ENCODING" +
      "_UNSPECIFIED\020\000\022\014\n\010LINEAR16\020\001\022\010\n\004FLAC\020\002\022\t",
      "\n\005MULAW\020\003\022\007\n\003AMR\020\004\022\n\n\006AMR_WB\020\005\022\014\n\010OGG_OP" +
      "US\020\006\022\032\n\026SPEEX_WITH_HEADER_BYTE\020\007\" \n\rSpee" +
      "chContext\022\017\n\007phrases\030\001 \003(\t\"D\n\020Recognitio" +
      "nAudio\022\021\n\007content\030\001 \001(\014H\000\022\r\n\003uri\030\002 \001(\tH\000" +
      "B\016\n\014audio_source\"U\n\021RecognizeResponse\022@\n" +
      "\007results\030\002 \003(\0132/.google.cloud.speech.v1." +
      "SpeechRecognitionResult\"`\n\034LongRunningRe" +
      "cognizeResponse\022@\n\007results\030\002 \003(\0132/.googl" +
      "e.cloud.speech.v1.SpeechRecognitionResul" +
      "t\"\236\001\n\034LongRunningRecognizeMetadata\022\030\n\020pr",
      "ogress_percent\030\001 \001(\005\022.\n\nstart_time\030\002 \001(\013" +
      "2\032.google.protobuf.Timestamp\0224\n\020last_upd" +
      "ate_time\030\003 \001(\0132\032.google.protobuf.Timesta" +
      "mp\"\261\002\n\032StreamingRecognizeResponse\022!\n\005err" +
      "or\030\001 \001(\0132\022.google.rpc.Status\022C\n\007results\030" +
      "\002 \003(\01322.google.cloud.speech.v1.Streaming" +
      "RecognitionResult\022]\n\021speech_event_type\030\004" +
      " \001(\0162B.google.cloud.speech.v1.StreamingR" +
      "ecognizeResponse.SpeechEventType\"L\n\017Spee" +
      "chEventType\022\034\n\030SPEECH_EVENT_UNSPECIFIED\020",
      "\000\022\033\n\027END_OF_SINGLE_UTTERANCE\020\001\"\215\001\n\032Strea" +
      "mingRecognitionResult\022J\n\014alternatives\030\001 " +
      "\003(\01324.google.cloud.speech.v1.SpeechRecog" +
      "nitionAlternative\022\020\n\010is_final\030\002 \001(\010\022\021\n\ts" +
      "tability\030\003 \001(\002\"e\n\027SpeechRecognitionResul" +
      "t\022J\n\014alternatives\030\001 \003(\01324.google.cloud.s" +
      "peech.v1.SpeechRecognitionAlternative\"w\n" +
      "\034SpeechRecognitionAlternative\022\022\n\ntranscr" +
      "ipt\030\001 \001(\t\022\022\n\nconfidence\030\002 \001(\002\022/\n\005words\030\003" +
      " \003(\0132 .google.cloud.speech.v1.WordInfo\"t",
      "\n\010WordInfo\022-\n\nstart_time\030\001 \001(\0132\031.google." +
      "protobuf.Duration\022+\n\010end_time\030\002 \001(\0132\031.go" +
      "ogle.protobuf.Duration\022\014\n\004word\030\003 \001(\t2\246\003\n" +
      "\006Speech\022\201\001\n\tRecognize\022(.google.cloud.spe" +
      "ech.v1.RecognizeRequest\032).google.cloud.s" +
      "peech.v1.RecognizeResponse\"\037\202\323\344\223\002\031\"\024/v1/" +
      "speech:recognize:\001*\022\226\001\n\024LongRunningRecog" +
      "nize\0223.google.cloud.speech.v1.LongRunnin" +
      "gRecognizeRequest\032\035.google.longrunning.O" +
      "peration\"*\202\323\344\223\002$\"\037/v1/speech:longrunning",
      "recognize:\001*\022\177\n\022StreamingRecognize\0221.goo" +
      "gle.cloud.speech.v1.StreamingRecognizeRe" +
      "quest\0322.google.cloud.speech.v1.Streaming" +
      "RecognizeResponse(\0010\001Bl\n\032com.google.clou" +
      "d.speech.v1B\013SpeechProtoP\001Z<google.golan" +
      "g.org/genproto/googleapis/cloud/speech/v" +
      "1;speech\370\001\001b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor,
        new java.lang.String[] { "Config", "Audio", });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor,
        new java.lang.String[] { "Config", "Audio", });
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor,
        new java.lang.String[] { "StreamingConfig", "AudioContent", "StreamingRequest", });
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor,
        new java.lang.String[] { "Config", "SingleUtterance", "InterimResults", });
    internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor,
        new java.lang.String[] { "Encoding", "SampleRateHertz", "LanguageCode", "MaxAlternatives", "ProfanityFilter", "SpeechContexts", "EnableWordTimeOffsets", });
    internal_static_google_cloud_speech_v1_SpeechContext_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1_SpeechContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechContext_descriptor,
        new java.lang.String[] { "Phrases", });
    internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1_RecognitionAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor,
        new java.lang.String[] { "Content", "Uri", "AudioSource", });
    internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1_RecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", "StartTime", "LastUpdateTime", });
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor,
        new java.lang.String[] { "Error", "Results", "SpeechEventType", });
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor,
        new java.lang.String[] { "Alternatives", "IsFinal", "Stability", });
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor,
        new java.lang.String[] { "Alternatives", });
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor,
        new java.lang.String[] { "Transcript", "Confidence", "Words", });
    internal_static_google_cloud_speech_v1_WordInfo_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_WordInfo_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Word", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}