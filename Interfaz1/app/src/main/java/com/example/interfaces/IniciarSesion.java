package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import com.example.interfaz1.R;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void cambiarMenuPrincipal(View view){
        Intent i = new Intent(IniciarSesion.this,MenuPrincipal.class);
        startActivity(i);
        /* startActivity(i); */
    }

}
