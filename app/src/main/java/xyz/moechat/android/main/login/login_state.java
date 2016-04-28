package xyz.moechat.android.main.login;

import org.json.JSONException;
import org.json.JSONObject;

import xyz.moechat.android.dbcenter.DatalocationDB;
import xyz.moechat.android.utils.MLog;

/**
 * Created by timeloveboy on 16/4/28.
 */
public class login_state {
    public login_state() {

    }

    public boolean islogin(){
        if(getLogin()==null||getLogin()!=1){
            return false;
        }else
            return true;
    }

    public void LoginIn(){
        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("1", 1);
        }catch (JSONException e){
            e.printStackTrace();
        }
        DatalocationDB.Test_insertData("<1983&3&1⊙30.100°,109.125°>", jsonObject);
    }

    Integer getLogin(){
        JSONObject jsonObject=DatalocationDB.getDataLocation("<1983&3&1⊙30.100°,109.125°>");
        jsonObject.toString();
        try {
            return jsonObject.getInt("1");

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
