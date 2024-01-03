package mew.id.vn.mewdroidkit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
    private String[] sqlRunOnCreate;
    public DatabaseHelper(Context context, String dbName, String[] sqlRunOnCreate) {
        super(context, dbName, null, 1);
        this.sqlRunOnCreate = sqlRunOnCreate;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        for (String sql: this.sqlRunOnCreate) {
            db.execSQL(sql);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
