package com.knowledge.jni.designpattern.AbstractFactory;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Yellow implements Color {
    @Override
    public void showColor() {
        Log.e("Yellow","Yellow Color");
    }
}
