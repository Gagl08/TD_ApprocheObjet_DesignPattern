package fr_u_bordeaux_td_designPattern;/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

import java.util.ArrayList;

/**
 * Objet contenant les code.Ingredients d'un Gateau
 * @author gburgues
 * @author boycos
 */
public class Ingredients {
    private String ingredient;

    public Ingredients (String ingredient){
        this.ingredient=ingredient;
    }

    public String getName() {
        return ingredient;
    }

}
