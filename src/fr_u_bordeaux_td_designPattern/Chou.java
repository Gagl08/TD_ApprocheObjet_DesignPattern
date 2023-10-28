package fr_u_bordeaux_td_designPattern;

import java.util.ArrayList;

public class Chou implements Gateau_Interface {
    private final String nom;
    private final String recette;
    private final int temps_de_cuisson;
    private final ArrayList<Ingredients> liste_ingredient;

    public Chou(String nom, String recette, int tempsDeCuisson, ArrayList<Ingredients> ingredients) {
        this.nom = nom;
        this.recette = recette;
        this.temps_de_cuisson = tempsDeCuisson;
        this.liste_ingredient = new ArrayList<>();
        this.liste_ingredient.addAll(ingredients);
    }

    @Override
    public String getName() {
        return nom;
    }

    @Override
    public String getRecette() {
        return recette;
    }

    @Override
    public int getTempsDeCuisson() {
        return temps_de_cuisson;
    }

    @Override
    public ArrayList<Ingredients> getIngredients() {
        return liste_ingredient;
    }

}