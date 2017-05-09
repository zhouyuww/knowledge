//
// Created by universe on 2017/5/5.
//
#include <stdio.h>
#include "jni.h"
#include "com_knowledge_jni_datastructure_Sort.h"

JNIEXPORT  jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_quickSort(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{



    return arraysFromJava;
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

