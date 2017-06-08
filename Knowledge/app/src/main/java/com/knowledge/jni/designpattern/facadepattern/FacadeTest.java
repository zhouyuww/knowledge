package com.knowledge.jni.designpattern.facadepattern;

/**
 * Created by universe on 2017/6/8.
 */
//外观模式

public class FacadeTest {

    public static void test(){
        StepFacade stepFacade = new StepFacade();
        stepFacade.doNow();
    }


}
