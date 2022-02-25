package com.example.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dB extends SQLiteOpenHelper {

    public static final String CUSTOMER = "customer";
    public static final String ID = "id";
    public static final String AGE = "age";
    public static final String NAME = "name";
    public static final String ACTIVE = "active";

    public dB(@Nullable Context context) {
        super(context, CUSTOMER + ".DB",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String q= "create table " + CUSTOMER + "(" + ID + " Integer PRIMARY KEY AUTOINCREMENT," + AGE + " Integer ," + NAME + " Text," + ACTIVE + " BOOL)";
        sqLiteDatabase.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public  boolean insert(customer db){
       SQLiteDatabase SD =this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(AGE,db.getAge());
        cv.put(NAME,db.getName());
        cv.put(ACTIVE,db.getActive());
        Long insert=SD.insert(CUSTOMER,null,cv);
        if(insert==-1){
            return  false;
        }
        else {
            return true;
        }
    }
}
