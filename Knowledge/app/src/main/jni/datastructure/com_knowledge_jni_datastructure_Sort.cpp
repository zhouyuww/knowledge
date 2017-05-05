//
// Created by universe on 2017/5/5.
//

#include <jni.h>
#include "com_knowledge_jni_datastructure_Sort.h"

JNIEXPORT  jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_quickSort(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{
    return arraysFromJava;
}


JNIEXPORT  jintArray  JNICALL Java_com_knowledge_jni_datastructure_Sort_bubbleSort(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{
    jboolean jbIsCopy = JNI_FALSE;
    jsize length;
    jint *arr  = (*env)->GetIntArrayElements(env,arraysFromJava,jbIsCopy);
    length = (*env)->GetArrayLength(env,arraysFromJava);
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
    jintArray jiaModifyScore = (*env)->NewIntArray( arr, length );
    return jiaModifyScore;
}