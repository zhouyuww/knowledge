package com.knowledge.jni.designpattern.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by universe on 2017/6/6.
 */

public class SingleCriter implements Criter {


    @Override
    public List<Person> criterPerson(List<Person> cirter) {
        List<Person> result = new ArrayList<>();
        for(int i=0;i<cirter.size();i++){
             if(cirter.get(i).type.equals("single")){
                 result.add(cirter.get(i));
             }
        }
        return result;
    }


}
