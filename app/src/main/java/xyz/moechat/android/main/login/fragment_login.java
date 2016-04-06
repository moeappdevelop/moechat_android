package xyz.moechat.android.main.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class fragment_login extends basefragment implements View.OnClickListener {
    private TextView textView_login,textView_temp,textView_register;

    public static fragment_login fragment=new fragment_login();
    public static fragment_login newInstance(){
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        findViewById(mRootView);
        return mRootView;
    }
    void findViewById(View view){
        
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }


    @Override
    public void onClick(View v) {

    }
}
