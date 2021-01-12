package com.bawei.usercenter;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class UserCenterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
