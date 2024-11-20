/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_marchand;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
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
        
        
        Magicien merlin = new Magicien("Merlin", 80, true);
        Magicien novice = new Magicien("Novice", 60, false);

        // Création d'un guerrier à cheval et d'un guerrier sans cheval
        Guerrier arthur = new Guerrier("Arthur", 100, true);
        Guerrier lancelot = new Guerrier("Lancelot", 90, false);

        // Affichage des informations de chaque personnage
        System.out.println(merlin);   // Affiche les caractéristiques du magicien Merlin
        System.out.println(novice);   // Affiche les caractéristiques du magicien Novice
        System.out.println(arthur);   // Affiche les caractéristiques du guerrier Arthur
        System.out.println(lancelot); // Affiche les caractéristiques du guerrier Lancelot
        
        // Création des deux magiciens avec des paramètres différents
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        // Création des deux guerriers avec des paramètres différents
        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        // Création d'un tableau dynamique (Vector) pour stocker les personnages
        Vector<Personnage> personnages = new Vector<>();

        // Ajout des personnages dans le tableau dynamique
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        // Parcours du tableau dynamique et affichage des caractéristiques des personnages
        for (Personnage personnage : personnages) {
            System.out.println(personnage);
    }
        
        // Création des personnages
        

        // Ajout des armes aux personnages
        gandalf.ajouterArme(chene);
        conan.ajouterArme(excalibur);

        // Équipage d'arme
        gandalf.equiperArme("Chene");
        conan.equiperArme("Excalibur");

        // Affichage des informations des personnages
        System.out.println(gandalf);
        System.out.println("Nombre de batons pour Gandalf : " + gandalf.compterArmesPredilection());

        System.out.println(conan);
        System.out.println("Nombre d'epees pour Conan : " + conan.compterArmesPredilection());
        

        // Création des armes
        Baton batonChene = new Baton("Chêne", 4, 5);
        Baton batonSaule = new Baton("Saule", 3, 6);
        Baton batonErable = new Baton("Érable", 5, 7);
        
        Epee epeeExcalibur = new Epee("Excalibur", 7, 5);
        Epee epeeDurandal = new Epee("Durandal", 6, 7);
        Epee epeeJoyeuse = new Epee("Joyeuse", 5, 6);

        // Ajout d'1 bâton et 2 épées dans le stock d'armes du guerrier
        conan.ajouterArme(batonChene);
        conan.ajouterArme(epeeExcalibur);
        conan.ajouterArme(epeeDurandal);

        // Choix de la première épée pour le guerrier
        conan.equiperArme("Excalibur");

        // Ajout de 2 bâtons et 1 épée dans le stock d'armes du magicien
        gandalf.ajouterArme(batonSaule);
        gandalf.ajouterArme(batonErable);
        gandalf.ajouterArme(epeeJoyeuse);

        // Affichage du nombre d'armes de prédilection du magicien (bâtons)
        System.out.println("Nombre de bâtons dans l'inventaire de " + gandalf.getNom() + " : " + gandalf.compterArmesPredilection());

        // Affichage des caractéristiques des personnages
        System.out.println(conan);
        System.out.println(gandalf);
        

        // Affichage des nombres de personnages, guerriers, et magiciens
        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers : " + Personnage.getNbGuerriers());
        System.out.println("Nombre total de magiciens : " + Personnage.getNbMagiciens());
        
        conan = null;
        gandalf = null;

        // Demande au garbage collector de libérer la mémoire
        System.gc();

        // Une petite pause pour laisser le GC effectuer son travail
        try {
            Thread.sleep(1000); // Attendre 1 seconde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Affichage après la "destruction"
        System.out.println("Après suppression des objets :");
        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre total de guerriers : " + Personnage.getNbGuerriers());
        System.out.println("Nombre total de magiciens : " + Personnage.getNbMagiciens());
        
        System.out.println(conan.getNom() + " est vivant : " + conan.estVivant());
        System.out.println(gandalf.getNom() + " est vivant : " + gandalf.estVivant());

        // Attaque de Conan
        conan.estAttaque(30);
        System.out.println(conan.getNom() + " après attaque, niveau de vie : " + conan.getNiveauVie());

        // Fatigue Gandalf
        gandalf.seFatiguer();
        System.out.println(gandalf.getNom() + " après fatigue, niveau de vie : " + gandalf.getNiveauVie());

        // Vérification si les personnages sont toujours vivants
        System.out.println(conan.getNom() + " est vivant après fatigue et attaque : " + conan.estVivant());
        System.out.println(gandalf.getNom() + " est vivant après fatigue : " + gandalf.estVivant());
   }
}
}

