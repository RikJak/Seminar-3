package Utilities;

import Integration.Item;
import Model.SoldItems;
import java.util.ArrayList;

public class SaleDTO {

	private final long timeOfSale;

	private final AmountOfMoney runningTotal;

	private final Item lastSoldItem;

	private final SoldItems soldItems;


    public SaleDTO(long timeOfSale, AmountOfMoney runningTotal, Item lastSoldItem, SoldItems soldItems) {
        this.timeOfSale = timeOfSale;
        this.runningTotal = runningTotal;
        this.lastSoldItem = lastSoldItem;
        this.soldItems = soldItems;
    }

    public long getTimeOfSale() {
        return timeOfSale;
    }

    public AmountOfMoney getRunningTotal() {
        return runningTotal;
    }

    public Item getLastSoldItem() {
        return lastSoldItem;
    }

    public SoldItems getSoldItems() {
        return soldItems;
    }
    
    public String toString(){
        String saleInfo = "Current total: " + runningTotal.toString() +"\n Last sold Item: " + lastSoldItem.toString() +"\n Price: " + lastSoldItem.getPrice();
        return saleInfo;
    }
}
