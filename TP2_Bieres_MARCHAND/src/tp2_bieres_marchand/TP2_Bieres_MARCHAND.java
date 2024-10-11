/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_marchand;

/**
 *
 * @author loicm
 */
public class TP2_Bieres_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des Trolls", 7.0f, "Dubuisson");
        System.out.println(uneBiere);  // Affichage avec toString()
        uneBiere.decapsuler();
        System.out.println(uneBiere);  // Affichage après ouverture
        System.out.println();

        // Création de la deuxième bière
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        System.out.println(secondeBiere);  // Affichage avec toString()
        secondeBiere.decapsuler();
        System.out.println(secondeBiere);  // Affichage après ouverture
        System.out.println();

        // Création de 3 autres bières
        BouteilleBiere biere3 = new BouteilleBiere("Kwak", 8.4f, "Brouwerij Bosteels");
        System.out.println(biere3);  // Affichage avec toString()
        biere3.decapsuler();
        System.out.println(biere3);  // Affichage après ouverture
        System.out.println();

        BouteilleBiere biere4 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        System.out.println(biere4);  // Affichage avec toString()
        biere4.decapsuler();
        System.out.println(biere4);  // Affichage après ouverture
        System.out.println();

        BouteilleBiere biere5 = new BouteilleBiere("Punk IPA", 5.6f, "BrewDog");
        System.out.println(biere5);  // Affichage avec toString()
        biere5.decapsuler();
        System.out.println(biere5);  // Affichage après ouverture
        System.out.println();
    }
    
}
