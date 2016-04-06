package xyz.moechat.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.widget.LinearLayout;

import xyz.moechat.android.R;
import xyz.moechat.android.utils.Util_SharedPreferences;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class Activity_splash extends FragmentActivity {

    /*
    界面
     */
    LinearLayout linearLayout_blank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        findView();

        Util_SharedPreferences.getUserId();

        handler.sendEmptyMessageDelayed(0, 1500);
    }
    void findView(){
        linearLayout_blank=(LinearLayout)findViewById(R.id.linearlayout_blank);
    }
    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            Activity_goto();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };
    void Activity_goto(){
        Intent intent = new Intent();
        intent.setClass(this, Activity_login.class);

        Bundle bundle = new Bundle();
        bundle.putString("fragment","login");

        intent.putExtras(bundle);
        startActivity(intent);
    }
}
