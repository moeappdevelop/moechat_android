package xyz.moechat.android.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import xyz.moechat.android.R;

/**
 * Created by timeloveboy on 16/4/11.
 */
public class nav extends LinearLayout {
    public nav(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.linearlayout_main_nav, this);
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
    }
    ImageView[] imageViews=new ImageView[4];
    TextView[] textViews=new TextView[4];
    public void setSelected(int selectedindex){
        for(int i=0;i<imageViews.length;i++) {
            if(i==selectedindex){
                imageViews[i].setSelected(true);
                textViews[i].setTextColor(getResources().getColor(R.color.moepink));
            }else {
                imageViews[i].setSelected(false);
                textViews[i].setTextColor(getResources().getColor(R.color.text_98));
            }
        }
    }
}
