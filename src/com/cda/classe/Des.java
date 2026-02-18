package com.cda.classe;

import java.util.Random;

public class Des {

    private int nbrFace = 6;
    private int score;

    public int lancer() {
        Random r = new Random();
        score = r.nextInt(nbrFace) + 1;
        return score;
    }

    public int getScore() {
        return score;
    }
}
