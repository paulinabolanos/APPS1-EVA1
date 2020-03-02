package com.example.eva1_5_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdGrpComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida = findViewById(R.id.rdGrpComida) ;
        rdGrpComida.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //checkedId -- es el id del radiobutton seleccionado
        //findViewById -- regresa el View usando el id
        RadioButton rdBtnSe1 = findViewById(checkedId);
        Toast.makeText(this, rdBtnSe1.getText(), Toast.LENGTH_SHORT).show();
    }


}
