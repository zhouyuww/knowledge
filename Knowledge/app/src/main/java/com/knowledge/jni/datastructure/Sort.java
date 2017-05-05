package com.knowledge.jni.datastructure;

/**
 * Created by universe on 2017/5/5.
 */

public class Sort {

    public static native int[] quickSort(int[] nums);

    public static native int[] bubbleSort(int[] nums);

    static {
        System.loadLibrary("jniTest");
    }

}
