/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_marchand;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.Vector;

/**
 *
 * @author loicm
 */
public class TP3_Heroic_Fantasy_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // Création des deux épées avec des paramètres différents
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création des deux bâtons avec des paramètres différents
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        
        
        Vector<Arme> armes = new Vector<>();

        // Ajout des armes dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Parcours du tableau dynamique et affichage des caractéristiques des armes
        for (int i = 0; i < armes.size(); i++) {
            // Utilisation de elementAt() pour récupérer l'arme
            Arme arme = armes.elementAt(i);
            // Affichage des caractéristiques de l'arme
            System.out.println(arme);
        

        // Affichage des informations des épées
        System.out.println(excalibur);  // Affiche : Nom de l'arme : Excalibur, Niveau d'attaque : 7, Finesse : 5
        System.out.println(durandal);   // Affiche : Nom de l'arme : Durandal, Niveau d'attaque : 4, Finesse : 7

        // Affichage des informations des bâtons
        System.out.println(chene);      // Affiche : Nom de l'arme : Chêne, Niveau d'attaque : 4, Âge : 5
        System.out.println(charme);     // Affiche : Nom de l'arme : Charme, Niveau d'attaque : 5, Âge : 6
    }
   }
}
