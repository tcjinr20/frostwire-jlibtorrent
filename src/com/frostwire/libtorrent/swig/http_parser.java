/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class http_parser {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected http_parser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(http_parser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_http_parser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public http_parser(int flags) {
    this(libtorrent_jni.new_http_parser__SWIG_0(flags), true);
  }

  public http_parser() {
    this(libtorrent_jni.new_http_parser__SWIG_1(), true);
  }

  public String header(String key) {
    return libtorrent_jni.http_parser_header(swigCPtr, this, key);
  }

  public String protocol() {
    return libtorrent_jni.http_parser_protocol(swigCPtr, this);
  }

  public int status_code() {
    return libtorrent_jni.http_parser_status_code(swigCPtr, this);
  }

  public String method() {
    return libtorrent_jni.http_parser_method(swigCPtr, this);
  }

  public String path() {
    return libtorrent_jni.http_parser_path(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.http_parser_message(swigCPtr, this);
  }

  public boolean header_finished() {
    return libtorrent_jni.http_parser_header_finished(swigCPtr, this);
  }

  public boolean finished() {
    return libtorrent_jni.http_parser_finished(swigCPtr, this);
  }

  public int body_start() {
    return libtorrent_jni.http_parser_body_start(swigCPtr, this);
  }

  public long content_length() {
    return libtorrent_jni.http_parser_content_length(swigCPtr, this);
  }

  public long_long_long_long_pair content_range() {
    return new long_long_long_long_pair(libtorrent_jni.http_parser_content_range(swigCPtr, this), true);
  }

  public boolean chunked_encoding() {
    return libtorrent_jni.http_parser_chunked_encoding(swigCPtr, this);
  }

  public int collapse_chunk_headers(String buffer, int size) {
    return libtorrent_jni.http_parser_collapse_chunk_headers(swigCPtr, this, buffer, size);
  }

  public void reset() {
    libtorrent_jni.http_parser_reset(swigCPtr, this);
  }

  public boolean connection_close() {
    return libtorrent_jni.http_parser_connection_close(swigCPtr, this);
  }

  public SWIGTYPE_p_std__multimapT_std__string_std__string_t headers() {
    return new SWIGTYPE_p_std__multimapT_std__string_std__string_t(libtorrent_jni.http_parser_headers(swigCPtr, this), false);
  }

  public long_long_long_long_pair_vector chunks() {
    return new long_long_long_long_pair_vector(libtorrent_jni.http_parser_chunks(swigCPtr, this), false);
  }

  public enum flags_t {
    dont_parse_chunks(libtorrent_jni.http_parser_dont_parse_chunks_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
