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
        buildReciept.append("\nThank you for shopping here today!\n");
        buildReciept.append(getSoldItems());
        buildReciept.append("\nFinal price: " +saleInformation.getRunningTotal());
        buildReciept.append("\nAmount paid: " +paidMoney);
        buildReciept.append("\nChange: " +change);
        return buildReciept.toString();
    }

}
