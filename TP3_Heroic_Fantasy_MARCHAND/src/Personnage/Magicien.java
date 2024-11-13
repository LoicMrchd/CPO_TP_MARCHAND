/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import Armes.Baton;

/**
 *
 * @author loicm
 */
public class Magicien extends Personnage {
     private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagiciens++;
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            // Si nécessaire, ajoutez des logiques spécifiques de destruction ici
        } finally {
            super.finalize();  // Appel au finalizer de la classe parente
        }
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Magicien confirme : " + (confirme ? "Oui" : "Non");
    }

    // [Challenge] Compte les bâtons dans l'inventaire
    @Override
    public int compterArmesPredilection() {
        int count = 0;
        for (Arme arme : super.inventaire) {
            if (arme instanceof Baton) {
                count++;
            }
        }
        return count;
    }

    public String getNom() {
    return this.nom;
}

    public String getNiveauVie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}