package com.u2tzjtne.globalgray.sample;

import android.app.Application;
import android.content.Context;

import com.u2tzjtne.globalgray.GlobalGray;

/**
 * @author u2tzjtne
 */
public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        GlobalGray.enable(SPUtils.getBoolean("enable_gray", false));
    }

    public static Context getContext() {
        return context;
    }
}