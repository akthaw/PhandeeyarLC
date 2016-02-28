package com.example.android.phandeeyarlivecoding;

import android.app.Application;
import android.content.Context;

/**
 * Created by akthaw on 2/27/16.
 */
public class PhandeeyarLiveCodingApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    /**
     * Inorder to access from anywhere of App
     * @return
     */
    public static Context getContext() {
        return context;
    }
}
