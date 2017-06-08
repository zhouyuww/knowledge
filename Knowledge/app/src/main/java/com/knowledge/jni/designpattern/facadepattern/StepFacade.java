package com.knowledge.jni.designpattern.facadepattern;

/**
 * Created by universe on 2017/6/8.
 */

public class StepFacade {

    private StepOne one;

    private StepTwo two;

    private StepThree three;


    public StepFacade(){
        one = new StepOne();
        two = new StepTwo();
        three = new StepThree();
    }

    public void doNow(){
        one.doStepOne();
        two.doStep();
        three.doStep();
    }


}
