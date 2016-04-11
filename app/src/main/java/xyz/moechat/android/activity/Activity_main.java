package xyz.moechat.android.activity;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.LinearLayout;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;
import xyz.moechat.android.main.login.chat.fragment_chat;
import xyz.moechat.android.main.view.nav;
import xyz.moechat.android.utils.Util_Activity;

public class Activity_main extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Util_Activity.Activity_main=this;
        findViewById(null);

        //初始化fragments
        fragments = new basefragment[] { fragment_chat.newInstance()};
        android.support.v4.app.FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.linearlayout_main, fragments[fragments_index]);
        fragmentTransaction.show(fragments[fragments_index]);
        fragmentTransaction.commit();
        //

        nav.setSelected(0);
    }

    private basefragment[] fragments;
    private int fragments_index=0;

    public void findViewById(View view){
        //中间
        linearLayout_main=(LinearLayout)findViewById(R.id.linearlayout_main);
        //底部导航
        nav=(xyz.moechat.android.main.view.nav)findViewById(R.id.nav_main);
    }
    //顶部

    //中间内容
    LinearLayout linearLayout_main;
    //底部导航栏
    nav nav;

}
