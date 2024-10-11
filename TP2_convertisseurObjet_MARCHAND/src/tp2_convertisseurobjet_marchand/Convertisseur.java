/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_marchand;

/**
 *
 * @author loicm
 */
public class Convertisseur {
    
    // Attribut pour compter le nombre de conversions
    private int nbConversions;

    // Constructeur : initialise nbConversions à 0
    public Convertisseur() {
        this.nbConversions = 0;
    }

    // Méthode pour convertir Celsius vers Fahrenheit
    public double CelsiusVersFahrenheit(double tempCelsius) {
        nbConversions++;  // Incrémente le nombre de conversions
        return (tempCelsius * 9.0 / 5.0) + 32.0;
    }

    // Méthode pour convertir Fahrenheit vers Celsius
    public double FahrenheitVersCelsius(double tempFahrenheit) {
        nbConversions++;  // Incrémente le nombre de conversions
        return (tempFahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Méthode pour convertir Celsius vers Kelvin
    public double CelsiusVersKelvin(double tempCelsius) {
        nbConversions++;  // Incrémente le nombre de conversions
        return tempCelsius + 273.15;
    }

    // Méthode pour convertir Kelvin vers Celsius
    public double KelvinVersCelsius(double tempKelvin) {
        nbConversions++;  // Incrémente le nombre de conversions
        return tempKelvin - 273.15;
    }

    // Méthode pour convertir Fahrenheit vers Kelvin
    public double FahrenheitVersKelvin(double tempFahrenheit) {
        nbConversions++;  // Incrémente le nombre de conversions
        return CelsiusVersKelvin(FahrenheitVersCelsius(tempFahrenheit));
    }

    // Méthode pour convertir Kelvin vers Fahrenheit
    public double KelvinVersFahrenheit(double tempKelvin) {
        nbConversions++;  // Incrémente le nombre de conversions
        return CelsiusVersFahrenheit(KelvinVersCelsius(tempKelvin));
    }

    // Redéfinition de la méthode toString() pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }
}
    

