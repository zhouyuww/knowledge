package com.knowledge.jni.designpattern.abstractfactory;

/**
 * Created by universe on 2017/6/1.
 */

public class ColorFactory implements FactoryImp {

    @Override
    public Shape createShape(int type) {
        return null;
    }

    @Override
    public Color createColor(int type) {
          switch (type){
              case 0:
                  return new Red();
              case 1:
                  return new Yellow();
              case 2:
                  return new Green();
          }
        return new Red();
    }

}
