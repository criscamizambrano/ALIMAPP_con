package com.example.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.interfaz1.R;

public class SeleccionDeComidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_de_comidas);
    }

    public void irDesayuno(View view){
        Intent i = new Intent(SeleccionDeComidas.this,Desayuno.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void irAlmuerzo(View view){
        Intent i = new Intent(SeleccionDeComidas.this,Almuerzo.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void irCena(View view){
        Intent i = new Intent(SeleccionDeComidas.this,Cena.class);
        startActivity(i);
        /* startActivity(i); */
    }
}
