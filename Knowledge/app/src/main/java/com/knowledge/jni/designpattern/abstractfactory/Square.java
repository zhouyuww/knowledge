package com.knowledge.jni.designpattern.abstractfactory;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Square implements Shape {

    @Override
    public void showShape() {
        Log.e("Square","Square Circle");
    }

}
