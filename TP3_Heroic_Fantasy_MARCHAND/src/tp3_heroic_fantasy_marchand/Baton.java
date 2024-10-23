/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marchand;

/**
 *
 * @author loicm
 */
public class Baton extends Arme {
    
    // Attribut spécifique au bâton
    private int age;  // Âge du bâton (<100)

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        // L'âge doit être inférieur à 100
        if (age < 100) {
            this.age = age;
        } else {
            this.age = 99; // Si dépasse 100, on assigne la valeur maximale possible (99)
        }
    }

    // Getter pour l'âge du bâton
    public int getAge() {
        return age;
    }

    // Redéfinir toString() pour afficher les informations du bâton, y compris l'âge
    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }
}
