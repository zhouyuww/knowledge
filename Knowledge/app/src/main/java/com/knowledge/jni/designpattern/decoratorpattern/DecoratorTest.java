package com.knowledge.jni.designpattern.decoratorpattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/7.
 */

public class DecoratorTest {


    public static void test(){

        Coffee coffee= new NormalCoffee();

        MilkDecorator milkDecorator = new MilkDecorator(coffee);

        SugerDecorator sugerDecorator = new SugerDecorator(milkDecorator);

        Log.e("DecoratorTest",sugerDecorator.getName());
    }

}
