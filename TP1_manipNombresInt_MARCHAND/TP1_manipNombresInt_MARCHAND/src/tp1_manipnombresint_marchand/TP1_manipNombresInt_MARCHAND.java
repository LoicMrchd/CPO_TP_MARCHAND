/*
TP1
exercice manipNombresInt
*/
package tp1_manipnombresint_marchand;

import java.util.Scanner;

/**
 *
 * @author loicm
 */
public class TP1_manipNombresInt_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc;
        sc = new Scanner( System.in);
    
    
    System.out.println( "Veuillez saisir le premier entier :"); 
    int premierEntier =  sc.nextInt();
    
    System.out.print("Veuillez entrer le deuxième entier: ");
    int deuxiemeEntier = sc.nextInt();
    
    System.out.println(" Le premier entier est " + premierEntier);
    System.out.println(" Le deuxieme entier est " + deuxiemeEntier);
    
    
    int somme = 0;
    somme = premierEntier + deuxiemeEntier;
    
    System.out.println("La somme des deux nombres est " + somme);
    
    int difference = 0;
    difference = premierEntier - deuxiemeEntier;
    
    System.out.println("La difference entre les deux nombres est " + difference);
    
    int produit =0;
    produit = premierEntier * deuxiemeEntier;
    
    System.out.println("Le produit des deux nombres est " + produit);
    
    int quotient = premierEntier / deuxiemeEntier;
    int reste = premierEntier % deuxiemeEntier;

        // Affichage des résultats
    System.out.println("Quotient de la division entiere: " + quotient);
    System.out.println("Reste de la division euclidienne: " + reste);
    
    
    }
    
}
