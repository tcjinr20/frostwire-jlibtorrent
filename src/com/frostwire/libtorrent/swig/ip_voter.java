/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class ip_voter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ip_voter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ip_voter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_ip_voter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ip_voter() {
    this(libtorrent_jni.new_ip_voter(), true);
  }

  public boolean cast_vote(address ip, int source_type, address sorce) {
    return libtorrent_jni.ip_voter_cast_vote(swigCPtr, this, address.getCPtr(ip), ip, source_type, address.getCPtr(sorce), sorce);
  }

}
