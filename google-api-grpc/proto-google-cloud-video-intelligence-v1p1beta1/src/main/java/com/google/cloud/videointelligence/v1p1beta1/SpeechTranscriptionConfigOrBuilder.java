// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface SpeechTranscriptionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.SpeechTranscriptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Required* The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language Support](https://cloud.google.com/speech/docs/languages)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * *Required* The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language Support](https://cloud.google.com/speech/docs/languages)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * *Optional* Maximum number of recognition hypotheses to be returned.
   * Specifically, the maximum number of `SpeechRecognitionAlternative` messages
   * within each `SpeechRecognitionResult`. The server may return fewer than
   * `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1` will
   * return a maximum of one. If omitted, will return a maximum of one.
   * </pre>
   *
   * <code>int32 max_alternatives = 2;</code>
   */
  int getMaxAlternatives();

  /**
   * <pre>
   * *Optional* If set to `true`, the server will attempt to filter out
   * profanities, replacing all but the initial character in each filtered word
   * with asterisks, e.g. "f***". If set to `false` or omitted, profanities
   * won't be filtered out.
   * </pre>
   *
   * <code>bool filter_profanity = 3;</code>
   */
  boolean getFilterProfanity();

  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechContext speech_contexts = 4;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechContext> 
      getSpeechContextsList();
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechContext speech_contexts = 4;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.SpeechContext getSpeechContexts(int index);
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechContext speech_contexts = 4;</code>
   */
  int getSpeechContextsCount();
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechContext speech_contexts = 4;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.SpeechContextOrBuilder> 
      getSpeechContextsOrBuilderList();
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechContext speech_contexts = 4;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.SpeechContextOrBuilder getSpeechContextsOrBuilder(
      int index);

  /**
   * <pre>
   * *Optional* If 'true', adds punctuation to recognition result hypotheses.
   * This feature is only available in select languages. Setting this for
   * requests in other languages has no effect at all. The default 'false' value
   * does not add punctuation to result hypotheses. NOTE: "This is currently
   * offered as an experimental service, complimentary to all users. In the
   * future this may be exclusively available as a premium feature."
   * </pre>
   *
   * <code>bool enable_automatic_punctuation = 5;</code>
   */
  boolean getEnableAutomaticPunctuation();

  /**
   * <pre>
   * *Optional* For file formats, such as MXF or MKV, supporting multiple audio
   * tracks, specify up to two tracks. Default: track 0.
   * </pre>
   *
   * <code>repeated int32 audio_tracks = 6;</code>
   */
  java.util.List<java.lang.Integer> getAudioTracksList();
  /**
   * <pre>
   * *Optional* For file formats, such as MXF or MKV, supporting multiple audio
   * tracks, specify up to two tracks. Default: track 0.
   * </pre>
   *
   * <code>repeated int32 audio_tracks = 6;</code>
   */
  int getAudioTracksCount();
  /**
   * <pre>
   * *Optional* For file formats, such as MXF or MKV, supporting multiple audio
   * tracks, specify up to two tracks. Default: track 0.
   * </pre>
   *
   * <code>repeated int32 audio_tracks = 6;</code>
   */
  int getAudioTracks(int index);
}
