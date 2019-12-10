package com.example.jammaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

public class Gamme_choisie extends AppCompatActivity {

    private TextView noteTextView;
    private TextView modeTextView;
    private TextView gammeTextView;

    private int noteChoisie;
    private int modeChoisi;

    private String noteChoisieString;
    private String modeChoisiString;
    private String gammeChoisieString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamme_choisie);

        Gamme_fonctions G = new Gamme_fonctions();

        noteTextView = (TextView) findViewById(R.id.text_view_note);
        modeTextView = (TextView) findViewById(R.id.text_view_mode);
        gammeTextView = (TextView) findViewById(R.id.text_view_gamme);

        noteChoisie = G.ChoisirNote();
        modeChoisi = G.ChoisirMode();

        noteChoisieString = G.ChoisirNoteTab(noteChoisie);
        modeChoisiString = G.ChoisirModeString(modeChoisi);
        gammeChoisieString = G.GammeChoisie(noteChoisie, modeChoisi);

        noteTextView.setText(noteChoisieString);
        modeTextView.setText(modeChoisiString);
        gammeTextView.setText(gammeChoisieString);


    }
}
