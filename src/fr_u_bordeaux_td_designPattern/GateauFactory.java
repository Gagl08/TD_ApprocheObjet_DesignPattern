/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern;

import java.util.ArrayList;

/**
 * Classe pour creer un gateau avec une Factory
 * @author gburgues
 * @author boycos
 */
public class GateauFactory {
    public Gateau_Interface createGateau(String type, String nom, String recette, int tempsDeCuisson, ArrayList<Ingredients> ingredients,Patissier patissier){
        if (type.equalsIgnoreCase("gateau")) {
            return new Gateaux.Builder(nom, recette, tempsDeCuisson, ingredients, patissier).build();
        } else if (type.equalsIgnoreCase("chou")) {
            // Créer et retourner un chou
            return new Chou(nom, recette, tempsDeCuisson, ingredients);
        } else if (type.equalsIgnoreCase("tarte")) {
            // Créer et retourner une tarte
            return new Tarte(nom, recette, tempsDeCuisson, ingredients);
        } else {
            return null; // Gérer les cas non reconnus
        }
    }
}
