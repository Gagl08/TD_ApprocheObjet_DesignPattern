/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Objet dcrivant un gateau
 * @author gburgues
 * @author boycos
 */
public class Gateaux implements Gateau_Interface{

    private String nom;
    private String recette;
    private int temps_de_cuisson;
    private Ingredients ingredients;

    /**
     * constructeur de l'objet gateau
     * @param nom du gateau
     * @param recette de l objet gateau
     * @param temps_de_cuisson en min du gateau
     */
    public Gateaux (String nom, String recette, int temps_de_cuisson ){
        this.nom= nom;
        this.recette=recette;
        this.temps_de_cuisson=temps_de_cuisson;
    }

    /**
     * getteur Name
     * @return nom du gateau
     */
    @Override
    public String getName() {
        return nom;
    }

    /**
     * getteur Recatte
     * @return Recette du gateau
     */
    @Override
    public String getRecette() {
        return recette;
    }

    /**
     * getteur TempsDeCuisson
     * @return Temps_de_cuisson du gateau
     */
    @Override
    public int getTempsDeCuisson() {
        return temps_de_cuisson;
    }
}
