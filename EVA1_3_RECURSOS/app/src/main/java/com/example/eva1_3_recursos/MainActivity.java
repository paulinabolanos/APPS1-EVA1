package com.example.eva1_3_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgVw;
    TextView txtVwTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVw = findViewById(R.id.imgVw);
        imgVw.setImageResource(R.drawable.juizfora);
        txtVwTitle= findViewById(R.id.txtVwTitle);
        txtVwTitle.setText(""+1);
    }
}
