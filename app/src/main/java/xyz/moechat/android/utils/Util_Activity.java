package xyz.moechat.android.utils;

import android.app.Activity;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class Util_Activity  {

    public static Activity Activity_main = null;
    public static Activity Activity_next = null;
    public static Activity Activity_login = null;

    public static void exit() {
        if (Activity_main != null && !Activity_main .isFinishing()) {
            Activity_main .finish();
        }
        if (Activity_next!= null && !Activity_next.isFinishing()) {
            Activity_next.finish();
        }
        if ( Activity_login!= null && ! Activity_login.isFinishing()) {
            Activity_login.finish();
        }
    }
}
