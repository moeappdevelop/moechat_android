package xyz.moechat.android.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.LinearLayout;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;
import xyz.moechat.android.main.chat.fragment_chat;
import xyz.moechat.android.main.favorites.fragment_favorities;
import xyz.moechat.android.main.view.nav;
import xyz.moechat.android.utils.Util_Activity;

public class Activity_main extends FragmentActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Util_Activity.Activity_main=this;
        findViewById(null);
        setOnClickListener();
        //region 初始化fragments
        fragments = new basefragment[] { fragment_chat.newInstance(), fragment_favorities.newInstance()};
        select_fragment(0);
        nav.setSelected(0);
        //endregion
    }



    //region fragment
    private basefragment[] fragments;
    private Integer fragments_index;
    public void select_fragment(int goto_fragments_index){
        if(fragments_index==null){
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragments_index=0;
            fragmentTransaction.add(R.id.linearlayout_main, fragments[goto_fragments_index]);
            fragmentTransaction.show(fragments[goto_fragments_index]);
            fragmentTransaction.commit();
        }
        if(goto_fragments_index!=fragments_index) {
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            if(fragments_index>goto_fragments_index) {
                fragmentTransaction.setCustomAnimations(
                        R.anim.in_from_left,
                        R.anim.out_to_right,
                        R.anim.in_from_bottom,
                        R.anim.out_to_bottom);
            }else {
                fragmentTransaction.setCustomAnimations(
                        R.anim.in_from_right,
                        R.anim.out_to_left,
                        R.anim.in_from_bottom,
                        R.anim.out_to_bottom);
            }
            fragmentTransaction.hide(fragments[fragments_index]);

            if (!fragments[goto_fragments_index].isAdded()) {
                fragmentTransaction.add(R.id.linearlayout_main, fragments[goto_fragments_index]);
            }
            fragmentTransaction.show(fragments[goto_fragments_index]);
            fragmentTransaction.commit();
            fragments_index=goto_fragments_index;
        }
    }
    //endregion
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
    private void setOnClickListener(){
        nav.getRelativeLayout_nav_chat().setOnClickListener(this);
        nav.getRelativeLayout_nav_favorities().setOnClickListener(this);
        nav.getRelativeLayout_nav_discover().setOnClickListener(this);
        nav.getRelativeLayout_nav_me().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nav_relativeLayout_chat:
                nav.setSelected(0);
                select_fragment(0);
                break;
            case R.id.nav_relativeLayout_favorities:
                nav.setSelected(1);
                select_fragment(1);
                break;
            case R.id.nav_relativeLayout_discover:
                nav.setSelected(2);
                break;
            case R.id.nav_relativeLayout_me:
                nav.setSelected(3);
                break;
        }
    }
}
