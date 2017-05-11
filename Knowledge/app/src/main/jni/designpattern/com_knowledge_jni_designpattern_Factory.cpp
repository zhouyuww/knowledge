//
// Created by universe on 2017/5/11.
//

//
#include <stdio.h>
#include "jni.h"
#include <android/log.h>
#include "factorypattern/Product.h"
#include "com_knowledge_jni_designpattern_Factory.h"
#include "factorypattern/Factoryp.h"

#define  LOG_TAG    "HelloJni"
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

JNIEXPORT jint  JNICALL Java_com_knowledge_jni_designpattern_Factory_create(JNIEnv *env, jclass cls){
       LOGE("%d",1000);
       Factoryp* factory = new ConcreateFactory();
       Product* p = factory->CreateProduct();
    return 1;
}



