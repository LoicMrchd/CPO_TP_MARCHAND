/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_marchand;

/**
 *
 * @author loicm
 */
public class BouteilleBiere {
    // Déclaration des attributs
    public String nom;
    public float degreAlcool;
    public String brasserie;
    public boolean ouverte;

    // Constructeur avec 3 paramètres (nom, degré d'alcool, brasserie)
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        this.nom = unNom;
        this.degreAlcool = unDegre;
        this.brasserie = uneBrasserie;
        this.ouverte = false;  // La bouteille est fermée par défaut
    }

    // Constructeur par défaut (sans paramètres)
    public BouteilleBiere() {
        this.nom = "Inconnu";
        this.degreAlcool = 0.0f;
        this.brasserie = "Inconnue";
        this.ouverte = false;
    }

    // Méthode pour afficher l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)");
        System.out.println("Brasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bouteille
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;  // On ouvre la bouteille
            System.out.println("La bouteille de " + nom + " est maintenant ouverte.");
            return true;
        } else {
            System.out.println("Erreur : Biere deja ouverte.");
            return false;
        }
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}

