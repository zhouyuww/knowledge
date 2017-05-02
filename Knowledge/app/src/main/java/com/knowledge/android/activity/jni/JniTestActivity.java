package com.knowledge.android.activity.jni;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.knowledge.R;
import com.knowledge.jni.math.MathKit;

/**
 * Created by universe on 2017/5/2.
 */

public class JniTestActivity extends Activity {

    public TextView startMath ;
    public TextView conclusion ;
    public String tag;
    public Context context;
    public int start=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jni_layout);
        init();
        goTest();
    }

    private void  init(){
        startMath = (TextView)findViewById(R.id.tv_math);
        conclusion  = (TextView)findViewById(R.id.tv_conclusion);
        tag = this.getClass().getName();
        context = this;
    }

    public void goTest() {
        startMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    start = MathKit.square(start);
                    conclusion.setText(start+"");
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