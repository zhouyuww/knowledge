package com.knowledge.jni.designpattern.decoratorpattern;

import android.util.Log;

/**
 * Created by universe on 2017/6/7.
 */

public class NormalCoffee implements Coffee {

    public String name = "NormalCoffee";

    @Override
    public String getName() {
        return name;
    }

}
