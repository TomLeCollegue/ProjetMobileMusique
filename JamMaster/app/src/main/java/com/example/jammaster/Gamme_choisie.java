package com.example.jammaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

public class Gamme_choisie extends AppCompatActivity {

    private TextView noteTextView;




    private int noteChoisie;
    private int modeChoisi;

    private String noteChoisieString;
    private String modeChoisiString;


    private TextView textViewDegres1;
    private TextView textViewDegres2;
    private TextView textViewDegres3;
    private TextView textViewDegres4;
    private TextView textViewDegres5;
    private TextView textViewDegres6;
    private TextView textViewDegres7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamme_choisie);

        Gamme_fonctions G = new Gamme_fonctions();

        noteTextView = (TextView) findViewById(R.id.text_view_note);




        textViewDegres1 = (TextView) findViewById(R.id.degres1);
        textViewDegres2 = (TextView) findViewById(R.id.degres2);
        textViewDegres3 = (TextView) findViewById(R.id.degres3);
        textViewDegres4 = (TextView) findViewById(R.id.degres4);
        textViewDegres5 = (TextView) findViewById(R.id.degres5);
        textViewDegres6 = (TextView) findViewById(R.id.degres6);
        textViewDegres7 = (TextView) findViewById(R.id.degres7);


        noteChoisie = G.ChoisirNote();
        modeChoisi = G.ChoisirMode();

        G.RemplirTableauGamme(noteChoisie, modeChoisi);

        noteChoisieString = G.ChoisirNoteTab(noteChoisie);
        modeChoisiString = G.ChoisirModeString(modeChoisi);


        noteTextView.setText(noteChoisieString + " " + modeChoisiString) ;




        textViewDegres1.setText(G.RemplirCase(0));
        textViewDegres2.setText(G.RemplirCase(1));
        textViewDegres3.setText(G.RemplirCase(2));
        textViewDegres4.setText(G.RemplirCase(3));
        textViewDegres5.setText(G.RemplirCase(4));
        textViewDegres6.setText(G.RemplirCase(5));
        textViewDegres7.setText(G.RemplirCase(6));



    }
}
