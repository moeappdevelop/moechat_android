package xyz.moechat.android.main.my;

import xyz.moechat.android.R;
import xyz.moechat.android.base.Basefragment;

/**
 *
 * Created by timeloveboy on 16/4/13.
 */
public class fragment_my extends Basefragment {
    public static fragment_my fragment=new fragment_my();
    public static fragment_my newInstance(){
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_favorities;
    }

}
