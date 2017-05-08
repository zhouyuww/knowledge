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


JNIEXPORT  int  JNICALL Java_com_knowledge_jni_datastructure_Linkedlist_singlylinkedlist(JNIEnv *env, jclass cls, jintArray arraysFromJava)
{
    jsize length;
    jint *arr;
    arr = (*env).GetIntArrayElements(arraysFromJava, NULL);
    length = (*env).GetArrayLength(arraysFromJava);
    LinklistNode* start;
    start->num = arr[0];
    inverseLinkedlist(start,arr,length);
    return 0;
}

LinklistNode*   inverseLinkedlist(LinklistNode* start,jint *array,int lenght){
    LinklistNode* temp = start;
    for(int i=1;i<lenght;i++){
         LinklistNode* tar = new LinklistNode;
         tar->num= array[i];
         temp->next = tar;
         temp = tar;
    }
//    LinklistNode tar;
//    LinklistNode next;
//    LinklistNode nextnext;
//    tar  = start;

//    next = *tar.next;
//    nextnext = *next.next;
//    start.next= NULL;
//    while (0!=nextnext.next){
//        *next.next =tar;
//        tar = next;
//        next = nextnext;
//        nextnext =* next.next;
//    }
//    *next.next = tar;
//    tar = next;
    for(int i=0;i<lenght-1;i++){
        LOGE("%d",start->num);
        start = start->next;
    }
    return start;
}


