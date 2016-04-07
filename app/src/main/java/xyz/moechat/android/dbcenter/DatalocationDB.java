package xyz.moechat.android.dbcenter;

import android.net.Network;

import com.snappydb.DB;
import com.snappydb.DBFactory;
import com.snappydb.SnappydbException;

import org.json.JSONObject;

import xyz.moechat.android.application.moeapplication;

/**
 * Created by timeloveboy on 16/4/7.
 */
public class DatalocationDB {
    private static DB getIdDB(){
        try {
            DB snappydb = DBFactory.open(moeapplication.getContext(), "Id");

            return snappydb;
        }catch (SnappydbException e){
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject getDataLocation(String id){
        try {
            return getIdDB().getObject(id,JSONObject.class);
        }catch (SnappydbException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static int getDataCount(){
        try {
            return getIdDB().countKeys("<");
        }catch (SnappydbException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void SynchronizeDataFromNetwork(String id){

    }
    public static void Test_insertData(String id,JSONObject jsonObject){
        try {
            getIdDB().put(id,jsonObject);
        }catch (SnappydbException e) {
            e.printStackTrace();
        }
    }

}
