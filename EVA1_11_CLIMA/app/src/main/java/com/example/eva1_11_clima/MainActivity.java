package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
     ListView lstVwClima;
     Weather[] cities = {
            new Weather ("Chihuahua", 20, "Nublado", R.drawable.light_rain),
            new Weather ("Delicias", -5, "Despejado", R.drawable.sunny),
            new Weather ("Ciudad Juárez", -3, "Nevadas intensas", R.drawable.snow),
            new Weather ("Jiménez", 23, "Lluvias intensas", R.drawable.atmospher),
            new Weather ("Camargo", 30, "Vientos intensos", R.drawable.cloudy),
            new Weather ("Parral", 8, "Lluvias fuertes", R.drawable.rainy),
            new Weather ("Aldama", -2, "Niebla", R.drawable.atmospher),
            new Weather ("Batopilas", 10, "Lluvia ligera", R.drawable.tornado),
            new Weather ("Creel", 11, "Despejado", R.drawable.light_rain),
            new Weather ("Casas Grandes", 23, "Lluvias intensas", R.drawable.light_rain)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this, R.layout.mi_layout, cities));
    }
}
