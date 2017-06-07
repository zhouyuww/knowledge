package com.knowledge.android.activity.jni;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.knowledge.R;
import com.knowledge.jni.datastructure.Sort;
import com.knowledge.jni.designpattern.abstractfactory.FactoryTest;
import com.knowledge.jni.designpattern.adapterpattern.AudioPlayer;
import com.knowledge.jni.designpattern.bridgepattern.CircleDraw;
import com.knowledge.jni.designpattern.compositepattern.Company;
import com.knowledge.jni.designpattern.criteriapattern.CriterPattern;
import com.knowledge.jni.designpattern.decoratorpattern.DecoratorTest;
import com.knowledge.jni.designpattern.prototypepattern.ShapeCache;
import com.knowledge.jni.designpattern.factorypattern.CarFactory;

/**
 * Created by universe on 2017/5/2.
 */

public class JniTestActivity extends Activity {

    public TextView startMath;
    public TextView conclusion;
    public String tag;
    public Context context;
    public int start = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jni_layout);
        init();
        goTest();
    }

    private void init() {
        startMath = (TextView) findViewById(R.id.tv_math);
        conclusion = (TextView) findViewById(R.id.tv_conclusion);
        tag = this.getClass().getName();
        context = this;
    }

    public void goTest() {
        startMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int[] array = new int[]{33, 8, 30, 98, 33, 1, 5, 44, 556, 110, 2020, 23, 2, 2232, 23, 22344, 5454, 546, 7, 454, 5445, 643, 10987, 232, 324, 23564, 6565, 80906};
                    int[] tar = Sort.bubbleSort(array);
//                    Linkedlist.singlylinkedlist(tar);
                    Sort.quickSort(array);
//                    Sort.choiceSort(array);
//                    Sort.shellSort(array);
                    Log.e(tag, tar.toString());
                    conclusion.setText(start + "");
//                    CarFactory.test();
//                    FactoryTest.test();
//                    ShapeCache.test();
//                    AudioPlayer.test();
                    CircleDraw.test();
                    CriterPattern.test();
                    Company.test();
                    DecoratorTest.test();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e(tag, "onStart");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.e(tag, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(tag, "onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.e(tag, "onStop");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(tag, "onDestory");
    }

}
