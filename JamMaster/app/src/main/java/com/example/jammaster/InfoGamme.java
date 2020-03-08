package com.example.jammaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class InfoGamme extends AppCompatActivity {

    private Spinner spinnerNote;
    private Spinner spinnerMode;

    private TextView textViewDegres1;
    private TextView textViewDegres2;
    private TextView textViewDegres3;
    private TextView textViewDegres4;
    private TextView textViewDegres5;
    private TextView textViewDegres6;
    private TextView textViewDegres7;

    public Gamme_fonctions G = new Gamme_fonctions();

    public int noteChoisie;
    public int modechoisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_gamme);



        spinnerMode = (Spinner) findViewById(R.id.spinnerMode);
        spinnerNote = (Spinner) findViewById(R.id.spinnerNote);

        textViewDegres1 = (TextView) findViewById(R.id.degres1);
        textViewDegres2 = (TextView) findViewById(R.id.degres2);
        textViewDegres3 = (TextView) findViewById(R.id.degres3);
        textViewDegres4 = (TextView) findViewById(R.id.degres4);
        textViewDegres5 = (TextView) findViewById(R.id.degres5);
        textViewDegres6 = (TextView) findViewById(R.id.degres6);
        textViewDegres7 = (TextView) findViewById(R.id.degres7);

        noteChoisie = 0;
        modechoisi = 0;


        ArrayAdapter<String> adapterNotes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, G.tabNotesPourSelecteur);
        adapterNotes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNote.setAdapter(adapterNotes);

        ArrayAdapter<String> adapterModes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, G.tabMode);
        adapterModes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMode.setAdapter(adapterModes);

        spinnerNote.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                noteChoisie = position;
                G.RemplirTableauGamme(noteChoisie, modechoisi);
                textViewDegres1.setText(G.RemplirCase(0));
                textViewDegres2.setText(G.RemplirCase(1));
                textViewDegres3.setText(G.RemplirCase(2));
                textViewDegres4.setText(G.RemplirCase(3));
                textViewDegres5.setText(G.RemplirCase(4));
                textViewDegres6.setText(G.RemplirCase(5));
                textViewDegres7.setText(G.RemplirCase(6));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerMode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                modechoisi = position;
                G.RemplirTableauGamme(noteChoisie, modechoisi);
                textViewDegres1.setText(G.RemplirCase(0));
                textViewDegres2.setText(G.RemplirCase(1));
                textViewDegres3.setText(G.RemplirCase(2));
                textViewDegres4.setText(G.RemplirCase(3));
                textViewDegres5.setText(G.RemplirCase(4));
                textViewDegres6.setText(G.RemplirCase(5));
                textViewDegres7.setText(G.RemplirCase(6));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });








    }

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
