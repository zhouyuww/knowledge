package com.knowledge.jni.designpattern.abstractfactory;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Green implements Color {

    @Override
    public void showColor() {
        Log.e("Red","Red Green");
    }

}
