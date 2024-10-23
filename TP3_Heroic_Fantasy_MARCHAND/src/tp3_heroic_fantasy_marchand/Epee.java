/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_marchand;

/**
 *
 * @author loicm
 */
public class Epee extends Arme {
    
    // Attribut spécifique à l'épée
    private int finesse;  // Indice de finesse (<100)

    // Constructeur
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        // L'indice de finesse doit être inférieur à 100
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 99; // Si dépasse 100, on assigne la valeur maximale possible (99)
        }
    }

    // Getter pour l'indice de finesse
    public int getFinesse() {
        return finesse;
    }

    // Redéfinir toString() pour afficher les informations de l'épée, y compris la finesse
    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}

