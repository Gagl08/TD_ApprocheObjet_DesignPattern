/*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Decorateur rajoutant des fruit à un gateau
 * @author gburgues
 * @author boycos
 */
public class DecorateurFruit extends Decorateur{
    private String fruit;
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
     * @return
     */
    public String getName(){
        return super.getName()+" aux "+ fruit;
    }
}
