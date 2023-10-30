/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

package fr_u_bordeaux_td_designPattern;

import java.util.ArrayList;

/**
 * Interface Gateau permettant de realisé des operation sur l'objet Gateau
 * @author gburgues
 * @author boycos
 */
public interface Gateau_Interface {
    String getName();
    String getRecette();
    int getTempsDeCuisson();
    ArrayList<Ingredients> getIngredients();
    void update();
    void vendre(Patissier patissier);
}
