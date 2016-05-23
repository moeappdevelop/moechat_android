package xyz.moechat.android.main.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import xyz.moechat.android.R;
import xyz.moechat.android.activity.Activity_main;
import xyz.moechat.android.activity.Activity_next;
import xyz.moechat.android.base.basefragment;

/**
 * Created by timeloveboy on 16/4/10.
 */
public class fragment_chat extends basefragment implements View.OnClickListener {
    public static fragment_chat fragment=new fragment_chat();
    public static fragment_chat newInstance(){
        return fragment;
    }
    @Override
    public String fragment_name(){
        return "fragment_chat";
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        findViewById(saveView);
        setOnClickListener();

        //region chatlist
        Test();
        m_adapter_chat=new adapter_chat(fragment,list);
        listView_chat.setAdapter(m_adapter_chat);
        listView_chat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                gotoActivity_next_fragment();
            }
        });
        listView_chat.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                return false;
            }
        });
        //endregion
        return saveView;
    }
    public void gotoActivity_next_fragment(){
        Intent intent=new Intent();
        intent.setClass(getActivity(), Activity_next.class);
        startActivity(intent);
    }
    void findViewById(View view){
        listView_chat=(ListView)view.findViewById(R.id.listView_chat);
    }
    //内容
    private ListView listView_chat;
    private adapter_chat m_adapter_chat;
    List<Mson_chatlistitem> list;
    void setOnClickListener(){

    }
    //Test
    private void Test(){
        list=new ArrayList<>();
        for(int i=0;i<100;i++) {
            Mson_chatlistitem mson_chatlistitem=new Mson_chatlistitem();

            mson_chatlistitem.mson_receivemessages=new ArrayList<>();
            Mson_receivemessage mson_receivemessage=new Mson_receivemessage();
            mson_receivemessage.fromid="12f"+i;
            mson_receivemessage.toid="<2"+i+"3>sdf";
            mson_receivemessage.readornot=false;
            mson_receivemessage.content="你好,我说李鹏";
            mson_receivemessage.reveivetime="2016/2/3 12+9:23:32";
            mson_chatlistitem.mson_receivemessages.add(mson_receivemessage);

            list.add(mson_chatlistitem);
        }
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_chat;
    }


    @Override
    public void onClick(View v) {

    }
}
