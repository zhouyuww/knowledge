package com.knowledge.jni.designpattern;

/**
 * Created by universe on 2017/5/11.
 */

public class Factory {

    public static native int create();

    static {
        System.loadLibrary("jniTest");
    }


}
