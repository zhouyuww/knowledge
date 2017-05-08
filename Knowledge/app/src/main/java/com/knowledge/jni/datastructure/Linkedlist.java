package com.knowledge.jni.datastructure;

/**
 * Created by universe on 2017/5/8.
 */

public class Linkedlist {

    public static native int[] singlylinkedlist(int[] nums);

    static {
        System.loadLibrary("jniTest");
    }


}
