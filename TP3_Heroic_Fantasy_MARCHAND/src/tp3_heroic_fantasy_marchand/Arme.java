/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marchand;

/**
 *
 * @author loicm
 */
public class Arme {
    // Attributs
    private String nom;
    private int niveauAttaque;

    // Constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        // Le niveau d'attaque doit être <= 100
        if (niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            this.niveauAttaque = 100; // Assigne la valeur maximale si l'entrée dépasse 100
        }
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinir la méthode toString pour visualiser les informations de l'arme
    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}
    

