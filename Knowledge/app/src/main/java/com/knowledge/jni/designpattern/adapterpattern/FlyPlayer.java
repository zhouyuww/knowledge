package com.knowledge.jni.designpattern.adapterpattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/5.
 */

public class FlyPlayer implements AdvancedMediaPlayer {


    @Override
    public void goPlay() {
        Log.e("AdvancedMediaPlayer","FlyPlayer");
    }


}
