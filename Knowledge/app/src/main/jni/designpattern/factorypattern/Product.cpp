//
// Created by universe on 2017/5/11.
//

#include "Product.h"
#include <stdio.h>
#include "jni.h"
#include <android/log.h>
#define  LOG_TAG    "HelloJni"
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

Product::Product() {

}

Product::~Product() {

}

ConcreteProduct::ConcreteProduct() {
    LOGE("%d",3000);
}

ConcreteProduct::~ConcreteProduct() {

}