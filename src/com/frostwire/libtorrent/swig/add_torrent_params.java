/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.libtorrent.swig;

public class add_torrent_params {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected add_torrent_params(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(add_torrent_params obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_add_torrent_params(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public add_torrent_params(SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t sc) {
    this(libtorrent_jni.new_add_torrent_params__SWIG_0(SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t.getCPtr(sc)), true);
  }

  public add_torrent_params() {
    this(libtorrent_jni.new_add_torrent_params__SWIG_1(), true);
  }

  public void setVersion(int value) {
    libtorrent_jni.add_torrent_params_version_set(swigCPtr, this, value);
  }

  public int getVersion() {
    return libtorrent_jni.add_torrent_params_version_get(swigCPtr, this);
  }

  public void setTi(torrent_info value) {
    libtorrent_jni.add_torrent_params_ti_set(swigCPtr, this, torrent_info.getCPtr(value), value);
  }

  public torrent_info getTi() {
    long cPtr = libtorrent_jni.add_torrent_params_ti_get(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_info(cPtr, true);
  }

  public void setTrackers(string_vector value) {
    libtorrent_jni.add_torrent_params_trackers_set(swigCPtr, this, string_vector.getCPtr(value), value);
  }

  public string_vector getTrackers() {
    long cPtr = libtorrent_jni.add_torrent_params_trackers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_vector(cPtr, false);
  }

  public void setUrl_seeds(string_vector value) {
    libtorrent_jni.add_torrent_params_url_seeds_set(swigCPtr, this, string_vector.getCPtr(value), value);
  }

  public string_vector getUrl_seeds() {
    long cPtr = libtorrent_jni.add_torrent_params_url_seeds_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_vector(cPtr, false);
  }

  public void setDht_nodes(string_int_pair_vector value) {
    libtorrent_jni.add_torrent_params_dht_nodes_set(swigCPtr, this, string_int_pair_vector.getCPtr(value), value);
  }

  public string_int_pair_vector getDht_nodes() {
    long cPtr = libtorrent_jni.add_torrent_params_dht_nodes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_int_pair_vector(cPtr, false);
  }

  public void setName(String value) {
    libtorrent_jni.add_torrent_params_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return libtorrent_jni.add_torrent_params_name_get(swigCPtr, this);
  }

  public void setSave_path(String value) {
    libtorrent_jni.add_torrent_params_save_path_set(swigCPtr, this, value);
  }

  public String getSave_path() {
    return libtorrent_jni.add_torrent_params_save_path_get(swigCPtr, this);
  }

  public void setResume_data(char_vector value) {
    libtorrent_jni.add_torrent_params_resume_data_set(swigCPtr, this, char_vector.getCPtr(value), value);
  }

  public char_vector getResume_data() {
    long cPtr = libtorrent_jni.add_torrent_params_resume_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new char_vector(cPtr, false);
  }

  public void setStorage_mode(storage_mode_t value) {
    libtorrent_jni.add_torrent_params_storage_mode_set(swigCPtr, this, value.swigValue());
  }

  public storage_mode_t getStorage_mode() {
    return storage_mode_t.swigToEnum(libtorrent_jni.add_torrent_params_storage_mode_get(swigCPtr, this));
  }

  public void setStorage(SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t value) {
    libtorrent_jni.add_torrent_params_storage_set(swigCPtr, this, SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t.getCPtr(value));
  }

  public SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t getStorage() {
    long cPtr = libtorrent_jni.add_torrent_params_storage_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t(cPtr, false);
  }

  public void setUserdata(SWIGTYPE_p_void value) {
    libtorrent_jni.add_torrent_params_userdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserdata() {
    long cPtr = libtorrent_jni.add_torrent_params_userdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setFile_priorities(unsigned_char_vector value) {
    libtorrent_jni.add_torrent_params_file_priorities_set(swigCPtr, this, unsigned_char_vector.getCPtr(value), value);
  }

  public unsigned_char_vector getFile_priorities() {
    long cPtr = libtorrent_jni.add_torrent_params_file_priorities_get(swigCPtr, this);
    return (cPtr == 0) ? null : new unsigned_char_vector(cPtr, false);
  }

  public void setExtensions(SWIGTYPE_p_std__vectorT_boost__functionT_boost__shared_ptrT_libtorrent__torrent_plugin_t_flibtorrent__torrent_p_void_pF_t_t value) {
    libtorrent_jni.add_torrent_params_extensions_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_boost__functionT_boost__shared_ptrT_libtorrent__torrent_plugin_t_flibtorrent__torrent_p_void_pF_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_boost__functionT_boost__shared_ptrT_libtorrent__torrent_plugin_t_flibtorrent__torrent_p_void_pF_t_t getExtensions() {
    long cPtr = libtorrent_jni.add_torrent_params_extensions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_boost__functionT_boost__shared_ptrT_libtorrent__torrent_plugin_t_flibtorrent__torrent_p_void_pF_t_t(cPtr, false);
  }

  public void setTrackerid(String value) {
    libtorrent_jni.add_torrent_params_trackerid_set(swigCPtr, this, value);
  }

  public String getTrackerid() {
    return libtorrent_jni.add_torrent_params_trackerid_get(swigCPtr, this);
  }

  public void setUrl(String value) {
    libtorrent_jni.add_torrent_params_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.add_torrent_params_url_get(swigCPtr, this);
  }

  public void setUuid(String value) {
    libtorrent_jni.add_torrent_params_uuid_set(swigCPtr, this, value);
  }

  public String getUuid() {
    return libtorrent_jni.add_torrent_params_uuid_get(swigCPtr, this);
  }

  public void setSource_feed_url(String value) {
    libtorrent_jni.add_torrent_params_source_feed_url_set(swigCPtr, this, value);
  }

  public String getSource_feed_url() {
    return libtorrent_jni.add_torrent_params_source_feed_url_get(swigCPtr, this);
  }

  public void setFlags(java.math.BigInteger value) {
    libtorrent_jni.add_torrent_params_flags_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getFlags() {
    return libtorrent_jni.add_torrent_params_flags_get(swigCPtr, this);
  }

  public void setInfo_hash(sha1_hash value) {
    libtorrent_jni.add_torrent_params_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.add_torrent_params_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setMax_uploads(int value) {
    libtorrent_jni.add_torrent_params_max_uploads_set(swigCPtr, this, value);
  }

  public int getMax_uploads() {
    return libtorrent_jni.add_torrent_params_max_uploads_get(swigCPtr, this);
  }

  public void setMax_connections(int value) {
    libtorrent_jni.add_torrent_params_max_connections_set(swigCPtr, this, value);
  }

  public int getMax_connections() {
    return libtorrent_jni.add_torrent_params_max_connections_get(swigCPtr, this);
  }

  public void setUpload_limit(int value) {
    libtorrent_jni.add_torrent_params_upload_limit_set(swigCPtr, this, value);
  }

  public int getUpload_limit() {
    return libtorrent_jni.add_torrent_params_upload_limit_get(swigCPtr, this);
  }

  public void setDownload_limit(int value) {
    libtorrent_jni.add_torrent_params_download_limit_set(swigCPtr, this, value);
  }

  public int getDownload_limit() {
    return libtorrent_jni.add_torrent_params_download_limit_get(swigCPtr, this);
  }

  public enum flags_t {
    flag_seed_mode(libtorrent_jni.add_torrent_params_flag_seed_mode_get()),
    flag_override_resume_data(libtorrent_jni.add_torrent_params_flag_override_resume_data_get()),
    flag_upload_mode(libtorrent_jni.add_torrent_params_flag_upload_mode_get()),
    flag_share_mode(libtorrent_jni.add_torrent_params_flag_share_mode_get()),
    flag_apply_ip_filter(libtorrent_jni.add_torrent_params_flag_apply_ip_filter_get()),
    flag_paused(libtorrent_jni.add_torrent_params_flag_paused_get()),
    flag_auto_managed(libtorrent_jni.add_torrent_params_flag_auto_managed_get()),
    flag_duplicate_is_error(libtorrent_jni.add_torrent_params_flag_duplicate_is_error_get()),
    flag_merge_resume_trackers(libtorrent_jni.add_torrent_params_flag_merge_resume_trackers_get()),
    flag_update_subscribe(libtorrent_jni.add_torrent_params_flag_update_subscribe_get()),
    flag_super_seeding(libtorrent_jni.add_torrent_params_flag_super_seeding_get()),
    flag_sequential_download(libtorrent_jni.add_torrent_params_flag_sequential_download_get()),
    flag_use_resume_save_path(libtorrent_jni.add_torrent_params_flag_use_resume_save_path_get()),
    default_flags(libtorrent_jni.add_torrent_params_default_flags_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
