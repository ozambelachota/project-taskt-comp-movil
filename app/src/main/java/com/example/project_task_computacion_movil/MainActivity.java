package com.example.project_task_computacion_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import database.DBTask;

public class MainActivity extends AppCompatActivity {

    private DBTask dbTaskHelper;
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbTaskHelper = new DBTask(this);
        database = dbTaskHelper.getWritableDatabase();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        database.close();
    }
}