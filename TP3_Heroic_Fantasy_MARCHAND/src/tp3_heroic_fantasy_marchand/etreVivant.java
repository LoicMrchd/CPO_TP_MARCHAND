/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_fantasy_marchand;

/**
 *
 * @author loicm
 */
public interface etreVivant {
     void seFatiguer();   // Méthode pour fatiguer un être vivant
    boolean estVivant(); // Méthode pour savoir si l'être vivant est toujours en vie
    void estAttaque(int points); // Méthode pour attaquer un être vivant et lui infliger des dégâts
}

