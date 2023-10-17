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
        Gateaux gateaux = new Gateaux("tarte","ajeter a leclerc",190);
        Gateau_Interface fruit = new DecorateurFruit(gateaux,"fraises");
        Gateau_Interface omg = new DecorateurCreme(new DecorateurFruit(gateaux,"myrtille"),"crème fouetté");

        System.out.println(fruit.getName());
        System.out.println(omg.getName());
    }
}
