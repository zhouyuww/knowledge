package com.knowledge.jni.designpattern.AbstractFactory;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Circle implements Shape {
    @Override
    public void showShape() {
        Log.e("Shape","Shape Circle");
    }
}
