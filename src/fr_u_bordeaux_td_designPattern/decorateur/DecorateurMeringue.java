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
public class DecorateurMeringue extends Decorateur{
    /**
     * Constructeur du code.decorateur de code.Gateaux
     * @param gateaux_decore a rajouter un code.decorateur.Decorateur
     */
    public DecorateurMeringue(Gateau_Interface gateaux_decore) {
        super(gateaux_decore);
    }

    /**
     * Getteur du gateau decorer de ces fruits
     * @return name
     */
    public String getName(){
        return super.getName()+" meringué";
    }

    /**
     * Getteur des Ingredient du gateau en ajoutant la meringue
     * @return Arraylist Ingredient
     */
    public ArrayList<Ingredients> getIngredients(){
        Ingredients ingredients= new Ingredients("meringue");
        super.getIngredients().add(ingredients);
        return super.getIngredients();
    }
}

