package com.example.android.satriohandityo_1202150096_modul5;

import android.database.Cursor;

/**
 * Created by tyo on 25/03/18.
 */

public class ListModel {
    //    public DbHelper dbHelper;
    private int ID;
    private String name;
    private String desc;
    private int priority;

//    Cursor c = dbHelper.getAllData();

    public ListModel(int ID, String name, String desc, int priority) {

        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.priority = priority;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


}
