/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

import java.util.ArrayList;

/**
 * Objet contenant les Ingredients d'un Gateau
 * @author gburgues
 * @author boycos
 */
public class Ingredients {
    private ArrayList<String> liste_ingredient = new ArrayList<>();

    public Ingredients (String ingredient){
        this.liste_ingredient.add(ingredient);
    }
}
