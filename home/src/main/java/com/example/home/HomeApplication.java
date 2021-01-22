package com.example.home;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;

public class HomeApplication extends Application {
    final Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0x11) {
                Bundle bundle = msg.getData();
                String date = bundle.getString("msg");
            }
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
