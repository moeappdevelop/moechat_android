package xyz.moechat.android.main.chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

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
    ListView msglistview;
    EditText inputtext;
    Button send;
    MsgAdapter adapter;
    List<Msg> msgList=new ArrayList<Msg>();
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_chat_chatting;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        findViewById(saveView);
        adapter=new MsgAdapter(getActivity(),msgList,R.layout.msg_item);


        msglistview.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputtext.getText().toString();
                if (content != "") {
                    Msg msg = new Msg(content, false);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();//当有新数据时，刷新ListView
                    msglistview.setSelection(msgList.size());//定位到最后一条
                    inputtext.setText("");
                }

            }
        });
        return saveView;
    }
    void findViewById(View view){
        inputtext=(EditText)view.findViewById(R.id.input);
        send=(Button)view.findViewById(R.id.send);
        msglistview=(ListView)saveView.findViewById(R.id.listView_实时对话);
    }
}