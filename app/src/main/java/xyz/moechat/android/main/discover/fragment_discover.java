package xyz.moechat.android.main.discover;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;

/**
 * Created by timeloveboy on 16/4/13.
 */
public class fragment_discover extends basefragment{
    public static fragment_discover fragment=new fragment_discover();
    public static fragment_discover newInstance(){
        return fragment;
    }
    @Override
    public String fragment_name(){
        return "fragment_discover";
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discover;
    }

}
