#ifndef _LIBTORRENT_H
#define _LIBTORRENT_H

#include "jlibtorrent.h"

#ifdef __cplusplus
extern "C" {
#endif

JNI_METHOD(LibTorrent, jstring, version)

JNI_METHOD(LibTorrent, void, createTorrent, jobjectArray)

#ifdef __cplusplus
}
#endif
#endif
