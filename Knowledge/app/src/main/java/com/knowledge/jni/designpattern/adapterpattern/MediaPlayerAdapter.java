package com.knowledge.jni.designpattern.adapterpattern;

/**
 * Created by universe on 2017/6/5.
 */

public  class MediaPlayerAdapter implements  MediaPlayer{

    public AdvancedMediaPlayer mediaPlayer;

    public MediaPlayerAdapter(String type){

           if(type.equals("Mp4Player")){
               mediaPlayer = new Mp4Player();
           }else if(type.equals("FlyPlayer")){
               mediaPlayer = new FlyPlayer();
           }

    }

    @Override
    public void play() {
        mediaPlayer.goPlay();
    }

}
