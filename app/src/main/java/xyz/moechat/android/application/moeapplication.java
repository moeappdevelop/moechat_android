package xyz.moechat.android.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class moeapplication extends Application{
    public static Context getContext() {
        return context;
    }

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
}
