package fr_u_bordeaux_td_designPattern;/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Objet dérivant un gateau
 * @author gburgues
 * @author boycos
 */
public class Gateaux implements Gateau_Interface {
    private String nom;
    private String recette;
    private int temps_de_cuisson;

    private Gateaux() { } // Constructeur privé pour le Builder

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

    public static class Builder extends GateauBuilder {
        public Builder(String nom, String recette, int temps_de_cuisson) {
            this.nom = nom;
            this.recette = recette;
            this.temps_de_cuisson = temps_de_cuisson;
        }

        @Override
        public Gateau_Interface build() {
            Gateaux gateau = new Gateaux();
            gateau.nom = nom;
            gateau.recette = recette;
            gateau.temps_de_cuisson = temps_de_cuisson;
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
    }
}
