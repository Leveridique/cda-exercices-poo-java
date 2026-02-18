import com.cda.classe.*;

public class Main {
    public static void main(String[] args) {

        // Exercice 1 et 2
        Vehicule v1 = new Vehicule("Yamaha", 2, 120);
        Vehicule v2 = new Vehicule("Peugeot 208", 4, 90);
        Vehicule v3 = new Vehicule("Tracteur", 6, 40);

        System.out.println("Le véhicule " + v1.getNom() + " est une " + v1.detect());
        System.out.println("Le véhicule " + v2.getNom() + " est une " + v2.detect());
        System.out.println("Le véhicule " + v3.getNom() + " est une " + v3.detect());

        v1.boost();
        v2.boost();
        v3.boost();

        System.out.println("Le véhicule " + v1.getNom() + " possède une vitesse de : " + v1.getVitesse() + " km/h");
        System.out.println("Le véhicule " + v2.getNom() + " possède une vitesse de : " + v2.getVitesse() + " km/h");
        System.out.println("Le véhicule " + v3.getNom() + " possède une vitesse de : " + v3.getVitesse() + " km/h");

        System.out.println("Le véhicule le plus rapide est : " + v1.plusRapide(v2));

        // Exercice 3
        Joueur j1 = new Joueur("Joueur 1");
        Joueur j2 = new Joueur("Joueur 2");
        Partie partie = new Partie(j1, j2, 5);
        partie.lancerPartie();

        // Exercice 4
        CompteBancaire alex = new CompteBancaire("Alex", 1000);
        CompteBancaire clovis = new CompteBancaire("Clovis", 1000);
        CompteBancaire marco = new CompteBancaire("Marco", 1000);

        try {
            alex.retirer(100);
            marco.virement(clovis, 300);
            alex.retirer(1200);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        alex.afficher();
        clovis.afficher();
        marco.afficher();
    }
}
