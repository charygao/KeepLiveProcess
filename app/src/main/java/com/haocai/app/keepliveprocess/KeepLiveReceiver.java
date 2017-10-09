package com.haocai.app.keepliveprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Xionghu on 2017/9/30.
 * Desc:
 */

public class KeepLiveReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(intent.ACTION_SCREEN_ON.equals(action)){

        }
    }
}
