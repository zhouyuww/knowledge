package com.knowledge.jni.designpattern.factorypattern;

/**
 * Created by universe on 2017/6/1.
 */

public class CarFactory {


    public static final int Bm = 0;
    public static final int Byd = 1;
    public static final int Ferrari = 2;

    public CarFactory(){

    }

    public  Car  createCar(int type){
        switch (type){
            case  Bm:
                return  new BM();
            case  Byd:
                return  new Byd();
            case  Ferrari:
                return  new Ferrari();
            default:
                return new BM();
        }
    }


    public static void test(){

        CarFactory carFactory = new CarFactory();
        carFactory.createCar(Bm).run();
        carFactory.createCar(Byd).run();
        carFactory.createCar(Ferrari).run();

    }

}
