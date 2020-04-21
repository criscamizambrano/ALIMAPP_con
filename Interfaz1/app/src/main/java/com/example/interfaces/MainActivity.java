package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import com.example.interfaz1.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }


    public void iniciarSesion(View view){
        Intent i = new Intent(MainActivity.this,IniciarSesion.class);
        startActivity(i);
        /* startActivity(i); */
    }
    public void Registrarse(View view){
        Intent i = new Intent(MainActivity.this,Registro.class);
        startActivity(i);
        /* startActivity(i); */
    }
}
