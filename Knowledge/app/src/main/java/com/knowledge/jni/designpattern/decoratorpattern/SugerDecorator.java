package com.knowledge.jni.designpattern.decoratorpattern;

/**
 * Created by universe on 2017/6/7.
 */

public class SugerDecorator  implements Coffee{

    private String name="Suger";

    private Coffee coffee;

    public SugerDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return name+" "+coffee.getName();
    }

}
