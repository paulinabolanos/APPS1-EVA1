package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnListener;
    Button btnClaseAnonima;
    Button btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnPorClase = findViewById(R.id.btnPorClase);
        //Se puede cambiar el nombre (No pasa nada)

        btnListener.setOnClickListener(this);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v ){
                Toast.makeText(getApplicationContext(), "evento por Clase Anonima", Toast.LENGTH_LONG).show();
            }
        });

        btnPorClase.setOnClickListener(new MiClickListener(getApplicationContext()));
    }

    public void miClick(View v) {
        Toast.makeText(this, "evento por XML", Toast.LENGTH_LONG).show();
        //Solo funciona para el click
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "evento por Listener", Toast.LENGTH_LONG).show();
    }
}
