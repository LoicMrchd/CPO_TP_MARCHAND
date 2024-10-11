/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_marchand;

import java.util.Scanner;

/**
 *
 * @author loicm
 */
public class TP2_convertisseurObjet_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Convertisseur conv1 = new Convertisseur();

        // Appel de quelques méthodes de conversion
        double celsius = 25.0;
        double fahrenheit = conv1.CelsiusVersFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        double kelvin = conv1.CelsiusVersKelvin(celsius);
        System.out.println(celsius + "°C = " + kelvin + "K");

        double fahrToCelsius = conv1.FahrenheitVersCelsius(77.0);
        System.out.println("77°F = " + fahrToCelsius + "°C");

        // Affichage du nombre de conversions
        System.out.println(conv1);

        // Création d'un second objet Convertisseur
        Convertisseur conv2 = new Convertisseur();

        // Autres conversions avec le second objet
        double kelvinToFahr = conv2.KelvinVersFahrenheit(300.0);
        System.out.println("300K = " + kelvinToFahr + "°F");

        double fahrToKelvin = conv2.FahrenheitVersKelvin(98.6);
        System.out.println("98.6°F = " + fahrToKelvin + "K");

        // Affichage du nombre de conversions pour le second objet
        System.out.println(conv2);

        // Affichage du menu interactif
        menuInteractif();
    }

    // Méthode pour afficher un menu interactif
    public static void menuInteractif() {
        Scanner sc = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();

        while (true) {
            System.out.println("\n---- Menu Convertisseur ----");
            System.out.println("1. Celsius vers Fahrenheit");
            System.out.println("2. Fahrenheit vers Celsius");
            System.out.println("3. Celsius vers Kelvin");
            System.out.println("4. Kelvin vers Celsius");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = sc.nextInt();

            if (choix == 5) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez la temperature a convertir : ");
            double temperature = sc.nextDouble();
            double resultat = 0.0;

            switch (choix) {
                case 1:
                    resultat = convertisseur.CelsiusVersFahrenheit(temperature);
                    System.out.println(temperature + "C = " + resultat + "F");
                    break;
                case 2:
                    resultat = convertisseur.FahrenheitVersCelsius(temperature);
                    System.out.println(temperature + "F = " + resultat + "C");
                    break;
                case 3:
                    resultat = convertisseur.CelsiusVersKelvin(temperature);
                    System.out.println(temperature + "C = " + resultat + "K");
                    break;
                case 4:
                    resultat = convertisseur.KelvinVersCelsius(temperature);
                    System.out.println(temperature + "K = " + resultat + "C");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }

            System.out.println("Nombre de conversions : " + convertisseur);
        }

        sc.close();
    }
}
        // TODO code application logic here
    
    

