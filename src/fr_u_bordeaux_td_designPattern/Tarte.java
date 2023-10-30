/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern;

import java.util.ArrayList;

/**
 * Objet décrivant une tarte
 * @author gburgues
 * @author boycos
 */
public class Tarte implements Gateau_Interface {
    // Attributs privés de la classe Tarte
    private final String nom;
    private final String recette;
    private final int temps_de_cuisson;
    private final ArrayList<Ingredients> liste_ingredient;

    // Constructeur prenant en paramètre les détails d'une tarte
    public Tarte(String nom, String recette, int tempsDeCuisson, ArrayList<Ingredients> ingredients) {
        this.nom = nom;
        this.recette = recette;
        this.temps_de_cuisson = tempsDeCuisson;
        this.liste_ingredient = new ArrayList<>();
        this.liste_ingredient.addAll(ingredients);
    }

    // Méthode retournant le nom de la tarte
    @Override
    public String getName() {
        return nom;
    }

    // Méthode retournant la recette de la tarte
    @Override
    public String getRecette() {
        return recette;
    }

    // Méthode retournant le temps de cuisson de la tarte
    @Override
    public int getTempsDeCuisson() {
        return temps_de_cuisson;
    }

    // Méthode retournant la liste des ingrédients de la tarte
    @Override
    public ArrayList<Ingredients> getIngredients() {
        return liste_ingredient;
    }

    @Override
    public void update() {
    }

    @Override
    public void vendre(Patissier patissier) {
    }
}
