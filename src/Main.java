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

        //Test des Decorateurs
        Gateaux gateaux = new Gateaux("tarte","ajeter a leclerc",190);
        Gateaux choux = new Gateaux("choux","ajeter a leclerc",190);

        Gateau_Interface fruit = new DecorateurFruit(gateaux,"fraises");
        System.out.println(fruit.getName());

        Gateau_Interface omg = new DecorateurCreme(new DecorateurFruit(gateaux,"myrtille"),"crème fouetté");
        System.out.println(omg.getName());

        Gateau_Interface chouchou = new DecorateurCreme(new DecorateurCreme(gateaux,"crème fouetté"),"crème fouetté");
        System.out.println(chouchou.getName());

        //Test du Composite
        Composite leGatoDeChou = new Composite("Tarte au Choux");
        leGatoDeChou.addGateau(fruit);
        leGatoDeChou.addGateau(chouchou);
        System.out.println(leGatoDeChou.getName());

    }
}
