/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_marchand;

/**
 *
 * @author loicm
 */
public class Personne {
    
    String prenom;
    String nom;
    int nbVoitures;
    Voiture[] liste_voitures;

    // Constructeur
    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // Tableau avec une capacité de 3 voitures
    }

    // Méthode toString pour afficher une Personne
    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("La voiture appartient deja a " + voiture_a_ajouter.proprietaire.nom);
            return false; // Voiture déjà possédée
        }
        if (nbVoitures >= 3) {
            System.out.println("Le proprietaire " + nom + " possede deja 3 voitures.");
            return false; // Tableau plein
        }
        // Ajout possible
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        voiture_a_ajouter.proprietaire = this; // La voiture connaît son nouveau propriétaire
        nbVoitures++; // Incrémenter le nombre de voitures possédées
        return true;
    }
}
  

