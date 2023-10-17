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
public class DecorateurFruit extends Decorateur{
    private final String fruit;
    /**
     * Constructeur du decorateur de Gateaux
     *
     * @param gateaux_decore a rajouter un Decorateur
     */
    public DecorateurFruit(Gateau_Interface gateaux_decore, String fruit) {
        super(gateaux_decore);
        this.fruit = fruit;
    }

    /**
     * Getteur du gateau decorer de ces fruits
     * @return name
     */
    public String getName(){
        return super.getName()+" aux "+ fruit;
    }
}
