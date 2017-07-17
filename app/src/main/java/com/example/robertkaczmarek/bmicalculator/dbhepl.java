package com.example.robertkaczmarek.bmicalculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by robertkaczmarek on 05.05.2017.
 */

public class dbhepl extends SQLiteOpenHelper implements BaseColumns {

    public static final String BAZA_NAME = "historyResult";
    public static final String TABLE_NAME = "historyTable";
    public static final String WEIGHT = "weight";
    public static final String BMI = "bmi";
    public static final String DATA_TIME = "data";
    public static final int VERSION = 1;



    public dbhepl(Context context) {
        super(context, BAZA_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String CREATE_TABLE = " CREATE TABLE " + TABLE_NAME + " (  " + _ID + " INTEGER, "
                + WEIGHT + " TEXT, " + BMI + " TEXT," + DATA_TIME + " TEXT)";
                db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);

    }

    public boolean insertDate ( String weight1, String bmi1, String data1){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues val = new ContentValues();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        String strDate = sdf.format(c.getTime());
        val.put("Weight", weight1);
        val.put("BMI", bmi1);
        val.put("Data", strDate);

        if (db.insert(TABLE_NAME,null,val)==-1 ){
            return false;
        }else {
            return true;
        }


    }

    public Cursor show (){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cu = db.query(TABLE_NAME,new String[]{DATA_TIME,WEIGHT,BMI},null,null,null,null,null);
        return cu;

    }
}
