/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Decorateur rajoutant des fruit à un gateau
 * Decorateur global. String fruit ajouter par l'utilisateur pour eviter la redondance de Decorateur
 * @author gburgues
 * @author boycos
 */
public class DecorateurMeringue extends Decorateur{
    /**
     * Constructeur du decorateur de Gateaux
     *
     * @param gateaux_decore a rajouter un Decorateur
     */
    public DecorateurMeringue(Gateau_Interface gateaux_decore) {
        super(gateaux_decore);
    }

    /**
     * Getteur du gateau decorer de ces fruits
     * @return name
     */
    public String getName(){
        return super.getName()+" meringué";
    }
}

