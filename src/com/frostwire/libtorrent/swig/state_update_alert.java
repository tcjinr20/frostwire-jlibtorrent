/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class state_update_alert extends alert {
  private long swigCPtr;

  protected state_update_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.state_update_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(state_update_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_state_update_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String message() {
    return libtorrent_jni.state_update_alert_message(swigCPtr, this);
  }

  public boolean discardable() {
    return libtorrent_jni.state_update_alert_discardable(swigCPtr, this);
  }

  public void setStatus(torrent_status_vector value) {
    libtorrent_jni.state_update_alert_status_set(swigCPtr, this, torrent_status_vector.getCPtr(value), value);
  }

  public torrent_status_vector getStatus() {
    long cPtr = libtorrent_jni.state_update_alert_status_get(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_status_vector(cPtr, false);
  }

}
