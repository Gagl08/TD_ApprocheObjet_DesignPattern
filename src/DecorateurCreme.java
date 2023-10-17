 /*
 * Approche Objet Design Pattern
 * Projet universitaire                         2023/2024
 */

/**
 * Decorateur rajoutant des cremes à un gateau
 * Decorateur global. String cremes ajouter par l'utilisateur pour eviter la redondance de Decorateur
 * @author gburgues
 * @author boycos
 */
public class DecorateurCreme extends Decorateur{
    private final String creme;
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
     * @return name
     */
    public String getName(){
        return super.getName()+" a la "+ creme;
    }
}
