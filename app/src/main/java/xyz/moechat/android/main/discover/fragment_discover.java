package xyz.moechat.android.main.discover;

import xyz.moechat.android.R;
import xyz.moechat.android.base.Basefragment;

/**
 * Created by timeloveboy on 16/4/13.
 */
public class fragment_discover extends Basefragment {
    public static fragment_discover fragment=new fragment_discover();
    public static fragment_discover newInstance(){
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discover;
    }

}
