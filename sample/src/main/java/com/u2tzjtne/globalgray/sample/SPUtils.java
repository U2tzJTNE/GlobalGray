package com.u2tzjtne.globalgray.sample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 *
 * @author u2tzjtne
 * @date 2017/10/9
 * <p>
 * SharedPreferences工具类
 */
public class SPUtils {

    private static SharedPreferences sp = App.getContext()
            .getSharedPreferences("APP_DATA", Context.MODE_PRIVATE);
    private static SharedPreferences.Editor edit = sp.edit();

    public static void putBoolean(String key, boolean value) {
        edit.putBoolean(key, value);
        edit.apply();
    }

    public static boolean getBoolean(String key, boolean defValue) {
        return sp.getBoolean(key, defValue);
    }

    public static void putInt(String key, int value) {
        edit.putInt(key, value);
        edit.apply();
    }

    public static int getInt(String key, int defValue) {
        return sp.getInt(key, defValue);
    }

    public static void putString(String key, String value) {
        edit.putString(key, value);
        edit.apply();
    }

    public static String getString(String key, String defValue) {
        return sp.getString(key, defValue);
    }
}
