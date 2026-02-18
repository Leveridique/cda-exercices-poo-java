package com.cda.classe;

public class Joueur {

    private String nom;
    private int valeurLance;
    private Des des;

    public Joueur(String nom) {
        this.nom = nom;
        this.des = new Des();
    }

    public void lancerDes() {
        valeurLance = des.lancer();
    }

    public int getValeurLance() {
        return valeurLance;
    }

    public String getNom() {
        return nom;
    }
}
