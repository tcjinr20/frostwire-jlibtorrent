/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class peer_request {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected peer_request(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_request obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_request(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPiece(int value) {
    libtorrent_jni.peer_request_piece_set(swigCPtr, this, value);
  }

  public int getPiece() {
    return libtorrent_jni.peer_request_piece_get(swigCPtr, this);
  }

  public void setStart(int value) {
    libtorrent_jni.peer_request_start_set(swigCPtr, this, value);
  }

  public int getStart() {
    return libtorrent_jni.peer_request_start_get(swigCPtr, this);
  }

  public void setLength(int value) {
    libtorrent_jni.peer_request_length_set(swigCPtr, this, value);
  }

  public int getLength() {
    return libtorrent_jni.peer_request_length_get(swigCPtr, this);
  }

  public boolean op_eq(peer_request r) {
    return libtorrent_jni.peer_request_op_eq(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public peer_request() {
    this(libtorrent_jni.new_peer_request(), true);
  }

}
