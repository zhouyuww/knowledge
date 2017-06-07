package com.knowledge.jni.designpattern.bridgepattern;

/**
 * Created by universe on 2017/6/6.
 */

public abstract class Shape {

    public DrawApi drawApi;

    public Shape(DrawApi drawApi){
        this.drawApi=drawApi;
    }

    public abstract  void draw();
}
