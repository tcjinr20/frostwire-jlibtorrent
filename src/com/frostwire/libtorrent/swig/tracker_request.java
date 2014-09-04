/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class tracker_request {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected tracker_request(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(tracker_request obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_tracker_request(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public tracker_request() {
    this(libtorrent_jni.new_tracker_request(), true);
  }

  public void setKind(int value) {
    libtorrent_jni.tracker_request_kind_set(swigCPtr, this, value);
  }

  public int getKind() {
    return libtorrent_jni.tracker_request_kind_get(swigCPtr, this);
  }

  public void setInfo_hash(sha1_hash value) {
    libtorrent_jni.tracker_request_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.tracker_request_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setPid(sha1_hash value) {
    libtorrent_jni.tracker_request_pid_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getPid() {
    long cPtr = libtorrent_jni.tracker_request_pid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setDownloaded(long value) {
    libtorrent_jni.tracker_request_downloaded_set(swigCPtr, this, value);
  }

  public long getDownloaded() {
    return libtorrent_jni.tracker_request_downloaded_get(swigCPtr, this);
  }

  public void setUploaded(long value) {
    libtorrent_jni.tracker_request_uploaded_set(swigCPtr, this, value);
  }

  public long getUploaded() {
    return libtorrent_jni.tracker_request_uploaded_get(swigCPtr, this);
  }

  public void setLeft(long value) {
    libtorrent_jni.tracker_request_left_set(swigCPtr, this, value);
  }

  public long getLeft() {
    return libtorrent_jni.tracker_request_left_get(swigCPtr, this);
  }

  public void setCorrupt(long value) {
    libtorrent_jni.tracker_request_corrupt_set(swigCPtr, this, value);
  }

  public long getCorrupt() {
    return libtorrent_jni.tracker_request_corrupt_get(swigCPtr, this);
  }

  public void setRedundant(long value) {
    libtorrent_jni.tracker_request_redundant_set(swigCPtr, this, value);
  }

  public long getRedundant() {
    return libtorrent_jni.tracker_request_redundant_get(swigCPtr, this);
  }

  public void setListen_port(int value) {
    libtorrent_jni.tracker_request_listen_port_set(swigCPtr, this, value);
  }

  public int getListen_port() {
    return libtorrent_jni.tracker_request_listen_port_get(swigCPtr, this);
  }

  public void setEvent(tracker_request.event_t value) {
    libtorrent_jni.tracker_request_event_set(swigCPtr, this, value.swigValue());
  }

  public tracker_request.event_t getEvent() {
    return tracker_request.event_t.swigToEnum(libtorrent_jni.tracker_request_event_get(swigCPtr, this));
  }

  public void setUrl(String value) {
    libtorrent_jni.tracker_request_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.tracker_request_url_get(swigCPtr, this);
  }

  public void setTrackerid(String value) {
    libtorrent_jni.tracker_request_trackerid_set(swigCPtr, this, value);
  }

  public String getTrackerid() {
    return libtorrent_jni.tracker_request_trackerid_get(swigCPtr, this);
  }

  public void setKey(long value) {
    libtorrent_jni.tracker_request_key_set(swigCPtr, this, value);
  }

  public long getKey() {
    return libtorrent_jni.tracker_request_key_get(swigCPtr, this);
  }

  public void setNum_want(int value) {
    libtorrent_jni.tracker_request_num_want_set(swigCPtr, this, value);
  }

  public int getNum_want() {
    return libtorrent_jni.tracker_request_num_want_get(swigCPtr, this);
  }

  public void setBind_ip(address value) {
    libtorrent_jni.tracker_request_bind_ip_set(swigCPtr, this, address.getCPtr(value), value);
  }

  public address getBind_ip() {
    long cPtr = libtorrent_jni.tracker_request_bind_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public void setSend_stats(boolean value) {
    libtorrent_jni.tracker_request_send_stats_set(swigCPtr, this, value);
  }

  public boolean getSend_stats() {
    return libtorrent_jni.tracker_request_send_stats_get(swigCPtr, this);
  }

  public void setApply_ip_filter(boolean value) {
    libtorrent_jni.tracker_request_apply_ip_filter_set(swigCPtr, this, value);
  }

  public boolean getApply_ip_filter() {
    return libtorrent_jni.tracker_request_apply_ip_filter_get(swigCPtr, this);
  }

  public final static int announce_request = libtorrent_jni.tracker_request_announce_request_get();
  public final static int scrape_request = libtorrent_jni.tracker_request_scrape_request_get();

  public enum event_t {
    none,
    completed,
    started,
    stopped,
    paused;

    public final int swigValue() {
      return swigValue;
    }

    public static event_t swigToEnum(int swigValue) {
      event_t[] swigValues = event_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (event_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + event_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private event_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private event_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private event_t(event_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
