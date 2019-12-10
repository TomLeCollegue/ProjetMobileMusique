package com.example.jammaster;

import java.util.Random;

public class Gamme_fonctions {
    Random r = new Random();
    String tabNotes[] = new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#"};
    int tabDegresNotes[] = new int[]{0, 0, 0, 0, 0, 0, 0};
    int tabDegresHarmo[] = new int[]{0, 0, 0, 0, 0, 0, 0};


    int ChoisirNote() {

        int i = r.nextInt(12);
        return i;
    }

    int ChoisirMode() {
        int i = r.nextInt(2);
        return i;
    }

    String ChoisirModeString(int randNumMode) {
        String mode;
        if (randNumMode == 0) {
            mode = "Majeur";
        } else if (randNumMode == 1) {
            mode = "Mineur";
        } else {
            mode = "error";
        }
        return mode;
    }

    String ChoisirModeStringPourTableau(int numDegres) {
        String mode;
        if (numDegres == 0) {
            mode = "";
        }
        else if (numDegres == 1) {
            mode = "m";
        }
        else if (numDegres == 2) {
            mode = "dim°";
        }
        else {
            mode = "error";
        }
        return mode;
    }

    String ChoisirNoteTab(int randNumNote) {
        String s = tabNotes[randNumNote];
        return s;
    }

    String GammeChoisie(int numNote, int numMode) {
        String s = "";
        if (numMode == 0) {
            s = ChoisirNoteTab(numNote) + " " + ChoisirNoteTab(numNote + 2) + "m " + ChoisirNoteTab(numNote + 4) + "m " +
                    ChoisirNoteTab(numNote + 5) + " " + ChoisirNoteTab(numNote + 7) + " " +
                    ChoisirNoteTab(numNote + 9) + "m " + ChoisirNoteTab(numNote + 11) + "dim";
        } else if (numMode == 1) {
            s = ChoisirNoteTab(numNote) + "m " + ChoisirNoteTab(numNote + 2) + "dim " + ChoisirNoteTab(numNote + 3) + " " +
                    ChoisirNoteTab(numNote + 5) + "m " + ChoisirNoteTab(numNote + 7) + "m " +
                    ChoisirNoteTab(numNote + 8) + " " + ChoisirNoteTab(numNote + 10) + "";
        } else {
            s = "error";
        }
        return s;
    }

    void RemplirTableauGamme(int numNote, int numMode) {
        if (numMode == 0) {
            tabDegresNotes[0] = numNote;
            tabDegresHarmo[0] = 0;
            tabDegresNotes[1] = numNote + 2;
            tabDegresHarmo[1] = 1;
            tabDegresNotes[2] = numNote + 4;
            tabDegresHarmo[2] = 1;
            tabDegresNotes[3] = numNote + 5;
            tabDegresHarmo[3] = 0;
            tabDegresNotes[4] = numNote + 7;
            tabDegresHarmo[4] = 0;
            tabDegresNotes[5] = numNote + 9;
            tabDegresHarmo[5] = 1;
            tabDegresNotes[6] = numNote + 11;
            tabDegresHarmo[6] = 2;
        }
        else if (numMode == 1) {
            tabDegresNotes[0] = numNote;
            tabDegresHarmo[0] = 1;
            tabDegresNotes[1] = numNote + 2;
            tabDegresHarmo[1] = 2;
            tabDegresNotes[2] = numNote + 3;
            tabDegresHarmo[2] = 0;
            tabDegresNotes[3] = numNote + 5;
            tabDegresHarmo[3] = 1;
            tabDegresNotes[4] = numNote + 7;
            tabDegresHarmo[4] = 1;
            tabDegresNotes[5] = numNote + 8;
            tabDegresHarmo[5] = 0;
            tabDegresNotes[6] = numNote + 10;
            tabDegresHarmo[6] = 0;
        }
    }

    String RemplirCase (int numDegres){
        String s;
        s = ChoisirNoteTab(tabDegresNotes[numDegres]) + ChoisirModeStringPourTableau(tabDegresHarmo[numDegres]);
        return s;
    }
}

