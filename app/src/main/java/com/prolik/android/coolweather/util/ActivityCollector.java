package com.prolik.android.coolweather.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ProLik on 2015/3/4.
 */
public class ActivityCollector {
    public static List<Activity> sActivities = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        if(!sActivities.contains(activity)){
            sActivities.add(activity);
        }

    }

    public static void removeActivity(Activity activity){
        sActivities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity : sActivities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
