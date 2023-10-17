/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Design Pattern Composite de GateauInterface
 * @author gburgues
 * @author boycos
 */

public class Composite implements Gateau_Interface {
    private String nom;
    private List<Gateau_Interface> gâteauxComposes;

    public Composite(String nom) {
        this.nom = nom;
        this.gâteauxComposes = new ArrayList<>();
    }

    public void addGateau(Gateau_Interface gateau) {
        gâteauxComposes.add(gateau);
    }

    public void removeGateau(Gateau_Interface gateau) {
        gâteauxComposes.remove(gateau);
    }

    @Override
    public String getName() {
        StringBuilder nomComposite = new StringBuilder(nom);
        for (Gateau_Interface gateau : gâteauxComposes) {
            nomComposite.append(" avec ").append(gateau.getName());
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
        for (Gateau_Interface gateau : gâteauxComposes) {
            tempsTotal += gateau.getTempsDeCuisson();
        }
        return tempsTotal;
    }
}