/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author loicm
 */
public class Guerrier extends Personnage{
    
    private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
         super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++;  // Incrémente le compteur de guerriers chaque fois qu'un guerrier est créé
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            // Si nécessaire, ajoutez des logiques spécifiques de destruction ici
        } finally {
            super.finalize();  // Appel au finalizer de la classe parente
        }
    }

    // Setter pour aCheval
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + ", Guerrier à cheval : " + (aCheval ? "Oui" : "Non");
    }

    // [Challenge] Compte les épées dans l'inventaire
    @Override
    public int compterArmesPredilection() {
        int count = 0;
        for (Arme arme : super.inventaire) {
            if (arme instanceof Epee) {
                count++;
            }
        }
        return count;
    }

    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNiveauVie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void attaquer(Personnage cible) {
    int degats = 30;

    if (this.armeEnMain instanceof Epee) {
        Epee epee = (Epee) this.armeEnMain;
        degats *= epee.getFinesse();
    }

    if (this.aCheval) {
        degats /= 2; // Si le guerrier est à cheval, les dégâts sont divisés par 2
    }

    cible.estAttaque(degats); // Applique les dégâts à la cible
    this.seFatiguer();        // Le guerrier se fatigue après une attaque

    System.out.println(this.nom + " a attaqué " + cible.getNom() + " infligeant " + degats + " points de dégâts.");
}
}
