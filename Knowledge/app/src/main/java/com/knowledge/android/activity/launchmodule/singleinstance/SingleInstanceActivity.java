package com.knowledge.android.activity.launchmodule.singleinstance;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.knowledge.R;
import com.knowledge.android.activity.launchmodule.LaunchmoduleBaseActivity;


/**
 * Created by universe on 2017/4/19.
 */

public class SingleInstanceActivity  extends LaunchmoduleBaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(tag, "onNewIntent");
    }

}
