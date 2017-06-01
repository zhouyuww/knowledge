package com.knowledge.jni.designpattern.AbstractFactory;

/**
 * Created by universe on 2017/6/1.
 */

public interface FactoryImp {

    public Shape createShape(int type);

    public Color createColor(int type);

}
