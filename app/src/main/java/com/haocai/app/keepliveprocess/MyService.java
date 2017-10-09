package com.haocai.app.keepliveprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Xionghu on 2017/9/30.
 * Desc:
 */

public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ScreenListener listener = new ScreenListener(this);
        listener.begin(new ScreenListener.ScreenStateListener() {
            @Override
            public void onScreenOn() {
                //开屏---finish这个一像素的Activity
                KeepLiveActivityManager.getInstance(MyService.this).finishKeepLiveActivity();
            }

            @Override
            public void onScreenOff() {
                //锁屏---启动一像素的Activity
                KeepLiveActivityManager.getInstance(MyService.this).startKeepLiveActivity();
            }

            @Override
            public void onUserPresent() {

            }
        });

    }
}
