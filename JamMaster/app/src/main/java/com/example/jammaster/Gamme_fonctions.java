package com.example.jammaster;

import java.util.Random;

public class Gamme_fonctions {
    Random r = new Random();
    String tabNotes[] = new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#"};

    int ChoisirNote() {

        int i = r.nextInt(12);
        return i;
    }

    int ChoisirMode() {
        int i = r.nextInt(2);
        return i;
    }

    String ChoisirModeString(int randNumMode){
        String mode;
        if (randNumMode == 0){
            mode = "Majeur";
        }
        else if (randNumMode == 1) {
            mode = "Mineur";
        }
        else {
            mode = "error";
        }
        return mode;
    }

    String ChoisirNoteTab(int randNumNote){
        String s = tabNotes[randNumNote];
        return s;
    }


    String GammeChoisie(int numNote, int numMode){
        String s = "";
        if (numMode == 0){
            s = ChoisirNoteTab(numNote) + " " + ChoisirNoteTab(numNote+2) + "m " + ChoisirNoteTab(numNote+4) + "m " +
                    ChoisirNoteTab(numNote+5) + " " + ChoisirNoteTab(numNote+7) + " " +
                    ChoisirNoteTab(numNote+9) + "m " + ChoisirNoteTab(numNote+11) + "dim";
        }
         else if (numMode == 1){
            s = ChoisirNoteTab(numNote) + "m " + ChoisirNoteTab(numNote+2) + "dim " + ChoisirNoteTab(numNote+3) + " " +
                    ChoisirNoteTab(numNote+5) + "m " + ChoisirNoteTab(numNote+7) + "m " +
                    ChoisirNoteTab(numNote+8) + " " + ChoisirNoteTab(numNote+10) + "";
        }
         else{
             s = "error";
        }
         return s;
    }
}
