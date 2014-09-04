/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class url_seed_alert extends torrent_alert {
  private long swigCPtr;

  protected url_seed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.url_seed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(url_seed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_url_seed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String message() {
    return libtorrent_jni.url_seed_alert_message(swigCPtr, this);
  }

  public void setUrl(String value) {
    libtorrent_jni.url_seed_alert_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.url_seed_alert_url_get(swigCPtr, this);
  }

  public void setMsg(String value) {
    libtorrent_jni.url_seed_alert_msg_set(swigCPtr, this, value);
  }

  public String getMsg() {
    return libtorrent_jni.url_seed_alert_msg_get(swigCPtr, this);
  }

}
