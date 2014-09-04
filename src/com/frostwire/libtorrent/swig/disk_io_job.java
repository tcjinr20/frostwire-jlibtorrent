/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class disk_io_job {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected disk_io_job(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(disk_io_job obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_disk_io_job(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public disk_io_job() {
    this(libtorrent_jni.new_disk_io_job(), true);
  }

  public void setBuffer(String value) {
    libtorrent_jni.disk_io_job_buffer_set(swigCPtr, this, value);
  }

  public String getBuffer() {
    return libtorrent_jni.disk_io_job_buffer_get(swigCPtr, this);
  }

  public void setCallback(SWIGTYPE_p_boost__functionT_void_fint_libtorrent__disk_io_job_const_RF_t value) {
    libtorrent_jni.disk_io_job_callback_set(swigCPtr, this, SWIGTYPE_p_boost__functionT_void_fint_libtorrent__disk_io_job_const_RF_t.getCPtr(value));
  }

  public SWIGTYPE_p_boost__functionT_void_fint_libtorrent__disk_io_job_const_RF_t getCallback() {
    long cPtr = libtorrent_jni.disk_io_job_callback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_boost__functionT_void_fint_libtorrent__disk_io_job_const_RF_t(cPtr, false);
  }

  public void setStorage(piece_manager value) {
    libtorrent_jni.disk_io_job_storage_set(swigCPtr, this, piece_manager.getCPtr(value), value);
  }

  public piece_manager getStorage() {
    long cPtr = libtorrent_jni.disk_io_job_storage_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_manager(cPtr, true);
  }

  public void setResume_data(entry value) {
    libtorrent_jni.disk_io_job_resume_data_set(swigCPtr, this, entry.getCPtr(value), value);
  }

  public entry getResume_data() {
    long cPtr = libtorrent_jni.disk_io_job_resume_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new entry(cPtr, true);
  }

  public void setError(error_code value) {
    libtorrent_jni.disk_io_job_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.disk_io_job_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setStart_time(SWIGTYPE_p_boost__posix_time__ptime value) {
    libtorrent_jni.disk_io_job_start_time_set(swigCPtr, this, SWIGTYPE_p_boost__posix_time__ptime.getCPtr(value));
  }

  public SWIGTYPE_p_boost__posix_time__ptime getStart_time() {
    return new SWIGTYPE_p_boost__posix_time__ptime(libtorrent_jni.disk_io_job_start_time_get(swigCPtr, this), true);
  }

  public void setStr(String value) {
    libtorrent_jni.disk_io_job_str_set(swigCPtr, this, value);
  }

  public String getStr() {
    return libtorrent_jni.disk_io_job_str_get(swigCPtr, this);
  }

  public void setError_file(String value) {
    libtorrent_jni.disk_io_job_error_file_set(swigCPtr, this, value);
  }

  public String getError_file() {
    return libtorrent_jni.disk_io_job_error_file_get(swigCPtr, this);
  }

  public void setBuffer_size(int value) {
    libtorrent_jni.disk_io_job_buffer_size_set(swigCPtr, this, value);
  }

  public int getBuffer_size() {
    return libtorrent_jni.disk_io_job_buffer_size_get(swigCPtr, this);
  }

  public void setPiece(int value) {
    libtorrent_jni.disk_io_job_piece_set(swigCPtr, this, value);
  }

  public int getPiece() {
    return libtorrent_jni.disk_io_job_piece_get(swigCPtr, this);
  }

  public void setOffset(int value) {
    libtorrent_jni.disk_io_job_offset_set(swigCPtr, this, value);
  }

  public int getOffset() {
    return libtorrent_jni.disk_io_job_offset_get(swigCPtr, this);
  }

  public void setMax_cache_line(int value) {
    libtorrent_jni.disk_io_job_max_cache_line_set(swigCPtr, this, value);
  }

  public int getMax_cache_line() {
    return libtorrent_jni.disk_io_job_max_cache_line_get(swigCPtr, this);
  }

  public void setCache_min_time(int value) {
    libtorrent_jni.disk_io_job_cache_min_time_set(swigCPtr, this, value);
  }

  public int getCache_min_time() {
    return libtorrent_jni.disk_io_job_cache_min_time_get(swigCPtr, this);
  }

  public void setAction(short value) {
    libtorrent_jni.disk_io_job_action_set(swigCPtr, this, value);
  }

  public short getAction() {
    return libtorrent_jni.disk_io_job_action_get(swigCPtr, this);
  }

  public enum action_t {
    read,
    write,
    hash,
    move_storage,
    release_files,
    delete_files,
    check_fastresume,
    check_files,
    save_resume_data,
    rename_file,
    abort_thread,
    clear_read_cache,
    abort_torrent,
    update_settings,
    read_and_hash,
    cache_piece,
    file_priority;

    public final int swigValue() {
      return swigValue;
    }

    public static action_t swigToEnum(int swigValue) {
      action_t[] swigValues = action_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (action_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + action_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private action_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private action_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private action_t(action_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
