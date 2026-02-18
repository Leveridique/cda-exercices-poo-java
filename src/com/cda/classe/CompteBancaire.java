package com.cda.classe;

public class CompteBancaire {

    private String nom;
    private double solde;

    public CompteBancaire(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public void ajouter(double montant) {
        solde += montant;
    }

    public void retirer(double montant) throws Exception {
        if (montant > solde || montant < 0) {
            throw new Exception("Solde insuffisant pour " + nom);
        }
        solde -= montant;
    }

    public void virement(CompteBancaire destinataire, double montant) throws Exception {
        if (montant > solde || montant < 0) {
            throw new Exception("Virement impossible : solde insuffisant pour " + nom);
        }
        this.solde -= montant;
        destinataire.solde += montant;
    }

    public void afficher() {
        System.out.println(nom + " possède : " + solde + " €");
    }
}
