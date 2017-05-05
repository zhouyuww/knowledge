package com.knowledge.jni.math;

/**
 * Created by universe on 2017/5/2.
 */

public class MathKit {

    public static native int square(int num);

    static {
        System.loadLibrary("jniTest");
    }



}
