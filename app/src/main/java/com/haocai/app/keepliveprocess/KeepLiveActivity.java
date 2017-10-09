package com.haocai.app.keepliveprocess;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;




/**
 * Created by Xionghu on 2017/9/30.
 * Desc:
 */

public class KeepLiveActivity extends Activity {
    private static final String TAG ="KeepLive" ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       moveTaskToBack(true); //按home键不退出程序

        Log.i(TAG,"KeepLiveActivity----onCreate");
        Window window = getWindow();
        window.setGravity(Gravity.LEFT|Gravity.TOP);
        WindowManager.LayoutParams params =window.getAttributes();
        params.height = 1;
        params.width  = 1;
        params.x = 0;
        params.y = 0;
        window.setAttributes(params);
        KeepLiveActivityManager.getInstance(this).setKeepLiveActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "KeepLiveActivity----onDestroy!!!");
    }
}
