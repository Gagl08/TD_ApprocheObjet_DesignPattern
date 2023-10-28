 /*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

 package fr_u_bordeaux_td_designPattern.decorateur;

 import fr_u_bordeaux_td_designPattern.*;
 import java.util.ArrayList;

 /**
 * code.decorateur.Decorateur rajoutant des cremes à un gateau
 * code.decorateur.Decorateur global. String cremes ajouter par l'utilisateur pour eviter la redondance de code.decorateur.Decorateur
 * @author gburgues
 * @author boycos
 */
public class DecorateurCreme extends Decorateur{
    private final String creme;
    /**
     * Constructeur du code.decorateur de code.Gateaux
     *
     * @param gateaux_decore a rajouter un code.decorateur.Decorateur
     */
    public DecorateurCreme(Gateau_Interface gateaux_decore, String creme) {
        super(gateaux_decore);
        this.creme=creme;
    }

    /**
     * Getteur du gateau decorer de ces fruits
     * @return name
     */
    public String getName(){
        return super.getName()+" a la "+ creme;
    }

     /**
      * Getteur des Ingredient du gateau en ajoutant la creme
      * @return Arraylist Ingredient
      */
    public ArrayList<Ingredients> getIngredients(){
        Ingredients ingredients= new Ingredients(creme);
        super.getIngredients().add(ingredients);
        return super.getIngredients();
    }
}
