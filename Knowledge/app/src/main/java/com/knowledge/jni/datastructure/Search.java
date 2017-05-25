package com.knowledge.jni.datastructure;

/**
 * Created by universe on 2017/5/25.
 */

public class Search {


    public static native int[] binarySearch(int[] nums,int tar);

    static {
        System.loadLibrary("jniTest");
    }


}
