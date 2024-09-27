/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_marchand;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author loicm
 */
public class TP1_guessMyNumber_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Création d'un générateur de nombres aléatoires
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        // Choix du niveau de difficulté
        System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        int difficulte = scanner.nextInt();

        int maxTentatives;
        int plageNombre;

        // Définir les règles selon le niveau de difficulté
        switch (difficulte) {
            case 1: // Facile
                maxTentatives = 10;
                plageNombre = 50; // Nombre entre 0 et 50
                break;
            case 2: // Normal
                maxTentatives = 7;
                plageNombre = 100; // Nombre entre 0 et 100
                break;
            case 3: // Difficile
                maxTentatives = 5;
                plageNombre = 100; // Nombre entre 0 et 100
                break;
            default:
                System.out.println("Difficulte non valide. Par defaut, normal est selectionne.");
                maxTentatives = 7;
                plageNombre = 100;
                break;
        }

        // Génération d'un nombre aléatoire dans la plage choisie
        int n = generateurAleat.nextInt(plageNombre + 1); // Inclusif

        System.out.println("Bienvenue ! Essayez de deviner le nombre aléatoire entre 0 et " + plageNombre + ".");

        // Boucle pour demander à l'utilisateur de saisir une valeur
        int utilisateurNombre = -1; // Initialisation avec une valeur non valide
        int tentatives = 0; // Compteur de tentatives

        while (utilisateurNombre != n && tentatives < maxTentatives) {
            // Demande à l'utilisateur de saisir un nombre dans la plage
            System.out.print("Veuillez saisir un nombre entre 0 et " + plageNombre + ": ");
            utilisateurNombre = scanner.nextInt();
            tentatives++; // Incrémente le compteur de tentatives

            // Vérification que le nombre est bien dans la plage demandée
            if (utilisateurNombre < 0 || utilisateurNombre > plageNombre) {
                System.out.println("Le nombre saisi n'est pas valide. Veuillez saisir un nombre entre 0 et " + plageNombre + ".");
                tentatives--; // Ne pas compter une tentative invalide
            } else {
                // Comparaison du nombre saisi avec le nombre aléatoire
                if (utilisateurNombre < n) {
                    if (n - utilisateurNombre > 20) {
                        System.out.println("Vraiment trop petit !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                } else if (utilisateurNombre > n) {
                    if (utilisateurNombre - n > 20) {
                        System.out.println("Vraiment trop grand !");
                    } else {
                        System.out.println("Trop grand !");
                    }
                } else {
                    System.out.println("Gagne !");
                }
            }
        }

        // Affichage du nombre de tentatives
        if (utilisateurNombre == n) {
            System.out.println("Le nombre de tentatives effectue est de : " + tentatives);
        } else {
            System.out.println("Vous avez epuise toutes vos tentatives. Le nombre aleatoire etait : " + n);
        }

        // Fermeture du scanner
        scanner.close();
        // TODO code application logic here
    }
    
}
