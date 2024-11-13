/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Armes.Arme;
import java.util.Vector;

/**
 *
 * @author loicm
 */
public abstract class Personnage {
    protected String nom;
    protected int niveauVie;
    protected Vector<Arme> inventaire = new Vector<>();
    protected Arme armeEnMain = null;

    // Attributs statiques pour compter les personnages, guerriers et magiciens
    private static int nbPersonnages = 0;
    static int nbGuerriers = 0;
    static int nbMagiciens = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;  // Incrémente le compteur de personnages chaque fois qu'un personnage est créé
    }
    
    public void seFatiguer() {
        this.niveauVie -= 10; // Chaque fatigue fait perdre 10 points de vie
        if (this.niveauVie < 0) {
            this.niveauVie = 0; // Le niveau de vie ne peut pas devenir négatif
        }
    }

    // Implémentation de la méthode estVivant() de l'interface EtreVivant
    public boolean estVivant() {
        return this.niveauVie > 0; // Si le niveau de vie est positif, le personnage est vivant
    }

    // Implémentation de la méthode estAttaque() de l'interface EtreVivant
    public void estAttaque(int points) {
        this.niveauVie -= points; // On soustrait les points d'attaque du niveau de vie
        if (this.niveauVie < 0) {
            this.niveauVie = 0; // Le niveau de vie ne peut pas devenir négatif
        }
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            nbPersonnages--;  // On décrémente le compteur des personnages
            if (this instanceof Guerrier) {
                nbGuerriers--;  // Si c'est un guerrier, on décrémente le compteur des guerriers
            } else if (this instanceof Magicien) {
                nbMagiciens--;  // Si c'est un magicien, on décrémente le compteur des magiciens
            }
        } finally {
            super.finalize();  // Appel au finalizer de la classe parente
        }
    }

    // Getters pour les attributs statiques
    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    public static int getNbGuerriers() {
        return nbGuerriers;
    }

    public static int getNbMagiciens() {
        return nbMagiciens;
    }

    // Ajoute une arme si l'inventaire contient moins de 5 armes
    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
            System.out.println(arme.getNom() + " a ete ajoutee à l'inventaire de " + nom + ".");
        } else {
            System.out.println("L'inventaire est plein. Impossible d'ajouter " + arme.getNom() + ".");
        }
    }

    // Getter pour l'arme en main
    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    // Méthode pour équiper une arme en fonction de son nom
    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " est maintenant equipe(e) de " + arme.getNom() + ".");
                return;
            }
        }
        System.out.println(nomArme + " n'est pas dans l'inventaire de " + nom + ".");
    }

    // Redéfinition de la méthode toString pour afficher les informations du personnage et de l'arme en main
    @Override
    public String toString() {
        String infoArme = (armeEnMain != null) ? ", Arme en main : " + armeEnMain : ", Pas d'arme en main";
        return "Nom du personnage : " + nom + ", Niveau de vie : " + niveauVie + infoArme;
    }

    // [Challenge] Méthode abstraite pour obtenir le nombre d'armes de prédilection
    public abstract int compterArmesPredilection();
}