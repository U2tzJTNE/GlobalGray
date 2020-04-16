package com.u2tzjtne.globalgray.sample;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.u2tzjtne.globalgray.GlobalGray;

/**
 * @author u2tzjtne
 */
public class App extends Application {
    private static Context context;
    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        Log.d(TAG,"app is onCreate: enable_gray "+SPUtils.getBoolean("enable_gray", false));
        GlobalGray.enable(SPUtils.getBoolean("enable_gray", false));
    }

    public static Context getContext() {
        return context;
    }
}