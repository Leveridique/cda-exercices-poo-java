package com.cda.classe;

public class Partie {

    private Joueur joueur1;
    private Joueur joueur2;
    private int nbrTour;
    private int scoreJ1;
    private int scoreJ2;

    public Partie(Joueur j1, Joueur j2, int nbrTour) {
        this.joueur1 = j1;
        this.joueur2 = j2;
        this.nbrTour = nbrTour;
    }

    public void lancerPartie() {

        for (int i = 1; i <= nbrTour; i++) {
            joueur1.lancerDes();
            joueur2.lancerDes();

            int j1 = joueur1.getValeurLance();
            int j2 = joueur2.getValeurLance();

            if (j1 > j2) {
                scoreJ1 += 2;
            } else if (j2 > j1) {
                scoreJ2 += 2;
            } else {
                scoreJ1++;
                scoreJ2++;
            }
        }

        if (scoreJ1 > scoreJ2) {
            System.out.println("Le gagnant est : " + joueur1.getNom() + " avec " + scoreJ1 + " points.");
        } else if (scoreJ2 > scoreJ1) {
            System.out.println("Le gagnant est : " + joueur2.getNom() + " avec " + scoreJ2 + " points.");
        } else {
            System.out.println("Égalité parfaite !");
        }
    }
}
