/*
* TP0 Ex 3
* Marchand Loïc 
* TDC
* Septembre 2024
*/

package tpo_exo3;

import java.util.Scanner;

/**
 *
 * @author loicm
 */
public class TPO_Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
    
    System.out.println("Please enter the operator:\n" +
" 1)add\n" +
" 2)substract\n" +
" 3)multiply\n" +
" 4)divide\n" +
" 5)modulo");
    
    

    Scanner sc;
    sc = new Scanner(System.in);
int operateur = sc.nextInt();

System.out.println("Vous avez choisis l'operation : " + operateur);


// Ajout des lignes pour demander et récupérer la première valeur
System.out.println("Rentrer la premiere valeur (operande1) :");
double operande1 = sc.nextDouble();

// Affichage de la valeur de l'opérande pour vérifier
System.out.println("La premiere valeur saisie (operande1) est : " + operande1);
    
System.out.println("Rentrer la premiere valeur (operande2) :");
double operande2 = sc.nextDouble();

// Affichage de la valeur de l'opérande pour vérifier
System.out.println("La premiere valeur saisie (operande2) est : " + operande2);


        // Calculer le résultat
        double resultat = 0;

        if (operateur == 1) {
            resultat = operande1 + operande2;  // Addition
        } else if (operateur == 2) {
            resultat = operande1 - operande2;  // Soustraction
        } else if (operateur == 3) {
            resultat = operande1 * operande2;  // Multiplication
        } else if (operateur == 4) {
            if (operande2 != 0) {
                resultat = operande1 / operande2;  // Division
            } else {
                System.out.println("Erreur : Division par zéro.");
                return;
            }
        } else if (operateur == 5) {
            if (operande2 != 0) {
                resultat = operande1 % operande2;  // Modulo
            } else {
                System.out.println("Erreur : Division par zéro.");
                return;
            }
        } else {
            System.out.println("Erreur : Opérateur non valide.");
            return;
        }

        // Afficher le résultat
        System.out.println("The result is : " + resultat);
        

    
    
    }
    
}
