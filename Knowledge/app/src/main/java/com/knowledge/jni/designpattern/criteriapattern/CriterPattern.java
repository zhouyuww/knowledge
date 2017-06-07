package com.knowledge.jni.designpattern.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by universe on 2017/6/6.
 */

public class CriterPattern {




    public static void test(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("single","hello one"));
        personList.add(new Person("male","hello two"));
        personList.add(new Person("female","hello three"));
        personList.add(new Person("single","hello four"));
        personList.add(new Person("male","hello five"));

        showCriter(new FemaleCriter().criterPerson(personList));
        showCriter(new SingleCriter().criterPerson(personList));
        showCriter(new MaleCriter().criterPerson(personList));
    }


    public static void showCriter( List<Person> personList ){
         for(Person person:personList){
             person.show();
         }
    }


}
