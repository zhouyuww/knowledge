package com.knowledge.jni.designpattern.AbstractFactory;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Triangle implements Shape {

    @Override
    public void showShape() {
        Log.e("Triangle","Triangle Circle");
    }

}
