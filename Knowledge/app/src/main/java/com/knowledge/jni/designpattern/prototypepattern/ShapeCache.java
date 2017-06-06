package com.knowledge.jni.designpattern.prototypepattern;

import java.util.HashMap;

/**
 * Created by universe on 2017/6/5.
 */

public class ShapeCache {


    public static HashMap<String,Shape> cache = new HashMap<>();

    public static Shape getShape(String shape){
        Shape   tar = cache.get(shape);
        return  (Shape)tar.clone();
    }


    public static void createCache(){
        Circle circle = new Circle();
        cache.put("circle",circle);
        Square square = new Square();
        cache.put("square",square);
    }



    public static void test(){
        createCache();
        getShape("circle").showName();
        getShape("square").showName();
    }

}
