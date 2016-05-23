package xyz.moechat.android.main.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.moechat.android.R;
import xyz.moechat.android.base.Basefragment;

/**
 * Created by timeloveboy on 16/4/29.
 */
public class fragment_chat_chatting extends Basefragment {
    public static fragment_chat_chatting fragment=new fragment_chat_chatting();
    public static fragment_chat_chatting newInstance(){
        return fragment;
    }
    @Override
    public String fragment_name(){
        return "fragment_chat_chatting";
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_chat_chatting;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        findViewById(saveView);
        return saveView;
    }
    void findViewById(View view){
        more = view.findViewById(R.id.more);
    }
    /**
     * 显示或隐藏图标按钮页
     *
     * @param view
     */
    private View more;
    public void more(View view) {
        if (more.getVisibility() == View.GONE) {
            System.out.println("more gone");

            more.setVisibility(View.VISIBLE);
//            btnContainer.setVisibility(View.VISIBLE);
//            emojiIconContainer.setVisibility(View.GONE);
        } else {
//            if (emojiIconContainer.getVisibility() == View.VISIBLE) {
//                emojiIconContainer.setVisibility(View.GONE);
//                btnContainer.setVisibility(View.VISIBLE);
//                iv_emoticons_normal.setVisibility(View.VISIBLE);
//                iv_emoticons_checked.setVisibility(View.INVISIBLE);
//            } else {
//                more.setVisibility(View.GONE);
//            }

        }

    }
}