package com.knowledge.jni.designpattern.prototypepattern;


/**
 * Created by universe on 2017/6/5.
 */

public abstract class Shape implements Cloneable {

       public abstract void showName();

       public Object clone(){
           Object result = null;
           try{
               result = super.clone();
           }catch (Exception e){
               e.printStackTrace();
           }
           return  result;
       }

}
