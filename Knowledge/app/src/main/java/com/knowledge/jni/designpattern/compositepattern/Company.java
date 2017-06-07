package com.knowledge.jni.designpattern.compositepattern;

/**
 * Created by universe on 2017/6/7.
 */

public class Company {


    public static Employee ceo =new Employee("ceo",1);

    public static void showEmployees(){
          ceo.showTeam();
    }


    public static void test(){
        ceo.addWorker(new Employee("worker1",0));
        ceo.addWorker(new Employee("worker2",0));
        ceo.addWorker(new Employee("worker3",0));
        ceo.addWorker(new Employee("worker4",0));
        showEmployees();
    }


}
