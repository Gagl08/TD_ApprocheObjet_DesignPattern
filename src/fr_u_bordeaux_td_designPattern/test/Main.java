/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */
package fr_u_bordeaux_td_designPattern.test;

import fr_u_bordeaux_td_designPattern.decorateur.Composite;
import fr_u_bordeaux_td_designPattern.decorateur.DecorateurCreme;
import fr_u_bordeaux_td_designPattern.decorateur.DecorateurFruit;
import fr_u_bordeaux_td_designPattern.decorateur.DecorateurMeringue;

import fr_u_bordeaux_td_designPattern.*;

import java.util.ArrayList;

/**
 * fr_u_bordeaux_td_designPattern.test.Main des tests
 * @author gburgues
 * @author boycos
 */
public class Main {

    /**
     * fr_u_bordeaux_td_designPattern.test.Main de l activité
     */
    public static void main(String[] args) {

        // Test des Decorateurs
        // 1er Question on declarait les gateux comme ceci

        // code.Gateaux gateaux = new code.Gateaux("tarte","ajeter a leclerc",190);
        // code.Gateaux choux = new code.Gateaux("choux","ajeter a leclerc",190);

        ArrayList<Ingredients> ingredients = new ArrayList<>();
        ingredients.add(new Ingredients("Salade"));
        ingredients.add(new Ingredients("Tomate"));
        ingredients.add(new Ingredients("Oignon"));

        Gateau_Interface gateaux = new Gateaux.Builder("tarte", "Recette du gâteau au chocolat", 30,ingredients)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        Gateau_Interface choux = new Gateaux.Builder("tarte", "Recette du gâteau au chocolat", 30,ingredients)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        for( Ingredients a : gateaux.getIngredients()) {
            System.out.println(a.getName() + "\t");
        }

        Gateau_Interface fruit = new DecorateurFruit(gateaux,"fraises");
        System.out.println(fruit.getName());

        Gateau_Interface creme = new DecorateurCreme(gateaux,"crème fouetté");
        System.out.println(creme.getName());
        for( Ingredients a : creme.getIngredients()) {
            System.out.println(a.getName() + "\t");
        }
        System.out.println();

        Gateau_Interface omg = new DecorateurCreme(new DecorateurFruit(gateaux,"myrtille"),"crème fouetté");
        System.out.println(omg.getName());

        Gateau_Interface chouchou = new DecorateurCreme(new DecorateurCreme(choux,"crème fouetté"),"crème fouetté");
        System.out.println(chouchou.getName());

        Gateau_Interface gateauDuSiecle = new DecorateurMeringue(new DecorateurFruit(gateaux,"citrons"));
        System.out.println(gateauDuSiecle.getName());

        Gateau_Interface gateauDuSiecleRate = new DecorateurFruit(new DecorateurMeringue(gateaux),"citrons");
        System.out.println(gateauDuSiecleRate.getName());

        //Test du code.decorateur.Composite
        Composite leGatoDeChou = new Composite("Tarte au Choux");
        leGatoDeChou.addGateau(fruit);
        leGatoDeChou.addGateau(chouchou);
        leGatoDeChou.removeGateau(chouchou);

        System.out.println(leGatoDeChou.getName());

        //Test du Builder

        Gateau_Interface gateau = new Gateaux.Builder("Gâteau au chocolat", "Recette du gâteau au chocolat", 30,ingredients)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        Gateau_Interface chou = new Gateaux.Builder("Chou à la crème", "Recette du chou à la crème", 20,ingredients)
                .withNom("Chou à la vanille")
                .build();

        Gateau_Interface tarte = new Gateaux.Builder("Tarte aux fruits", "Recette de la tarte aux fruits", 40,ingredients)
                .build();

        System.out.println("Nom du gâteau : " + gateau.getName());
        System.out.println("Temps de cuisson du chou : " + chou.getTempsDeCuisson() + " minutes");
        System.out.println("Recette de la tarte : " + tarte.getRecette());

    }
}
