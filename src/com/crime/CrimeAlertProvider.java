package com.crime;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.net.Uri;

public class CrimeAlertProvider extends ContentProvider {
    public static final String TAG = "CrimeAlertProvider";

    private static final String DATABASE_NAME = "crime.db";
    private static final String DATABASE_VERSION = "1";

    private static final String AUTHORITY = "com.crime";

    //TABLES

	private static final String TABLE_CRIMES = "crimes";

    //QUERIES

        private static final String QUERY_CRIMES = //sql stuff..

    //URIS


    //MAPS
    
    private static class DatabaseHelper extends SQLiteOpenHelper {

        public DatabaseHelper(Context aContext, String aName, CursorFactory aFactory, int aVersion) {
            super(aContext, aName, aFactory, aVersion);
        }

        @Override
        public void onCreate(SQLiteDatabase aDb) {
            
        }

        @Override
        public void onUpgrade(SQLiteDatabase aDb, int aOldVersion, int aNewVersion) {
            
        }

    }

    @Override
    public int delete(Uri aUri, String aSelection, String[] aSelectionArgs) {
        return 0;
    }

    @Override
    public String getType(Uri aUri) {
        return null;
    }

    @Override
    public Uri insert(Uri aUri, ContentValues aValues) {
        return null;
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri aUri, String[] aProjection, String aSelection, String[] aSelectionArgs, String aSortOrder) {
        return null;
    }

    @Override
    public int update(Uri aUri, ContentValues aValues, String Selection, String[] aSelectionArgs) {
        return 0;
    }

}
