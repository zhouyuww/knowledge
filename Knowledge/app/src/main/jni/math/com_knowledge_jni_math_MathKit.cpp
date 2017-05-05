//
// Created by universe on 2017/5/2.
//
#include <jni.h>
#include "com_knowledge_jni_math_MathKit.h"

JNIEXPORT jint  JNICALL Java_com_knowledge_jni_math_MathKit_square(JNIEnv *env, jclass cls, jint num)
 {
    return num*num;
 }