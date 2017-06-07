package com.knowledge.jni.designpattern.bridgepattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/6.
 */

public class GreenDraw implements DrawApi {
    @Override
    public void draw(int x,int y) {
         Log.e("","GreenDraw:"+"x:"+x+"y:"+y);
    }
}
