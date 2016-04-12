package xyz.moechat.android.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;


import xyz.moechat.android.R;

/**
 * Created by timeloveboy on 16/4/12.
 */
public class spaceid extends LinearLayout {
    public spaceid(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.spaceid_linearlayout, this);
        findViewById();
    }
    private void findViewById(){

    }
    Button[] buttons;

}
