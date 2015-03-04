package com.prolik.android.coolweather.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2015/3/4.
 */
public class ProjectApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext(){
        return sContext;
    }
}
