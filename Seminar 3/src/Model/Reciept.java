package Model;

import Utilities.*;

/**
 *
 * @author Rikard
 */
public class Reciept {
        private SaleDTO saleInformation;
        private AmountOfMoney change;
        private AmountOfMoney paidMoney;

    /**
     *
     * @param saleInformation
     * @param change
     * @param paidMoney
     */
    public Reciept(SaleDTO saleInformation, AmountOfMoney change, AmountOfMoney paidMoney) {
        this.saleInformation = saleInformation;
        this.change = change;
        this.paidMoney = paidMoney;
        
        
    }
    
    private String getSoldItems(){
            
        return saleInformation.getSoldItems().toString();
    }
    
    public String toString(){
        StringBuilder buildReciept = new StringBuilder();
        buildReciept.append(getSoldItems());
        
        return buildReciept.toString();
    }

}
