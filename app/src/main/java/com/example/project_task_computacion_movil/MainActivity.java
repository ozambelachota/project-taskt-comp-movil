package com.example.project_task_computacion_movil;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.database.sqlite.SQLiteDatabase;
=======
import android.content.Intent;
>>>>>>> Anaya
import android.os.Bundle;
import android.view.View;

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

    public void listaTarea(View view) {
        Intent intent = new Intent(this, ListaTareas.class);
        startActivity(intent);
    }



    //agregar  de  bebida
}

