//
// Created by Chen on 2017/4/21.
//
#include "com_example_chen_ndkdemo_JNIutils.h"
JNIEXPORT jstring JNICALL Java_com_example_chen_ndkdemo_JNIutils_getShowString(JNIEnv *env, jclass obj) {
    return (*env)->NewStringUTF(env, "It works");
}

