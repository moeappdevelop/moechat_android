package xyz.moechat.android.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import xyz.moechat.android.R;

/**
 * Created by timeloveboy on 16/4/11.
 */
public class nav extends LinearLayout {
    public nav(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.nav_linearlayout, this);
        findViewById();
    }
    private void findViewById(){
        imageViews[0]=(ImageView)findViewById(R.id.imageView_main_nav_chat);
        imageViews[1]=(ImageView)findViewById(R.id.imageView_main_nav_favorities);
        imageViews[2]=(ImageView)findViewById(R.id.imageView_main_nav_discover);
        imageViews[3]=(ImageView)findViewById(R.id.imageView_main_nav_me);

        textViews[0]=(TextView)findViewById(R.id.tv_weixin);
        textViews[1]=(TextView)findViewById(R.id.tv_contact_list);
        textViews[2]=(TextView)findViewById(R.id.tv_find);
        textViews[3]=(TextView)findViewById(R.id.tv_profile);

        relativeLayout_navs[0]=(RelativeLayout)findViewById(R.id.nav_relativeLayout_chat);
        relativeLayout_navs[1]=(RelativeLayout)findViewById(R.id.nav_relativeLayout_favorities);
        relativeLayout_navs[2]=(RelativeLayout)findViewById(R.id.nav_relativeLayout_discover);
        relativeLayout_navs[3]=(RelativeLayout)findViewById(R.id.nav_relativeLayout_me);
    }
    ImageView[] imageViews=new ImageView[4];
    TextView[] textViews=new TextView[4];
    RelativeLayout[] relativeLayout_navs=new RelativeLayout[4];
    public RelativeLayout getRelativeLayout_nav_me() {
        return relativeLayout_navs[0];
    }

    public RelativeLayout getRelativeLayout_nav_discover() {
        return relativeLayout_navs[1];
    }

    public RelativeLayout getRelativeLayout_nav_favorities() {
        return relativeLayout_navs[2];
    }

    public RelativeLayout getRelativeLayout_nav_chat() {
        return relativeLayout_navs[3];
    }


    public void setSelected(int selectedindex){
        for(int i=0;i<imageViews.length;i++) {
            if(i==selectedindex){
                imageViews[i].setSelected(true);
                textViews[i].setTextColor(getResources().getColor(R.color.moepink));
            }else {
                imageViews[i].setSelected(false);
                textViews[i].setTextColor(getResources().getColor(R.color.text_8b));
            }
        }
    }

}
