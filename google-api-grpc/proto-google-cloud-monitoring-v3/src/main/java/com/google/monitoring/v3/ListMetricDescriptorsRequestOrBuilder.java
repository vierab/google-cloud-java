// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface ListMetricDescriptorsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListMetricDescriptorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project on which to execute the request. The format is
   * `"projects/{project_id_or_number}"`.
   * </pre>
   *
   * <code>string name = 5;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The project on which to execute the request. The format is
   * `"projects/{project_id_or_number}"`.
   * </pre>
   *
   * <code>string name = 5;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If this field is empty, all custom and
   * system-defined metric descriptors are returned.
   * Otherwise, the [filter](/monitoring/api/v3/filters)
   * specifies which metric descriptors are to be
   * returned. For example, the following filter matches all
   * [custom metrics](/monitoring/custom-metrics):
   *     metric.type = starts_with("custom.googleapis.com/")
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * If this field is empty, all custom and
   * system-defined metric descriptors are returned.
   * Otherwise, the [filter](/monitoring/api/v3/filters)
   * specifies which metric descriptors are to be
   * returned. For example, the following filter matches all
   * [custom metrics](/monitoring/custom-metrics):
   *     metric.type = starts_with("custom.googleapis.com/")
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * A positive number that is the maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}