package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linLayNom, linLayApe, linLayEd;
    EditText edTxtNom, edTxtApe, edTxtEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxtNom = findViewById(R.id.edTxtNom);
        edTxtApe = findViewById(R.id.edTxtApe);
        edTxtEdad = findViewById(R.id.edTxtEdad);

    }
}
