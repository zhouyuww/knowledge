package com.knowledge.jni.designpattern.AbstractFactory;

/**
 * Created by universe on 2017/6/1.
 */

public class ShapeFactory implements FactoryImp {


    @Override
    public Shape createShape(int type) {
        switch (type){
            case 0:
                return new Square();
            case 1:
                return new Triangle();
            case 2:
                return new Circle();
        }
        return new Circle();
    }


    @Override
    public Color createColor(int type) {
        return null;
    }


}
