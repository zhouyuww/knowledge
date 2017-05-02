package com.knowledge.android.activity.launchmodule.standard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.knowledge.android.activity.launchmodule.LaunchmoduleBaseActivity;

/**
 * Created by universe on 2017/4/24.
 */

public class SingleStandardActivity extends LaunchmoduleBaseActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(tag,"onCreate");
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(tag,"onNewIntent");
    }

}
