// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

public final class ErrorReport extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ANDROID_VERSION = "";
  public static final String DEFAULT_PHONE_MODEL = "";
  public static final String DEFAULT_PACKAGE_NAME = "";
  public static final String DEFAULT_APP_VERSION = "";
  public static final String DEFAULT_STACK_TRACE = "";
  public static final String DEFAULT_MESSAGE = "";
  public static final Long DEFAULT_REPORT_TIME = 0L;
  public static final Integer DEFAULT_EMPIRE_ID = 0;
  public static final String DEFAULT_CONTEXT = "";
  public static final String DEFAULT_EXCEPTION_CLASS = "";
  public static final Long DEFAULT_HEAP_SIZE = 0L;
  public static final Long DEFAULT_HEAP_ALLOCATED = 0L;
  public static final Long DEFAULT_HEAP_FREE = 0L;
  public static final Long DEFAULT_TOTAL_RUN_TIME = 0L;
  public static final Long DEFAULT_FOREGROUND_RUN_TIME = 0L;
  public static final String DEFAULT_LOG_OUTPUT = "";
  public static final String DEFAULT_SERVER_REQUEST_QS = "";
  public static final String DEFAULT_SERVER_REQUEST_USER_AGENT = "";

  @ProtoField(tag = 1, type = STRING)
  public final String android_version;

  @ProtoField(tag = 2, type = STRING)
  public final String phone_model;

  @ProtoField(tag = 3, type = STRING)
  public final String package_name;

  @ProtoField(tag = 4, type = STRING)
  public final String app_version;

  @ProtoField(tag = 5, type = STRING)
  public final String stack_trace;

  @ProtoField(tag = 6, type = STRING)
  public final String message;

  @ProtoField(tag = 7, type = INT64)
  public final Long report_time;

  @ProtoField(tag = 8, type = INT32)
  public final Integer empire_id;

  @ProtoField(tag = 9, type = STRING)
  public final String context;

  @ProtoField(tag = 10, type = STRING)
  public final String exception_class;

  @ProtoField(tag = 11, type = INT64)
  public final Long heap_size;

  @ProtoField(tag = 12, type = INT64)
  public final Long heap_allocated;

  @ProtoField(tag = 13, type = INT64)
  public final Long heap_free;

  @ProtoField(tag = 14, type = INT64)
  public final Long total_run_time;

  @ProtoField(tag = 15, type = INT64)
  public final Long foreground_run_time;

  @ProtoField(tag = 16, type = STRING)
  public final String log_output;

  @ProtoField(tag = 17, type = STRING)
  public final String server_request_qs;

  @ProtoField(tag = 18, type = STRING)
  public final String server_request_user_agent;

  public ErrorReport(String android_version, String phone_model, String package_name, String app_version, String stack_trace, String message, Long report_time, Integer empire_id, String context, String exception_class, Long heap_size, Long heap_allocated, Long heap_free, Long total_run_time, Long foreground_run_time, String log_output, String server_request_qs, String server_request_user_agent) {
    this.android_version = android_version;
    this.phone_model = phone_model;
    this.package_name = package_name;
    this.app_version = app_version;
    this.stack_trace = stack_trace;
    this.message = message;
    this.report_time = report_time;
    this.empire_id = empire_id;
    this.context = context;
    this.exception_class = exception_class;
    this.heap_size = heap_size;
    this.heap_allocated = heap_allocated;
    this.heap_free = heap_free;
    this.total_run_time = total_run_time;
    this.foreground_run_time = foreground_run_time;
    this.log_output = log_output;
    this.server_request_qs = server_request_qs;
    this.server_request_user_agent = server_request_user_agent;
  }

  private ErrorReport(Builder builder) {
    this(builder.android_version, builder.phone_model, builder.package_name, builder.app_version, builder.stack_trace, builder.message, builder.report_time, builder.empire_id, builder.context, builder.exception_class, builder.heap_size, builder.heap_allocated, builder.heap_free, builder.total_run_time, builder.foreground_run_time, builder.log_output, builder.server_request_qs, builder.server_request_user_agent);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ErrorReport)) return false;
    ErrorReport o = (ErrorReport) other;
    return equals(android_version, o.android_version)
        && equals(phone_model, o.phone_model)
        && equals(package_name, o.package_name)
        && equals(app_version, o.app_version)
        && equals(stack_trace, o.stack_trace)
        && equals(message, o.message)
        && equals(report_time, o.report_time)
        && equals(empire_id, o.empire_id)
        && equals(context, o.context)
        && equals(exception_class, o.exception_class)
        && equals(heap_size, o.heap_size)
        && equals(heap_allocated, o.heap_allocated)
        && equals(heap_free, o.heap_free)
        && equals(total_run_time, o.total_run_time)
        && equals(foreground_run_time, o.foreground_run_time)
        && equals(log_output, o.log_output)
        && equals(server_request_qs, o.server_request_qs)
        && equals(server_request_user_agent, o.server_request_user_agent);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = android_version != null ? android_version.hashCode() : 0;
      result = result * 37 + (phone_model != null ? phone_model.hashCode() : 0);
      result = result * 37 + (package_name != null ? package_name.hashCode() : 0);
      result = result * 37 + (app_version != null ? app_version.hashCode() : 0);
      result = result * 37 + (stack_trace != null ? stack_trace.hashCode() : 0);
      result = result * 37 + (message != null ? message.hashCode() : 0);
      result = result * 37 + (report_time != null ? report_time.hashCode() : 0);
      result = result * 37 + (empire_id != null ? empire_id.hashCode() : 0);
      result = result * 37 + (context != null ? context.hashCode() : 0);
      result = result * 37 + (exception_class != null ? exception_class.hashCode() : 0);
      result = result * 37 + (heap_size != null ? heap_size.hashCode() : 0);
      result = result * 37 + (heap_allocated != null ? heap_allocated.hashCode() : 0);
      result = result * 37 + (heap_free != null ? heap_free.hashCode() : 0);
      result = result * 37 + (total_run_time != null ? total_run_time.hashCode() : 0);
      result = result * 37 + (foreground_run_time != null ? foreground_run_time.hashCode() : 0);
      result = result * 37 + (log_output != null ? log_output.hashCode() : 0);
      result = result * 37 + (server_request_qs != null ? server_request_qs.hashCode() : 0);
      result = result * 37 + (server_request_user_agent != null ? server_request_user_agent.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ErrorReport> {

    public String android_version;
    public String phone_model;
    public String package_name;
    public String app_version;
    public String stack_trace;
    public String message;
    public Long report_time;
    public Integer empire_id;
    public String context;
    public String exception_class;
    public Long heap_size;
    public Long heap_allocated;
    public Long heap_free;
    public Long total_run_time;
    public Long foreground_run_time;
    public String log_output;
    public String server_request_qs;
    public String server_request_user_agent;

    public Builder() {
    }

    public Builder(ErrorReport message) {
      super(message);
      if (message == null) return;
      this.android_version = message.android_version;
      this.phone_model = message.phone_model;
      this.package_name = message.package_name;
      this.app_version = message.app_version;
      this.stack_trace = message.stack_trace;
      this.message = message.message;
      this.report_time = message.report_time;
      this.empire_id = message.empire_id;
      this.context = message.context;
      this.exception_class = message.exception_class;
      this.heap_size = message.heap_size;
      this.heap_allocated = message.heap_allocated;
      this.heap_free = message.heap_free;
      this.total_run_time = message.total_run_time;
      this.foreground_run_time = message.foreground_run_time;
      this.log_output = message.log_output;
      this.server_request_qs = message.server_request_qs;
      this.server_request_user_agent = message.server_request_user_agent;
    }

    public Builder android_version(String android_version) {
      this.android_version = android_version;
      return this;
    }

    public Builder phone_model(String phone_model) {
      this.phone_model = phone_model;
      return this;
    }

    public Builder package_name(String package_name) {
      this.package_name = package_name;
      return this;
    }

    public Builder app_version(String app_version) {
      this.app_version = app_version;
      return this;
    }

    public Builder stack_trace(String stack_trace) {
      this.stack_trace = stack_trace;
      return this;
    }

    public Builder message(String message) {
      this.message = message;
      return this;
    }

    public Builder report_time(Long report_time) {
      this.report_time = report_time;
      return this;
    }

    public Builder empire_id(Integer empire_id) {
      this.empire_id = empire_id;
      return this;
    }

    public Builder context(String context) {
      this.context = context;
      return this;
    }

    public Builder exception_class(String exception_class) {
      this.exception_class = exception_class;
      return this;
    }

    public Builder heap_size(Long heap_size) {
      this.heap_size = heap_size;
      return this;
    }

    public Builder heap_allocated(Long heap_allocated) {
      this.heap_allocated = heap_allocated;
      return this;
    }

    public Builder heap_free(Long heap_free) {
      this.heap_free = heap_free;
      return this;
    }

    public Builder total_run_time(Long total_run_time) {
      this.total_run_time = total_run_time;
      return this;
    }

    public Builder foreground_run_time(Long foreground_run_time) {
      this.foreground_run_time = foreground_run_time;
      return this;
    }

    public Builder log_output(String log_output) {
      this.log_output = log_output;
      return this;
    }

    public Builder server_request_qs(String server_request_qs) {
      this.server_request_qs = server_request_qs;
      return this;
    }

    public Builder server_request_user_agent(String server_request_user_agent) {
      this.server_request_user_agent = server_request_user_agent;
      return this;
    }

    @Override
    public ErrorReport build() {
      return new ErrorReport(this);
    }
  }
}
