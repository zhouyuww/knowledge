package com.knowledge.jni.designpattern.bridgepattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/6.
 */

public class RedDraw implements DrawApi{

    @Override
    public void draw(int x, int y) {
        Log.e("","RedDraw:"+"x:"+x+"y:"+y);
    }

}
