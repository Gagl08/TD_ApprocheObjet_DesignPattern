 /*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Decorateur rajoutant des fruit à un gateau
 * @author gburgues
 * @author boycos
 */
public class DecorateurCreme extends Decorateur{
    private String creme;
    /**
     * Constructeur du decorateur de Gateaux
     *
     * @param gateaux_decore a rajouter un Decorateur
     */
    public DecorateurCreme(Gateau_Interface gateaux_decore,String creme) {
        super(gateaux_decore);
        this.creme=creme;
    }

    /**
     * Getteur du gateau decorer de ces fruits
     * @return
     */
    public String getName(){
        return super.getName()+" a la "+ creme;
    }
}
