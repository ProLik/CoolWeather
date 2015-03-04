package com.prolik.android.coolweather.util;

import android.util.Log;

/**
 * Created by Administrator on 2015/3/4.
 */
public class LogUtil {
    public static final int sVERBOSE = 1;

    public static final int sDEBUG = 2;

    public static final int sINFO = 3;

    public static final int sWARN = 4;

    public static final int sERROR = 5;

    public static final int sNOTHING = 6;

    public static final int sLEVEL = sVERBOSE;

    public static void v(String tag, String msg) {
        if (sLEVEL <= sVERBOSE) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (sLEVEL <= sDEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (sLEVEL <= sINFO) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (sLEVEL <= sWARN) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (sLEVEL <= sERROR) {
            Log.e(tag, msg);
        }
    }


}
