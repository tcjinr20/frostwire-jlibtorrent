/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class alert_manager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected alert_manager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(alert_manager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_alert_manager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public alert_manager(int queue_limit, long alert_mask) {
    this(libtorrent_jni.new_alert_manager__SWIG_0(queue_limit, alert_mask), true);
  }

  public alert_manager(int queue_limit) {
    this(libtorrent_jni.new_alert_manager__SWIG_1(queue_limit), true);
  }

  public void post_alert(alert alert_) {
    libtorrent_jni.alert_manager_post_alert(swigCPtr, this, alert.getCPtr(alert_), alert_);
  }

  public void post_alert_ptr(alert alert_) {
    libtorrent_jni.alert_manager_post_alert_ptr(swigCPtr, this, alert.getCPtr(alert_), alert_);
  }

  public boolean pending() {
    return libtorrent_jni.alert_manager_pending(swigCPtr, this);
  }

  public alert get() {
     long cPtr = libtorrent_jni.alert_manager_get(swigCPtr, this);
     return (cPtr == 0) ? null : new alert(cPtr, true);
   }

  public void get_all(alert_ptr_deque alerts) {
    libtorrent_jni.alert_manager_get_all(swigCPtr, this, alert_ptr_deque.getCPtr(alerts), alerts);
  }

  public boolean should_post(alert a) {
    return libtorrent_jni.alert_manager_should_post(swigCPtr, this, alert.getCPtr(a), a);
  }

  public alert wait_for_alert(SWIGTYPE_p_boost__posix_time__time_duration max_wait) {
    long cPtr = libtorrent_jni.alert_manager_wait_for_alert(swigCPtr, this, SWIGTYPE_p_boost__posix_time__time_duration.getCPtr(max_wait));
    return (cPtr == 0) ? null : new alert(cPtr, false);
  }

  public void set_alert_mask(long m) {
    libtorrent_jni.alert_manager_set_alert_mask(swigCPtr, this, m);
  }

  public int alert_mask() {
    return libtorrent_jni.alert_manager_alert_mask(swigCPtr, this);
  }

  public long alert_queue_size_limit() {
    return libtorrent_jni.alert_manager_alert_queue_size_limit(swigCPtr, this);
  }

  public long set_alert_queue_size_limit(long queue_size_limit_) {
    return libtorrent_jni.alert_manager_set_alert_queue_size_limit(swigCPtr, this, queue_size_limit_);
  }

  public void set_dispatch_function(SWIGTYPE_p_boost__functionT_void_fstd__auto_ptrT_libtorrent__alert_tF_t arg0) {
    libtorrent_jni.alert_manager_set_dispatch_function(swigCPtr, this, SWIGTYPE_p_boost__functionT_void_fstd__auto_ptrT_libtorrent__alert_tF_t.getCPtr(arg0));
  }

  public void add_extension(plugin ext) {
    libtorrent_jni.alert_manager_add_extension(swigCPtr, this, plugin.getCPtr(ext), ext);
  }

}
