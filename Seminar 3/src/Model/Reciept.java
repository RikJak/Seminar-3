package Model;

import Utilities.*;
public class Reciept {
        private SaleDTO saleInformation;
        private AmountOfMoney change;
        private AmountOfMoney paidMoney;

    public Reciept(SaleDTO saleInformation, AmountOfMoney change, AmountOfMoney paidMoney) {
        this.saleInformation = saleInformation;
        this.change = change;
        this.paidMoney = paidMoney;
        
        
    }
    
    private String getSoldItems(){
        StringBuilder buildListOfItems = new StringBuilder();
        saleInformation.getSoldItems();
        return buildListOfItems.toString();
    }
    
    public String toString(){
        StringBuilder buildReciept = new StringBuilder();
        buildReciept.append(getSoldItems());
    }

}
