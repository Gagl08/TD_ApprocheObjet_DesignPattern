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

    /**
     * Constructeur Composite
     * @param nom du composite de gateau
     */
    public Composite(String nom) {
        this.nom = nom;
        this.gateauxComposes = new ArrayList<>();
    }

    /**
     * Ajoute un gateaux au composite
     * @param gateau à ajouter
     */
    public void addGateau(Gateau_Interface gateau) {
        gateauxComposes.add(gateau);
    }

    /**
     * Suppresseur du gateau passé en param
     * @param gateau a supprimer
     */
    public void removeGateau(Gateau_Interface gateau) {
        gateauxComposes.remove(gateau);
    }

    /**
     * Getteur du nom d'un gateau
     * @return nom du gateau
     */
    @Override
    public String getName() {
        StringBuilder nomComposite = new StringBuilder(nom);
        for (Gateau_Interface gateau : gateauxComposes) {
            nomComposite.append(" avec des ").append(gateau.getName());
        }
        return nomComposite.toString();
    }

    /**
     * Getteur de la recette d'un Gateau
     * @return la recette d'un gateau
     */
    @Override
    public String getRecette() {
        // Vous pouvez implémenter la recette du gâteau composite ici
        return "Recette du gâteau composite";
    }

    /**
     * Getteur du temps de cuisson d'un gateau
     * @return temps de cuisson
     */
    @Override
    public int getTempsDeCuisson() {
        int tempsTotal = 0;
        for (Gateau_Interface gateau : gateauxComposes) {
            tempsTotal += gateau.getTempsDeCuisson();
        }
        return tempsTotal;
    }

    /**
     * Getteur Des Ingredients d'un gateau
     * @return Liste des ingredients
     */
    @Override
    public ArrayList<Ingredients> getIngredients() {
        return null;
    }

    @Override
    public void update() {
    }

    @Override
    public void vendre(Patissier patissier) {
    }
}