package com.knowledge.jni.math;

/**
 * Created by universe on 2017/5/2.
 */

public class StringKit {

    public static native void setNull(String str);

    static {
        System.loadLibrary("jniTest");
    }

}