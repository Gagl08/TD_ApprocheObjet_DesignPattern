/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */
package fr_u_bordeaux_td_designPattern.decorateur;

import java.util.ArrayList;
import java.util.List;

import fr_u_bordeaux_td_designPattern.*;
/**
 * Design Pattern code.decorateur.Composite de GateauInterface
 * @author gburgues
 * @author boycos
 */

public class Composite implements Gateau_Interface {
    private final String nom;
    private final List<Gateau_Interface> gateauxComposes;

    public Composite(String nom) {
        this.nom = nom;
        this.gateauxComposes = new ArrayList<>();
    }

    public void addGateau(Gateau_Interface gateau) {
        gateauxComposes.add(gateau);
    }

    public void removeGateau(Gateau_Interface gateau) {
        gateauxComposes.remove(gateau);
    }

    @Override
    public String getName() {
        StringBuilder nomComposite = new StringBuilder(nom);
        for (Gateau_Interface gateau : gateauxComposes) {
            nomComposite.append(" avec des ").append(gateau.getName());
        }
        return nomComposite.toString();
    }

    @Override
    public String getRecette() {
        // Vous pouvez implémenter la recette du gâteau composite ici
        return "Recette du gâteau composite";
    }

    @Override
    public int getTempsDeCuisson() {
        int tempsTotal = 0;
        for (Gateau_Interface gateau : gateauxComposes) {
            tempsTotal += gateau.getTempsDeCuisson();
        }
        return tempsTotal;
    }

    @Override
    public ArrayList<Ingredients> getIngredients() {
        return null;
    }
}