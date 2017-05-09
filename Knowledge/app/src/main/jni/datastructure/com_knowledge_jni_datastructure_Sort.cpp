//
// Created by universe on 2017/5/5.
//
#include <stdio.h>
#include "jni.h"
#include "com_knowledge_jni_datastructure_Sort.h"
#define  LOG_TAG    "HelloJni"
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

JNIEXPORT  jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_quickSort(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{
    jsize length;
    jint *arr;
    arr = (*env).GetIntArrayElements(arraysFromJava, NULL);
    length = (*env).GetArrayLength(arraysFromJava);
    quickSort(arr,0,length-1);
    for(int i=0;i<length;i++){

    }
    return arraysFromJava;
}


jint quickSort(jint *arr,jint start ,jint end){
    if(start>=end){
        return start;
    }
    jint tar=start;
    jint temp = arr[tar];
    for(jint i=start;i<end;i++){
        if(arr[i]>=arr[i+1]){
            swap(arr,tar,i);
            tar++;
        }
    }
    quickSort(arr,start,tar-1);
    quickSort(arr,tar+1,end);
}


void swap(jint *arr,jint start ,jint tar){
    jint temp = arr[start];
    arr[start] = arr[tar];
    arr[tar] = temp;
}


JNIEXPORT  jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_bubbleSort(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{
    jsize length;
    jint *arr;
    arr = (*env).GetIntArrayElements(arraysFromJava, NULL);
    length = (*env).GetArrayLength(arraysFromJava);
    for(int i=0;i<length;i++){
        for(int j=0;j<length-i-1;j++){
            int pre =  arr[j];
            int next = arr[j+1];
            int tmp = arr[j];
            if(pre>next){
                arr[j]= next;
                arr[j+1] = tmp;
            }
        }
    }
    jintArray  result = (*env).NewIntArray(length); // 新建一个jintArray
    (*env).SetIntArrayRegion(result, 0, length, arr); // 将cbuf转存入result
    return result;
}

