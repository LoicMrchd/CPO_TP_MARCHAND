/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_marchand;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author loicm
 */
public class TP1_stats_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        int[] facesDe = new int[6];

        for (int i = 0; i < m; i++) {

            int nombreAleatoire = generateurAleat.nextInt(6);

            facesDe[nombreAleatoire]++;
        }

        System.out.println("Resultats des tirages (en pourcentage) :");
        for (int i = 0; i < facesDe.length; i++) {
            double pourcentage = (facesDe[i] / (double) m) * 100;
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage);
        }

        scanner.close();
    }
}
