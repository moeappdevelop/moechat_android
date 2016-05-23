package xyz.moechat.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;

import xyz.moechat.android.R;
import xyz.moechat.android.base.BaseActivity;
import xyz.moechat.android.main.chat.fragment_chat_chatting;
import xyz.moechat.android.main.login.fragment_login;
import xyz.moechat.android.utils.Util_Activity;


public class Activity_next extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        Util_Activity.Activity_next = this;

        Bundle bundle = this.getIntent().getExtras();
        String togo_fragment = "";
        if(bundle==null){
            togo_fragment="fragment_chat_chatting";
        }else {
            togo_fragment= bundle.getString("fragment", "fragment_chat_chatting");}
        replaceFragment(togo_fragment);
    }

    
    private void replaceFragment(String fragment) {
        switch (fragment) {
            case "fragment_chat_chatting":// 登录
                replaceFragment(fragment_chat_chatting.newInstance());
                break;
            default:
                //throw new Throwable("没有fragment");
                break;
        }
    }
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction();
        if (fragment.isAdded()) {
            fragmentTransaction.show(fragment);
        } else {
            fragmentTransaction.replace(R.id.linearlayout_blank, fragment,
                    fragment.getClass().getName());
        }
        fragmentTransaction.commit();
    }

}