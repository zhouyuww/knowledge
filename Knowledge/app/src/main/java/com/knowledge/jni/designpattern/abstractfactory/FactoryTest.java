package com.knowledge.jni.designpattern.abstractfactory;

/**
 * Created by universe on 2017/6/1.
 */

public class FactoryTest {

     public  static void  test(){

         FactoryImp colorFactory = new ColorFactory();
         colorFactory.createColor(0).showColor();
         colorFactory.createColor(1).showColor();
         colorFactory.createColor(2).showColor();

         FactoryImp shapeFactory = new ShapeFactory();
         shapeFactory.createShape(0).showShape();
         shapeFactory.createShape(1).showShape();
         shapeFactory.createShape(2).showShape();

     }


}
