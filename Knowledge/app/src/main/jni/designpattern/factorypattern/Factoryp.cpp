//
// Created by universe on 2017/5/11.
//

#include <stdio.h>
#include "jni.h"
#include <android/log.h>
#include "Factoryp.h"
#define   LOG_TAG    "HelloJni"
#define   LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define   LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)


Factoryp::Factoryp() {

}

Factoryp::~Factoryp() {

}

ConcreateFactory::ConcreateFactory() {
    LOGE("%d",2000);
}

ConcreateFactory::~ConcreateFactory() {

}

Product* ConcreateFactory::CreateProduct() {
    return  new ConcreteProduct();
}