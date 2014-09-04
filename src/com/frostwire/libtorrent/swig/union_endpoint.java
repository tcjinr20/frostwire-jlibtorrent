/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class union_endpoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected union_endpoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(union_endpoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_union_endpoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public union_endpoint(SWIGTYPE_p_tcp__endpoint ep) {
    this(libtorrent_jni.new_union_endpoint__SWIG_0(SWIGTYPE_p_tcp__endpoint.getCPtr(ep)), true);
  }

  public union_endpoint(SWIGTYPE_p_udp__endpoint ep) {
    this(libtorrent_jni.new_union_endpoint__SWIG_1(SWIGTYPE_p_udp__endpoint.getCPtr(ep)), true);
  }

  public union_endpoint() {
    this(libtorrent_jni.new_union_endpoint__SWIG_2(), true);
  }

  public void setPort(int value) {
    libtorrent_jni.union_endpoint_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return libtorrent_jni.union_endpoint_port_get(swigCPtr, this);
  }

  public void setV4(boolean value) {
    libtorrent_jni.union_endpoint_v4_set(swigCPtr, this, value);
  }

  public boolean getV4() {
    return libtorrent_jni.union_endpoint_v4_get(swigCPtr, this);
  }

}
