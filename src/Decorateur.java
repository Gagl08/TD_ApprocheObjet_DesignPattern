/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

import java.util.ArrayList;

/**
 *
 * @author gburgues
 * @author boycos
 */
public class Decorateur implements Gateau_Interface {
    private final Gateau_Interface gateaux_decore;

    /**
     * Constructeur du decorateur de Gateaux
     * @param gateaux_decore a rajouter un Decorateur
     */
    public Decorateur(Gateau_Interface gateaux_decore){
        this.gateaux_decore = gateaux_decore;
    }
    /**
     * getteur Name
     * @return nom du gateau
     */
    @Override
    public String getName() {
        return gateaux_decore.getName();
    }

    /**
     * getteur Recatte
     * @return Recette du gateau
     */
    @Override
    public String getRecette() {
        return gateaux_decore.getRecette();
    }

    /**
     * getteur TempsDeCuisson
     * @return Temps_de_cuisson du gateau
     */
    @Override
    public int getTempsDeCuisson() {
        return gateaux_decore.getTempsDeCuisson();
    }
}
