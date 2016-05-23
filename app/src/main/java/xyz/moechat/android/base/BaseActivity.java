package xyz.moechat.android.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import xyz.moechat.android.utils.MLog;

/**
 * Created by timeloveboy on 16/5/23.
 */
public class BaseActivity extends FragmentActivity{
    @Override
    protected void onStart() {
        super.onStart();
        MLog.v("reading", getClass().getName() + ":onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MLog.v("reading", getClass().getName() + ":onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        MLog.v("reading", getClass().getName() + ":onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MLog.v("reading", getClass().getName() + ":onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MLog.v("reading", getClass().getName() + ":onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        MLog.v("reading", getClass().getName() + ":onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        MLog.v("reading", getClass().getName() + ":onRestoreInstanceState");
    }
}
