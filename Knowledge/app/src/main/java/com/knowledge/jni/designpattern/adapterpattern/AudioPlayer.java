package com.knowledge.jni.designpattern.adapterpattern;

/**
 * Created by universe on 2017/6/5.
 */

public class AudioPlayer  implements  MediaPlayer{

    MediaPlayerAdapter mediaPlayerAdapter;

    public AudioPlayer(String type){
        mediaPlayerAdapter = new MediaPlayerAdapter(type);
    }

    @Override
    public void play() {
        mediaPlayerAdapter.play();
    }

    public static void test(){
        AudioPlayer audioPlayer = new AudioPlayer("Mp4Player");
        audioPlayer.play();
    }

}
