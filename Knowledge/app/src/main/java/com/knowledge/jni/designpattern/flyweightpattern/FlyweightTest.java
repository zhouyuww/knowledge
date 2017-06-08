package com.knowledge.jni.designpattern.flyweightpattern;

/**
 * Created by universe on 2017/6/8.
 */

public class FlyweightTest {


    public static void test(){

        Flyweight flyweight = new Flyweight();
        flyweight.getCircle("small");
        flyweight.getCircle("big");
        flyweight.getCircle("red");
        flyweight.getCircle("small").show();
        flyweight.getCircle("big").show();
        flyweight.getCircle("red").show();
    }

}
