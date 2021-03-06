package com.example.jammaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button jamButton;

    private Button infoGammeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        jamButton = (Button) findViewById(R.id.button_Jam);
        infoGammeButton = (Button) findViewById(R.id.button_info_Gamme);

        jamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJam = new Intent(MainActivity.this,Gamme_choisie.class);
                startActivity(intentJam);
            }
        });

        infoGammeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGamme = new Intent(MainActivity.this,InfoGamme.class);
                startActivity(intentGamme);
            }
        });
    }
}
