package fr_u_bordeaux_td_designPattern.test;

import fr_u_bordeaux_td_designPattern.*;

import fr_u_bordeaux_td_designPattern.decorateur.Composite;
import fr_u_bordeaux_td_designPattern.decorateur.DecorateurCreme;
import fr_u_bordeaux_td_designPattern.decorateur.DecorateurFruit;
import fr_u_bordeaux_td_designPattern.decorateur.DecorateurMeringue;

import java.util.ArrayList;

/**
 * Classe Main des tests
 * Point d'entrée des tests de l'application pâtisserie
 * Effectue des tests sur la création de gâteaux, les décorateurs et le Composite
 * Utilise également le pattern Builder pour créer des gâteaux
 * @author gburgues
 * @author boycos
 */
public class Main {

    /**
     * Fonction principale de test
     * @param args Arguments passés en ligne de commande
     */
    public static void main(String[] args) {
        // Création d'une instance de Patissier et de GateauFactory
        GateauFactory gateauFactory = new GateauFactory();
        Patissier patissier = new Patissier(10, gateauFactory);

        // Création d'une liste d'ingrédients
        ArrayList<Ingredients> ingredients = new ArrayList<>();
        ingredients.add(new Ingredients("Salade"));
        ingredients.add(new Ingredients("Tomate"));
        ingredients.add(new Ingredients("Oignon"));

        // Création de gâteaux via le Builder
        Gateau_Interface gateaux = new Gateaux.Builder("tarte", "Recette du gâteau au chocolat", 30, ingredients, patissier)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        Gateau_Interface choux = new Gateaux.Builder("choux", "Recette du gâteau au chocolat", 30, ingredients, patissier)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        // Tests d'utilisation des décorateurs

        // Création des instances de Gateau_Interface (fruit et chouchou) avant de les utiliser dans le Composite
        Gateau_Interface fruit = new DecorateurFruit(gateaux, "fraises");
        Gateau_Interface chouchou = new DecorateurCreme(choux, "crème fouetté");

        // Tests du Composite
        Composite leGatoDeChou = new Composite("Tarte au Choux");
        leGatoDeChou.addGateau(fruit);
        leGatoDeChou.addGateau(chouchou);
        leGatoDeChou.removeGateau(chouchou);

        // Tests du Builder
        Gateau_Interface gateau = new Gateaux.Builder("Gâteau au chocolat", "Recette du gâteau au chocolat", 30, ingredients, patissier)
                .withRecette("Recette mise à jour")
                .withTempsDeCuisson(35)
                .build();

        Gateau_Interface chou = new Gateaux.Builder("Chou à la crème", "Recette du chou à la crème", 20, ingredients, patissier)
                .withNom("Chou à la vanille")
                .build();

        Gateau_Interface tarte = new Gateaux.Builder("Tarte aux fruits", "Recette de la tarte aux fruits", 40, ingredients, patissier)
                .build();

        // Affichage des informations des gâteaux
        System.out.println("Nom du gâteau : " + gateau.getName());
        System.out.println("Temps de cuisson du chou : " + chou.getTempsDeCuisson() + " minutes");
        System.out.println("Recette de la tarte : " + tarte.getRecette());

        GateauFactory factory = new GateauFactory();

        // Utilisation de la GateauFactory pour créer des gâteaux et afficher leurs détails
        Gateau_Interface gateauF = factory.createGateau("gateau", "Gateau au chocolat", "Recette du gâteau au chocolat", 45, ingredients,patissier);
        System.out.println(gateauF.getName() + "\n"
                + gateauF.getRecette() + "\n"
                + gateauF.getTempsDeCuisson() + "\n");

        Gateau_Interface chouF = factory.createGateau("chou", "Chou à la crème", "Recette du chou à la crème", 30, ingredients, patissier);
        System.out.println(chouF.getName() + "\n"
                + chouF.getRecette() + "\n"
                + chouF.getTempsDeCuisson() + "\n");

        Gateau_Interface tarteF = factory.createGateau("tarte", "Tarte aux fruits", "Recette de la tarte aux fruits", 60, ingredients, patissier);
        System.out.println(tarteF.getName() + "\n"
                + tarteF.getRecette() + "\n"
                + tarteF.getTempsDeCuisson() + "\n");

        //Utilisation des ventes d un gateau
        GateauFactory gateauFactoryAVendre = new GateauFactory();
        Patissier patissierATester = new Patissier(10, gateauFactory);

        ArrayList<Ingredients> ingredientsBis = new ArrayList<>();
        ingredients.add(new Ingredients("Sucre"));
        ingredients.add(new Ingredients("Farine"));

        Gateau_Interface gateau1 = gateauFactoryAVendre.createGateau("gateau", "Gâteau Chocolat", "Recette Chocolat", 30, ingredientsBis,patissierATester);
        Gateau_Interface gateau2 = gateauFactoryAVendre.createGateau("gateau", "Gâteau Vanille", "Recette Vanille", 40, ingredientsBis,patissierATester);

        patissierATester.addGateau(gateau1);
        patissierATester.addGateau(gateau2);

        // Vente du gâteau
        gateau1.vendre(patissierATester);
        gateau2.vendre(patissierATester);


    }
}