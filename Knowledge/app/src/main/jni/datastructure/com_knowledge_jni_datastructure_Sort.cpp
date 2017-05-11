//
// Created by universe on 2017/5/5.
//
#include <stdio.h>
#include "jni.h"
#include <android/log.h>
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
        LOGE("%d",arr[i]);
    }
    return arraysFromJava;
}


int quickSort(jint *arr,int start ,int end){
    if(start>=end){
        return start;
    }
    int tar=start;
    int temp = arr[tar];
    swap(arr,start,end);
    for(int i=start;i<end;i++) {
        if(temp>=arr[i]){
           swap(arr,tar++,i);
        }
    }
    swap(arr,tar,end);
    quickSort(arr,start,tar-1);
    quickSort(arr,tar+1,end);
    return tar;
}


void swap(jint *arr,int start ,int tar){
    int temp = arr[start];
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

JNIEXPORT jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_shellSort(JNIEnv *env, jclass cls, jintArray num){
    jsize length;
    jint *arr;
    arr = (*env).GetIntArrayElements(num, NULL);
    length = (*env).GetArrayLength(num);
    int tar = length;
    LOGE("%d",888888);
    while(tar>=1){
        LOGE("%d",tar);
        tar = tar/2;
        for(int i=0;i+tar<length;i++){
            int temp = arr[i];
            int tempTar = i;
            for(int k=i;k+tar<length;){
                if(temp<=arr[k+tar]){
                    tempTar = k+tar;
                }
                k=k+tar;
            }
            LOGE("%d",i);
            if(tempTar!=i){
                swap(arr,i,tempTar);
            }
        }
    }
    for(int i=0;i<length;i++){
        LOGE("%d",arr[i]);
    }
    jintArray  result = (*env).NewIntArray(length); // 新建一个jintArray
    (*env).SetIntArrayRegion(result, 0, length, arr); // 将cbuf转存入result
    return result;
}



JNICALL jintArray Java_com_knowledge_jni_datastructure_Sort_choiceSort(JNIEnv *env, jclass cls, jintArray num){
    jsize length;
    jint *arr;
    arr = (*env).GetIntArrayElements(num, NULL);
    length = (*env).GetArrayLength(num);
    for(int i=0;i<length;i++){
        int tar =i;
        int temp = arr[i];
        for(int j=i;j<length;j++){
             if(arr[j]<temp){
                 tar = j;
                 temp = arr[j];
             }
        }
        swap(arr,i,tar);
    }
    for(int i=0;i<length;i++){
        LOGE("%d",arr[i]);
    }
    jintArray  result = (*env).NewIntArray(length); // 新建一个jintArray
    (*env).SetIntArrayRegion(result, 0, length, arr); // 将cbuf转存入result
    return result;
}


