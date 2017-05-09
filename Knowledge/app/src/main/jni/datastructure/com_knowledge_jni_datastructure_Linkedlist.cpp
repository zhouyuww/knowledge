//
// Created by universe on 2017/5/8.
//

#include <stdio.h>
#include "jni.h"
#include <android/log.h>
#include "com_knowledge_jni_datastructure_Linkedlist.h"
#define  LOG_TAG    "HelloJni"
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

JNIEXPORT  jintArray  JNICALL Java_com_knowledge_jni_datastructure_Linkedlist_singlylinkedlist(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{
    jsize length;
    jint *arr;
    arr = (*env).GetIntArrayElements(arraysFromJava, NULL);
    length = (*env).GetArrayLength(arraysFromJava);
    LinklistNode* start = new LinklistNode;
    inverseLinkedlist(start,arr,length);
    jintArray  result = (*env).NewIntArray(length); // 新建一个jintArray
    (*env).SetIntArrayRegion(result, 0, length, arr); // 将cbuf转存入result
    return result;
}

int inverseLinkedlist(LinklistNode* start,jint *array,int lenght){
    start->num = array[0];
    LinklistNode* temp = start;
    for(int i=1;i<lenght;i++){
        LinklistNode* tar = new LinklistNode;
        tar->num= array[i];
        temp->next = tar;
        temp = tar;
    }
    temp->next =NULL;
    LinklistNode* tar = start;
    LinklistNode* next = start->next;
    LinklistNode* nextnext = next->next;
    start->next = NULL;
    next->next = start;
    tar = next;
    start = nextnext;
    next  = start->next;
    while(next){
        start->next=tar;
        tar = start;
        start = next;
        next =  start->next;
    }
    start->next=tar;
    tar = start;
    for(int i=0;i<lenght-1;i++){
        LOGE("%d",tar->num);
        tar = tar->next;
    }
    LOGE("%d",tar->num);
    return  0;
}



