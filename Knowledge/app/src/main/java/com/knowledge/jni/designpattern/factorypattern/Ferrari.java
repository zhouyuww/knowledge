package com.knowledge.jni.designpattern.factorypattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/1.
 */

public class Ferrari implements Car {

    @Override
    public void run() {
        Log.e("Ferrari","run");
    }

}
