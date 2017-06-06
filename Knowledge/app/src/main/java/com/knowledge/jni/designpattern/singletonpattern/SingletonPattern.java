package com.knowledge.jni.designpattern.singletonpattern;

/**
 * Created by universe on 2017/6/1.
 */

public class SingletonPattern {

    private volatile  static SingletonPattern ins;


    private SingletonPattern(){

    }

    public static SingletonPattern getIns(){
        synchronized (ins){
            if(null==ins){
                ins = new SingletonPattern();
            }
        }
        return  ins;
    }


}
