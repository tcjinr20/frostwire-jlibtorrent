/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class lsd_peer_alert extends peer_alert {
  private long swigCPtr;

  protected lsd_peer_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.lsd_peer_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(lsd_peer_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_lsd_peer_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String message() {
    return libtorrent_jni.lsd_peer_alert_message(swigCPtr, this);
  }

}
