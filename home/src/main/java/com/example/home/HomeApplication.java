package com.example.home;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class HomeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
