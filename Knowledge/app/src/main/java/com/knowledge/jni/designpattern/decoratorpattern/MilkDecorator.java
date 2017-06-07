package com.knowledge.jni.designpattern.decoratorpattern;

import android.util.Log;

import com.knowledge.jni.designpattern.bridgepattern.Shape;

/**
 * Created by universe on 2017/6/7.
 */

public class MilkDecorator implements Coffee{

    public String name="Milk";

    private Coffee decorator;

    public MilkDecorator(Coffee coffee){
        this.decorator = coffee;
    }

    @Override
    public String getName() {
        Log.e("",name+" "+decorator.getName());
        return  name+" "+decorator.getName();
    }

}
