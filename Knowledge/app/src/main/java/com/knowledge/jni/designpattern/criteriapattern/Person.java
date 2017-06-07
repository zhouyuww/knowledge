package com.knowledge.jni.designpattern.criteriapattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/6.
 */

public class Person {

    public String type;

    public String name;


    public Person(String type,String name){
        this.name = name;
        this.type = type;
    }

    public void show(){
        Log.e("Person","name:"+name+"   type:"+type);
    }

}
