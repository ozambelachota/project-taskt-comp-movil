package com.example.project_task_computacion_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listaTarea(View view) {
        Intent intent = new Intent(this, ListaTareas.class);
        startActivity(intent);
    }



    //agregar  de  bebida
}

