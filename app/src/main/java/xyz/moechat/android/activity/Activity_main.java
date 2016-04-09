package xyz.moechat.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.LinearLayout;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;
import xyz.moechat.android.main.login.chat.fragment_chat;
import xyz.moechat.android.utils.Util_Activity;

public class Activity_main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Util_Activity.Activity_main=this;
        findViewById(null);

        //初始化fragments
        basefragments = new basefragment[] { fragment_chat.newInstance()};
    }

    private basefragment[] basefragments;
    public void findViewById(View view){

        //中间
        linearLayout_main=(LinearLayout)findViewById(R.id.linearlayout_main);
    }
    //顶部

    //中间内容
    LinearLayout linearLayout_main;
    //底部导航栏

}
