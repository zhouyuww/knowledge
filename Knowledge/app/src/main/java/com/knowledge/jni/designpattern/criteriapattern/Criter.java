package com.knowledge.jni.designpattern.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by universe on 2017/6/6.
 */

public interface Criter {

    List<Person>  cirter = new ArrayList<Person>();


    public  List<Person> criterPerson( List<Person>  cirter);


}
