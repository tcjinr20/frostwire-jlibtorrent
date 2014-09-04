/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class policy_peer_ptr_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected policy_peer_ptr_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(policy_peer_ptr_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_policy_peer_ptr_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public policy_peer_ptr_vector() {
    this(libtorrent_jni.new_policy_peer_ptr_vector(), true);
  }

  public long size() {
    return libtorrent_jni.policy_peer_ptr_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.policy_peer_ptr_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.policy_peer_ptr_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.policy_peer_ptr_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.policy_peer_ptr_vector_clear(swigCPtr, this);
  }

  public void add(policy.peer x) {
    libtorrent_jni.policy_peer_ptr_vector_add(swigCPtr, this, policy.peer.getCPtr(x), x);
  }

  public policy.peer get(int i) {
    long cPtr = libtorrent_jni.policy_peer_ptr_vector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new policy.peer(cPtr, false);
  }

  public void set(int i, policy.peer val) {
    libtorrent_jni.policy_peer_ptr_vector_set(swigCPtr, this, i, policy.peer.getCPtr(val), val);
  }

}
