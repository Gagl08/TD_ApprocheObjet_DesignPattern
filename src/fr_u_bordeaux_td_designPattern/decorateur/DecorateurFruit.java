/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern.decorateur;

import fr_u_bordeaux_td_designPattern.*;

import java.util.ArrayList;

/**
 * code.decorateur.Decorateur rajoutant des fruit à un gateau
 * code.decorateur.Decorateur global. String fruit ajouter par l'utilisateur pour eviter la redondance de code.decorateur.Decorateur
 * @author gburgues
 * @author boycos
 */
public class DecorateurFruit extends Decorateur{
    private final String fruit;
    /**
     * Constructeur du code.decorateur de code.Gateaux
     * @param gateaux_decore a rajouter un code.decorateur.Decorateur
     */
    public DecorateurFruit(Gateau_Interface gateaux_decore, String fruit) {
        super(gateaux_decore);
        this.fruit = fruit;
    }

    /**
     * Getteur du gateau decorer de ces fruits
     * @return name
     */
    public String getName(){
        return super.getName()+" aux "+ fruit;
    }

    /**
     * Getteur des Ingredient du gateau en ajoutant le fruit
     * @return Arraylist Ingredient
     */
    public ArrayList<Ingredients> getIngredients(){
        Ingredients ingredients= new Ingredients(fruit);
        super.getIngredients().add(ingredients);
        return super.getIngredients();
    }
}
