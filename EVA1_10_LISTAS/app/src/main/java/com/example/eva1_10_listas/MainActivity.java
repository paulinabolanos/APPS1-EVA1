package com.example.eva1_10_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwMostrar;
    String [] aDatos = {
            "Tacos",
            "Tamales",
            "Tortas",
            "Pizza",
            "Atún",
            "Burritos",
            "Caguamon",
            "Montados",
            "Boneless",
            "Chamorros",
            "Costillas",
            "Costillas",
            "Atún",
            "Burritos",
            "Caguamon",
            "Montados",
            "Boneless",
            "Chamorros",
            "Costillas",
            "Costillas",
            "Atún",
            "Burritos",
            "Caguamon",
            "Montados",
            "Boneless",
            "Chamorros",
            "Costillas",
            "Costillas",
            "Burritos",
            "Caguamon",
            "Montados",
            "Boneless",
            "Chamorros",
            "Costillas",
            "Costillas",
            "Burritos",
            "Caguamon",
            "Montados",
            "Boneless",
            "Chamorros",
            "Costillas",
            "Costillas",
            "Burritos",
            "Caguamon",
            "Montados",
            "Boneless",
            "Chamorros",
            "Costillas",
            "Costillas",
            "Ensalada"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwMostrar = findViewById(R.id.lstVwMostrar);
        lstVwMostrar.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                aDatos
                )
        );
        lstVwMostrar.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,aDatos[position],Toast.LENGTH_LONG).show();
    }
}
