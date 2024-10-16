/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_manip_marchand;

/**
 *
 * @author loicm
 */
public class TP_manip_MARCHAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        // Référence de assiette3 pointant vers assiette2
        Tartiflette assiette3 = assiette2;

        // Combien de tartiflettes ont réellement été créées ?
        // Il n'y a que deux objets Tartiflette créés, mais trois références.
        
        // Affichage des calories
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Incrémentation des calories de assiette2
        assiette2.nbCalories += 100;

        // Affichage après modification
        System.out.println("nb de calories de Assiette 2 après incrémentation : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 après incrémentation : " + assiette3.nbCalories);

        // Interversion des références entre assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        // Vérification des calories après inversion
        System.out.println("nb de calories de Assiette 1 après inversion : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 après inversion : " + assiette2.nbCalories);
        
        
        Moussaka[] tabMoussaka = new Moussaka[10];

        // Création de 10 objets Moussaka
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(100 * (i + 1));  // Chaque Moussaka a des calories différentes
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
    
}
    
    

