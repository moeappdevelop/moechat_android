package xyz.moechat.android.main.login.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;

/**
 * Created by timeloveboy on 16/4/10.
 */
public class fragment_chat extends basefragment implements View.OnClickListener {
    public static fragment_chat fragment=new fragment_chat();
    public static fragment_chat newInstance(){
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        findViewById(saveView);
        setOnClickListener();
        return saveView;
    }
    void findViewById(View view){
    }
    void setOnClickListener(){
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_chat;
    }


    @Override
    public void onClick(View v) {

    }
}
