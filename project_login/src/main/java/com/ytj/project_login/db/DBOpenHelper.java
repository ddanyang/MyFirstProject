package com.ytj.project_login.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/9/22.
 */
public class DBOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "maplocal.db";
    private static final int VERSION = 1;

    public DBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //建表
        db.execSQL("create table users (id Integer primary key,username String not null,alias String not null,tel String not null,path String)");
        db.execSQL("create table cases (id Integer primary key,name String not null,intime String not null,userid Integer,remark String,linktel String,linkman String,casenum String not null,casekind String,handover String not null,handdate String)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
