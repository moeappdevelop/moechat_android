package xyz.moechat.android.main.chat;


import java.util.List;

/**
 * Created by timeloveboy on 16/4/12.
 */
public class Mson_chatlistitem {
    public List<Mson_receivemessage> mson_receivemessages;
    public int unreadmessagecount(){
        int result=10;
        for(int i=0;i<mson_receivemessages.size();i++){
            if(!mson_receivemessages.get(i).readornot)
                result++;
        }
        return result;
    }
    public String lastunreadmessagetime(){
        return mson_receivemessages.get(mson_receivemessages.size()-1).reveivetime;
    }
    public String lastunreadmessagecontent(){
        return mson_receivemessages.get(mson_receivemessages.size()-1).content;
    }
    public String fromid(){
        return mson_receivemessages.get(0).fromid;
    }
}
