package com.knowledge.jni.designpattern.flyweightpattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/8.
 */

public class Circle {

    private int size;

    private int color;

    private String name;

    public Circle(String name){
      this.name = name;
    }

    public void setSize(int size){
        this.size =size;
    }

    public void setColor(int color ){
        this.color = color;
    }


    public void show(){
        Log.e("Circle",name+"  size :"+size+"  color:"+color);
    }

}
