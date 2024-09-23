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
        
    Scanner sc;
    sc = new Scanner( System.in);
    
    System.out.print("Veuillez entrer une valeur reelle: ");
        double valeurReelle = sc.nextDouble();

    
    System.out.println("Vous avez saisi la valeur réelle : " + valeurReelle);
    
    System.out.println("Veuillez entrer une température en degres Celsius :");
    double temperatureCelsius = sc.nextDouble();
    
    double temperatureKelvin = temperatureCelsius + 273.15;
    
    System.out.println("Temperature en degres Celsius :" + temperatureCelsius);
    System.out.println("Temperature en kelvin correspondante : " + temperatureKelvin);
    
    
   
    }
   
}
