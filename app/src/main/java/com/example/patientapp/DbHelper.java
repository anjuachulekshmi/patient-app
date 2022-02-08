package com.example.patientapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    static String Dbname="PatientApp.db";
    static String PatientTable="patient";
    static String col1="id";
    static String col2="pcode";
    static String col3="pname";
    static String col4="paddress";
    static String col5="pmob";
    static String col6="dname";


    public DbHelper(Context context) {
        super(context,Dbname,null,1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table "+PatientTable+"("+col1+" integer peimary key autoincrement,"
                +col2+" text,"+col3+" text," +col4+" text," +col5+" text," +col6+" text)";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query="drop table if exists"+PatientTable;
        db.execSQL(query);
        onCreate(db);

    }
    public boolean insertPatient(String pcode,String pname,String paddress,String pmob,String dname)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues content=new ContentValues();
        content.put(col2,pcode);
        content.put(col3,pname);
        content.put(col4,paddress);
        content.put(col5,pmob);
        content.put(col6,dname);
        long status=db.insert(PatientTable,null,content);
        if (status==-1){
            return  false;

        }
        else {
            return  true;
        }


    }
}
