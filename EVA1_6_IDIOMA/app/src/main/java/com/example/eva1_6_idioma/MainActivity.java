package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    TextView txtVwIdioma, txtVwNom, txtVwApe, txtVwEdad;
    EditText edtTxtNom, edTxtApe, edTxtNum;
    RadioGroup rdGIdiomas;
    RadioButton rdbtnesp, rdbtneng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVwIdioma = findViewById(R.id.txtVwIdioma);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwApe = findViewById(R.id.txtVwApe);
        txtVwEdad = findViewById(R.id.txtVwEdad);
        edtTxtNom = findViewById(R.id.edTxtNom );
        edTxtApe = findViewById(R.id.edTxtApe);
        edTxtNum = findViewById(R.id.edTxtNum);
        rdGIdiomas = findViewById(R.id.rdGIdiomas);
        rdbtneng = findViewById(R.id.rdbtneng);
        rdbtnesp = findViewById(R.id.rdbtnesp);

        rdGIdiomas.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (R.id.rdbtnesp == checkedId){
            txtVwIdioma.setText(R.string.ingles_es);
            rdbtnesp.setText(R.string.espanol_es);
            rdbtneng.setText(R.string.ingles_es);
        }else{
            txtVwIdioma.setText(R.string.espanol_en);
            rdbtnesp.setText(R.string.espanol_en);
            rdbtneng.setText(R.string.ingles_en);
        }
    }
}

