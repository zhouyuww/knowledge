package com.knowledge.jni.designpattern.compositepattern;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by universe on 2017/6/7.
 */

public class Employee {

    public String name;

    public int type ;

    public ArrayList<Employee> subEmployee = new ArrayList<>();

    public Employee(String name,int type){

         this.name= name;
         this.type =type;

    }


    public void addWorker(Employee employee){
        subEmployee.add(employee);
    }

    public void showTeam(){
        Log.e("Employee","name:"+name+"type:"+type);
        for(Employee tar:subEmployee){
            Log.e("Employee","name:"+tar.name+"type:"+tar.type);
        }
    }


}
