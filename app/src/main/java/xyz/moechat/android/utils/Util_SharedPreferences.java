package xyz.moechat.android.utils;

import android.content.Context;
import android.content.SharedPreferences;

import xyz.moechat.android.application.moeapplication;
import xyz.moechat.android.global.Constant;
import xyz.moechat.android.global.Params;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class Util_SharedPreferences {
    public static final String name="config";
    public static void getUserId(){
        SharedPreferences sp;
        sp = moeapplication.getContext().getSharedPreferences(name,Context.MODE_PRIVATE);
        String user_id = sp.getString("info_uid", Constant.ISLOGINUID);
        sp = null;
        Params.user_id = user_id;
    }
}
