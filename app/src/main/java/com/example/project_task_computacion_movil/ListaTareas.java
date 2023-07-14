package com.example.project_task_computacion_movil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ListaTareas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_tarea_portada);
    }


    public void regresar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void agregar(View view) {
        Intent intent = new Intent(this, Agregar_lista.class);
        startActivity(intent);
    }





}
