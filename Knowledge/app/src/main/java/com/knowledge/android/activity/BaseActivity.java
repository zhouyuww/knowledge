package com.knowledge.android.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

import com.knowledge.R;
import com.knowledge.android.activity.launchmodule.singleinstance.SingleInstanceActivity;
import com.knowledge.android.activity.launchmodule.singletask.SingleTaskActivity;
import com.knowledge.android.activity.launchmodule.singletop.SingleTopActivity;
import com.knowledge.android.activity.launchmodule.standard.SingleStandardActivity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by universe on 2017/5/2.
 */

public class BaseActivity extends Activity{

    public TextView singleStandard ;
    public TextView singleTop ;
    public TextView singleTask ;
    public TextView singleInstance ;
    public String tag;
    public Context context;
    public ArrayList arrayList;
    public Vector vector;
    public LinkedList linkedList;
    public SparseArray sparseArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_module_base_activity);
        init();
        goTest();
    }

    private void  init(){
        singleTop = (TextView)findViewById(R.id.tv_singletop);
        singleTask  = (TextView)findViewById(R.id.tv_singletask);
        singleInstance  = (TextView)findViewById(R.id.tv_singleinstance);
        singleStandard  = (TextView)findViewById(R.id.tv_stantard);
        tag = this.getClass().getName();
        context = this;
    }

    public void goTest() {
        singleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setClass(context, SingleTopActivity.class);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        singleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setClass(context,SingleTaskActivity.class);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        singleStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setClass(context,SingleStandardActivity.class);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        singleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setClass(context, SingleInstanceActivity.class);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e(tag,"onStart");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.e(tag,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(tag,"onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.e(tag,"onStop");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(tag,"onDestory");
    }

}
