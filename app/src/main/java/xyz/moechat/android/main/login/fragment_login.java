package xyz.moechat.android.main.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import xyz.moechat.android.R;
import xyz.moechat.android.activity.Activity_main;
import xyz.moechat.android.base.Basefragment;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class fragment_login extends Basefragment implements View.OnClickListener {
    private Button button_login,button_temp,button_register;

    public static fragment_login fragment=new fragment_login();
    public static fragment_login newInstance(){
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        findViewById(saveView);
        setOnClickListener();
        return saveView;
    }
    void findViewById(View view){
        button_login=(Button)view.findViewById(R.id.button_login);
        button_temp=(Button)view.findViewById(R.id.button_nowlogin);
        button_register=(Button)view.findViewById(R.id.button_register);
    }
    void setOnClickListener(){
        button_login.setOnClickListener(this);
        button_temp.setOnClickListener(this);
        button_register.setOnClickListener(this);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_nowlogin:
                login_state login_state=new login_state();
                login_state.LoginIn();
                Intent intent=new Intent();
                intent.setClass(fragment.getActivity(), Activity_main.class);
                startActivity(intent);
                break;
        }
    }
}
