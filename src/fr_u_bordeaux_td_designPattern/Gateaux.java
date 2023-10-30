/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern;

import java.util.ArrayList;

/**
 * Objet dérivant un gateau
 * @author gburgues
 * @author boycos
 */
public class Gateaux implements Gateau_Interface, Observer{
    private String nom;
    private String recette;
    private int temps_de_cuisson;
    private ArrayList<Ingredients> liste_ingredient;
    private Patissier patissier;

    private Gateaux() {} // Constructeur privé pour le Builder

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
    public ArrayList<Ingredients> getIngredients(){return liste_ingredient;}

    @Override
    public void update() {
        vendre(patissier);
    }

    public void vendre(Patissier patissier) {

        patissier.removeGateau(this);
        System.out.println("Gateau vendu");
        patissier.checkStock(patissier);
    }

    @Override
    public void update(Gateau_Interface gateau) {
    }

    public static class Builder extends GateauBuilder {
        private final Patissier patissier;

        public Builder(String nom, String recette, int temps_de_cuisson, ArrayList<Ingredients> ingredients, Patissier patissier) {
            // Initialisation des attributs...
            this.nom = nom;
            this.recette = recette;
            this.temps_de_cuisson = temps_de_cuisson;
            this.liste_ingredient = new ArrayList<>();
            this.liste_ingredient.addAll(ingredients);
            this.patissier = patissier;
            this.patissier.addGateau(build());
        }

        @Override
        public Gateaux build() {
            Gateaux gateau = new Gateaux();
            gateau.nom = nom;
            gateau.recette = recette;
            gateau.temps_de_cuisson = temps_de_cuisson;
            gateau.liste_ingredient = liste_ingredient;
            gateau.patissier = patissier;

            return gateau;
        }

        @Override
        public GateauBuilder withNom(String nom) {
            return this;
        }

        @Override
        public GateauBuilder withRecette(String recette) {
            return this;
        }

        @Override
        public GateauBuilder withTempsDeCuisson(int temps_de_cuisson) {
            return this;
        }

        @Override
        public GateauBuilder withListe_ingredient (ArrayList liste_ingredient){return this;}
    }
}
