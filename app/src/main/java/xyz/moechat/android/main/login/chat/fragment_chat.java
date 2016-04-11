package xyz.moechat.android.main.login.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;

/**
 * Created by timeloveboy on 16/4/10.
 */
public class fragment_chat extends basefragment implements View.OnClickListener {
    public static fragment_chat fragment=new fragment_chat();
    public static fragment_chat newInstance(){
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        findViewById(saveView);
        setOnClickListener();
        Test();
        m_adapter_chat=new adapter_chat(fragment,list_string);
        listView_chat.setAdapter(m_adapter_chat);
        return saveView;
    }
    void findViewById(View view){
        listView_chat=(ListView)view.findViewById(R.id.listView_chat);
    }
    //内容
    private ListView listView_chat;
    private adapter_chat m_adapter_chat;
    List<String> list_string;
    void setOnClickListener(){

    }
    //Test
    private void Test(){
        list_string=new ArrayList<>();
        list_string.add("李鹏");
        list_string.add("test");
        list_string.add("nodata");
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_chat;
    }


    @Override
    public void onClick(View v) {

    }
}
