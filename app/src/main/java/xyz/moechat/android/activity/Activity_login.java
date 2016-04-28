package xyz.moechat.android.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import org.json.JSONException;
import org.json.JSONObject;

import xyz.moechat.android.R;
import xyz.moechat.android.dbcenter.DatalocationDB;
import xyz.moechat.android.main.login.fragment_login;
import xyz.moechat.android.utils.MLog;
import xyz.moechat.android.utils.Util_Activity;

/**
 * Created by timeloveboy on 16/4/6.
 */
public class Activity_login extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_blank);
        Util_Activity.Activity_login=this;
        Bundle bundle = this.getIntent().getExtras();
        String fragment = "";
        if (bundle != null) {
            fragment = bundle.getString("fragment", "login");
        }
        replaceFragment(fragment);

    }
    //控件

    private void replaceFragment(String fragment) {
        switch (fragment) {
            case "login":// 登录
                replaceFragment(fragment_login.newInstance());
                break;

            default:
                break;
        }
    }
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (fragment.isAdded()) {
            fragmentTransaction.show(fragment);
        } else {
            fragmentTransaction.replace(R.id.linearlayout_blank, fragment, fragment.getClass().getName());
        }
        fragmentTransaction.commit();
    }
}
