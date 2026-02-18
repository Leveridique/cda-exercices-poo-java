package com.cda.classe;

public class Vehicule {

    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule() {}

    public Vehicule(String nom, int nbrRoue, int vitesse) {
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void boost() {
        this.vitesse += 50;
    }

    public String detect() {
        if (nbrRoue == 4) return "voiture";
        if (nbrRoue == 2) return "moto";
        return "autre";
    }

    public String plusRapide(Vehicule autre) {
        if (this.vitesse > autre.vitesse) {
            return this.nom;
        } else if (autre.vitesse > this.vitesse) {
            return autre.nom;
        } else {
            return "Les deux véhicules ont la même vitesse";
        }
    }
}
