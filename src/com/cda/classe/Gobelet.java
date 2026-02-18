package com.cda.classe;

public class Gobelet {

    private Des d1 = new Des();
    private Des d2 = new Des();
    private Des d3 = new Des();

    public int lancerGobelet() {
        return d1.lancer() + d2.lancer() + d3.lancer();
    }
}
