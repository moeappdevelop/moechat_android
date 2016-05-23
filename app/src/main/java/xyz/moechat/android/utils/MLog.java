package xyz.moechat.android.utils;

import android.util.Log;

import xyz.moechat.android.global.Constant;

/**
 * Created by timeloveboy on 16/3/10.
 */
public class MLog {

    public static void v(String tag,String content){
        if(Constant.debug) {
            if(tag==null){
                Log.v("moe", content);
            }else
            Log.v(tag, content);
        }
    }
}
