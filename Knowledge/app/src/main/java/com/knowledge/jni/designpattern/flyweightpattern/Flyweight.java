package com.knowledge.jni.designpattern.flyweightpattern;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by universe on 2017/6/8.
 */

public class Flyweight {

    public HashMap<String,Circle> cache = new HashMap<>();

    public Circle getCircle(String name){
        Circle circle = cache.get(name);
        if(null==circle){
            circle = new Circle(name);
            circle.setColor(5);
            circle.setSize(10);
            cache.put(name,circle);
        }
        return circle;
    }



}
