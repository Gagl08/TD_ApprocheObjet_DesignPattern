package fr_u_bordeaux_td_designPattern;/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

import java.util.ArrayList;

/**
 * Classe abstraite pour creer un dessert
 * @author gburgues
 * @author boycos
 */

public abstract class GateauBuilder {
    protected String nom;
    protected String recette;
    protected int temps_de_cuisson;
    protected ArrayList<Ingredients> liste_ingredient;

    public abstract GateauBuilder withNom(String nom);
    public abstract GateauBuilder withRecette(String recette);
    public abstract GateauBuilder withTempsDeCuisson(int temps_de_cuisson);
    public abstract GateauBuilder withListe_ingredient(ArrayList<Ingredients> ingredients);

    public abstract Gateau_Interface build();
}