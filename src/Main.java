/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Main des tests
 * @author gburgues
 * @author boycos
 */
public class Main {

    /**
     * Main de l activité
     */
    public static void main(String[] args) {

        // Test des Decorateurs
        // 1er Question on declarait les gateux comme ceci

        // Gateaux gateaux = new Gateaux("tarte","ajeter a leclerc",190);
        // Gateaux choux = new Gateaux("choux","ajeter a leclerc",190);

        Gateau_Interface gateaux = new Gateaux.Builder("tarte", "Recette du gâteau au chocolat", 30)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        Gateau_Interface choux = new Gateaux.Builder("tarte", "Recette du gâteau au chocolat", 30)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();


        Gateau_Interface fruit = new DecorateurFruit(gateaux,"fraises");
        System.out.println(fruit.getName());

        Gateau_Interface omg = new DecorateurCreme(new DecorateurFruit(gateaux,"myrtille"),"crème fouetté");
        System.out.println(omg.getName());

        Gateau_Interface chouchou = new DecorateurCreme(new DecorateurCreme(choux,"crème fouetté"),"crème fouetté");
        System.out.println(chouchou.getName());

        Gateau_Interface gateauDuSiecle = new DecorateurMeringue(new DecorateurFruit(gateaux,"citrons"));
        System.out.println(gateauDuSiecle.getName());

        Gateau_Interface gateauDuSiecleRate = new DecorateurFruit(new DecorateurMeringue(gateaux),"citrons");
        System.out.println(gateauDuSiecleRate.getName());

        //Test du Composite
        Composite leGatoDeChou = new Composite("Tarte au Choux");
        leGatoDeChou.addGateau(fruit);
        leGatoDeChou.addGateau(chouchou);
        leGatoDeChou.removeGateau(chouchou);

        System.out.println(leGatoDeChou.getName());

        //Test du Builder

        Gateau_Interface gateau = new Gateaux.Builder("Gâteau au chocolat", "Recette du gâteau au chocolat", 30)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        Gateau_Interface chou = new Gateaux.Builder("Chou à la crème", "Recette du chou à la crème", 20)
                .withNom("Chou à la vanille")
                .build();

        Gateau_Interface tarte = new Gateaux.Builder("Tarte aux fruits", "Recette de la tarte aux fruits", 40)
                .build();

        System.out.println("Nom du gâteau : " + gateau.getName());
        System.out.println("Temps de cuisson du chou : " + chou.getTempsDeCuisson() + " minutes");
        System.out.println("Recette de la tarte : " + tarte.getRecette());

    }
}
