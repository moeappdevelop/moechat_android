package xyz.moechat.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;

import xyz.moechat.android.R;
import xyz.moechat.android.utils.Util_Activity;


public class Activity_next extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        Util_Activity.Activity_next = this;

        Bundle bundle = this.getIntent().getExtras();
        String fragment = "";
        if (bundle != null) {
            fragment = bundle.getString("fragment", "login");
        }
        replaceFragment(fragment);
    }

    
    private void replaceFragment(String fragment) {
        switch (fragment) {
            default:
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