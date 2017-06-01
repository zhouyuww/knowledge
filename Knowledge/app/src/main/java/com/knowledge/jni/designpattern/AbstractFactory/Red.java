package com.knowledge.jni.designpattern.AbstractFactory;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Red implements Color {

    @Override
    public void showColor() {
        Log.e("Red","Red Color");
    }
}
