/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_marchand;

/**
 *
 * @author loicm
 */
public class TP2_relation_1_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Création des objets Voiture
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création des objets Personne
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Affichage des voitures disponibles
        System.out.println("Liste des voitures disponibles : ");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        // Relation : Bob possède une Clio
        bob.ajouter_voiture(uneClio);

        // Affichage de la première voiture de Bob
        System.out.println("La premiere voiture de Bob est : " + bob.liste_voitures[0]);

        // Ajout de la deuxième voiture de Bob
        bob.ajouter_voiture(uneMicra);

        // Ajout des voitures à Reno
        reno.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(une2008);

        // Affichage de la liste des voitures de Bob et Reno
        System.out.println("Voitures de Bob : ");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        System.out.println("Voitures de Reno : ");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}
    
    

