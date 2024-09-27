/*
TP1
exercice convertisseur
*/
package tp1_convertisseur_marchand;

import java.util.Scanner;

/**
 *
 * @author loicm
 */
public class TP1_convertisseur_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Demande de saisie de la température
        System.out.print("Bonjour, saisissez une valeur de temperature: ");
        double temperature = scanner.nextDouble();

        // Affichage du menu de sélection des conversions
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Choix de l'utilisateur
        int choix = scanner.nextInt();

        // Exécution de la conversion en fonction du choix
        switch (choix) {
            case 1:
                System.out.println(temperature + " degres Celsius est egal a " 
                                   + CelciusVersKelvin(temperature) + " degres Kelvin.");
                break;
            case 2:
                System.out.println(temperature + " degres Kelvin est egal a " 
                                   + KelvinVersCelcius(temperature) + " degres Celsius.");
                break;
            case 3:
                System.out.println(temperature + " degres Fahrenheit est egal a " 
                                   + FarenheitVersCelcius(temperature) + " degres Celsius.");
                break;
            case 4:
                System.out.println(temperature + " degres Celsius est egal a " 
                                   + CelciusVersFarenheit(temperature) + " degres Fahrenheit.");
                break;
            case 5:
                System.out.println(temperature + " degres Kelvin est egal a " 
                                   + KelvinVersFarenheit(temperature) + " degres Fahrenheit.");
                break;
            case 6:
                System.out.println(temperature + " degres Fahrenheit est egal a " 
                                   + FarenheitVersKelvin(temperature) + " degres Kelvin.");
                break;
            default:
                System.out.println("Choix invalide.");
        }

        // Fermeture du scanner
        scanner.close();
    }

    // Méthode pour convertir Celsius vers Kelvin
    public static double CelciusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    // Méthode pour convertir Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit vers Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius vers Fahrenheit
    public static double CelciusVersFarenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin vers Fahrenheit
    public static double KelvinVersFarenheit(double tKelvin) {
        // Conversion indirecte : Kelvin -> Celsius -> Fahrenheit
        double tempCelsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tempCelsius);
    }

    // Méthode pour convertir Fahrenheit vers Kelvin
    public static double FarenheitVersKelvin(double tFahrenheit) {
        // Conversion indirecte : Fahrenheit -> Celsius -> Kelvin
        double tempCelsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(tempCelsius);
    }
}
    
   

