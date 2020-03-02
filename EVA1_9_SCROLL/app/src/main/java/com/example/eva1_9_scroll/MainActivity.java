package com.example.eva1_9_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String smostrar = "El bosquejo del método de investigación es la forma en la que se proponen los objetivos de una investigación. La escritura de las ideas permite elaborar un borrador de trabajo; lo ideal es que el bosquejo del investigador sea lo más completo posible, para que sea más fácil desarrollar el proceso investigativo.\n" +
            "El investigador suele partir de una idea general al analizar una temática de interés, pero sin tener bien claros los puntos claves a investigar. En esta etapa es muy importante que el investigador escriba sus reflexiones, que registre los avances que vayan surgiendo en torno al tema, para lograr concretar un bosquejo.\n" +
            "La elaboración de un proyecto recorre varias etapas. La investigación no se redacta en un momento único, sino que requiere de varias aproximaciones y revisiones en las que el investigador completa y perfecciona la información obtenida. Sin embargo, al momento de redactar el proyecto se requiere que las ideas estén organizadas.\n" +
            "Para este paso es necesaria la lectura, así como llevar a cabo observaciones informales y diálogos con especialistas en el área que se ha de investigar. El bosquejo de las ideas permite registrar, organizar, relacionar y esquematizar la investigación.\n";
    TextView txtVwMwnsaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMwnsaje = findViewById(R.id.txtVwMwnsaje);
        txtVwMwnsaje.setText(smostrar);
    }
}
