/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_marchand;

/**
 *
 * @author loicm
 */
public class Voiture {
    
    String modele;
    String marque;
    int portes;
    Personne proprietaire; // référence vers l'objet Personne

    // Constructeur
    public Voiture(String modele, String marque, int portes) {
        this.modele = modele;
        this.marque = marque;
        this.portes = portes;
        this.proprietaire = null; // Le propriétaire est null par défaut
    }

    // Méthode toString pour afficher une Voiture
    @Override
    public String toString() {
        return "Voiture [modele=" + modele + ", marque=" + marque + ", portes=" + portes + 
               (proprietaire != null ? ", proprietaire=" + proprietaire.nom : "") + "]";
    }
}
    

