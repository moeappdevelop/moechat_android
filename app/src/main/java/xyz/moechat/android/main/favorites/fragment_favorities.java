package xyz.moechat.android.main.favorites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import xyz.moechat.android.R;
import xyz.moechat.android.base.basefragment;
import xyz.moechat.android.main.chat.Mson_chatlistitem;
import xyz.moechat.android.main.chat.Mson_receivemessage;
import xyz.moechat.android.main.chat.adapter_chat;
import xyz.moechat.android.view.MoeGridView;

/**
 * Created by timeloveboy on 16/4/10.
 */
public class fragment_favorities extends basefragment implements View.OnClickListener {
    public static fragment_favorities fragment=new fragment_favorities();
    public static fragment_favorities newInstance(){
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        findViewById(saveView);
        setOnClickListener();
        Test();
        m_adapter_chat=new adapter_chat(fragment,list);
        listView_favorities.setAdapter(m_adapter_chat);
        return saveView;
    }
    void findViewById(View view){
        listView_favorities=(ListView)view.findViewById(R.id.listView_favorities);
    }
    //region 内容
    private MoeGridView gridView_favorities_type;
    private ListView listView_favorities;
    private adapter_chat m_adapter_chat;
    List<Mson_chatlistitem> list;
    void setOnClickListener(){

    }
    //Test
    private void Test(){



        list=new ArrayList<>();
        for(int i=0;i<5;i++) {
            Mson_chatlistitem mson_chatlistitem=new Mson_chatlistitem();

            mson_chatlistitem.mson_receivemessages=new ArrayList<>();
            Mson_receivemessage mson_receivemessage=new Mson_receivemessage();
            mson_receivemessage.fromid="12f"+i;
            mson_receivemessage.toid="<2"+i+"3>sdf";
            mson_receivemessage.readornot=false;
            mson_receivemessage.content="你好,我说";
            mson_receivemessage.reveivetime="2016/2/3 12+9:23:32";
            mson_chatlistitem.mson_receivemessages.add(mson_receivemessage);

            list.add(mson_chatlistitem);
        }
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_favorities;
    }


    @Override
    public void onClick(View v) {

    }
}
