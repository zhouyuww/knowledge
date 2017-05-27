//
// Created by universe on 2017/5/2.
//

#ifndef KNOWLEDGE_com_knowledge_jni_datastructure_Sort_H
#define KNOWLEDGE_com_knowledge_jni_datastructure_Sort_H

#endif //KNOWLEDGE_com_knowledge_jni_datastructure_Sort_H

/*
 * Class:     com_jnimobile_www_myjnidemo_MainActivity
 * Method:    getStringFromNative
 * Signature: ()Ljava/lang/String;
 */

#ifndef _Included_com_knowledge_jni_datastructure_Sort
#define _Included_com_knowledge_jni_datastructure_Sort

extern "C" {
#endif
#undef   com_knowledge_jni_datastructure_Sort_BIND_ABOVE_CLIENT
#define  com_knowledge_jni_datastructure_Sort_BIND_ABOVE_CLIENT 8L
#undef   com_knowledge_jni_datastructure_Sort_BIND_ADJUST_WITH_ACTIVITY
#define  com_knowledge_jni_datastructure_Sort_BIND_ADJUST_WITH_ACTIVITY 128L
#undef   com_knowledge_jni_datastructure_Sort_BIND_ALLOW_OOM_MANAGEMENT
#define  com_knowledge_jni_datastructure_Sort_BIND_ALLOW_OOM_MANAGEMENT 16L
#undef   com_knowledge_jni_datastructure_Sort_BIND_AUTO_CREATE
#define  com_knowledge_jni_datastructure_Sort_BIND_AUTO_CREATE 1L
#undef   com_knowledge_jni_datastructure_Sort_BIND_DEBUG_UNBIND
#define  com_knowledge_jni_datastructure_Sort_BIND_DEBUG_UNBIND 2L
#undef   com_knowledge_jni_datastructure_Sort_BIND_IMPORTANT
#define  com_knowledge_jni_datastructure_Sort_BIND_IMPORTANT 64L
#undef   com_knowledge_jni_datastructure_Sort_BIND_NOT_FOREGROUND
#define  com_knowledge_jni_datastructure_Sort_BIND_NOT_FOREGROUND 4L
#undef   com_knowledge_jni_datastructure_Sort_BIND_WAIVE_PRIORITY
#define  com_knowledge_jni_datastructure_Sort_BIND_WAIVE_PRIORITY 32L
#undef   com_knowledge_jni_datastructure_Sort_CONTEXT_IGNORE_SECURITY
#define  com_knowledge_jni_datastructure_Sort_CONTEXT_IGNORE_SECURITY 2L
#undef   com_knowledge_jni_datastructure_Sort_CONTEXT_INCLUDE_CODE
#define  com_knowledge_jni_datastructure_Sort_CONTEXT_INCLUDE_CODE 1L
#undef   com_knowledge_jni_datastructure_Sort_CONTEXT_RESTRICTED
#define  com_knowledge_jni_datastructure_Sort_CONTEXT_RESTRICTED 4L
#undef   com_knowledge_jni_datastructure_Sort_MODE_APPEND
#define  com_knowledge_jni_datastructure_Sort_MODE_APPEND 32768L
#undef   com_knowledge_jni_datastructure_Sort_MODE_ENABLE_WRITE_AHEAD_LOGGING
#define  com_knowledge_jni_datastructure_Sort_MODE_ENABLE_WRITE_AHEAD_LOGGING 8L
#undef   com_knowledge_jni_datastructure_Sort_MODE_MULTI_PROCESS
#define  com_knowledge_jni_datastructure_Sort_MODE_MULTI_PROCESS 4L
#undef   com_knowledge_jni_datastructure_Sort_MODE_PRIVATE
#define  com_knowledge_jni_datastructure_Sort_MODE_PRIVATE 0L
#undef   com_knowledge_jni_datastructure_Sort_MODE_WORLD_READABLE
#define  com_knowledge_jni_datastructure_Sort_MODE_WORLD_READABLE 1L
#undef   com_knowledge_jni_datastructure_Sort_MODE_WORLD_WRITEABLE
#define  com_knowledge_jni_datastructure_Sort_MODE_WORLD_WRITEABLE 2L
#undef   com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_DIALER
#define  com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_DIALER 1L
#undef   com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_DISABLE
#define  com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_DISABLE 0L
#undef   com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_SEARCH_GLOBAL
#define  com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_SEARCH_GLOBAL 4L
#undef   com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_SEARCH_LOCAL
#define  com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_SEARCH_LOCAL 3L
#undef   com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_SHORTCUT
#define  com_knowledge_jni_datastructure_Sort_DEFAULT_KEYS_SHORTCUT 2L
#undef   com_knowledge_jni_datastructure_Sort_RESULT_CANCELED
#define  com_knowledge_jni_datastructure_Sort_RESULT_CANCELED 0L
#undef   com_knowledge_jni_datastructure_Sort_RESULT_FIRST_USER
#define  com_knowledge_jni_datastructure_Sort_RESULT_FIRST_USER 1L
#undef   com_knowledge_jni_datastructure_Sort_RESULT_OK
#define  com_knowledge_jni_datastructure_Sort_RESULT_OK -1L
/*
 * Class:     com_knowledge_jni_datastructure_Sort
 * Method:    getStringFromNative
 * Signature: ()Ljava/lang/String;
 */

JNIEXPORT  jintArray JNICALL Java_com_knowledge_jni_datastructure_Sort_quickSort(JNIEnv *env, jclass cls, jintArray num);


JNIEXPORT jintArray JNICALL Java_com_knowledge_jni_datastructure_Sort_bubbleSort(JNIEnv *env, jclass cls, jintArray num);


JNIEXPORT jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_choiceSort(JNIEnv *env, jclass cls, jintArray num);


JNIEXPORT jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_shellSort(JNIEnv *env, jclass cls, jintArray num);


int quickSort(jint *arr,int start ,int end);

void swap(jint *arr,int start ,int tar);

#ifdef __cplusplus
}

#endif