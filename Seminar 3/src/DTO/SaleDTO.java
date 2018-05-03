package DTO;

import Integration.AmountOfMoney;
import Integration.Item;
import java.util.ArrayList;

public class SaleDTO {

	private final long timeOfSale;

	private final AmountOfMoney runningTotal;

	private final Item lastSoldItem;

	private final ArrayList<Item> soldItems;


    public SaleDTO(long timeOfSale, AmountOfMoney runningTotal, Item lastSoldItem, ArrayList<Item> soldItems) {
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

    public ArrayList<Item> getSoldItems() {
        return soldItems;
    }
    
    public String toString(){
        String saleInfo = "Current total: " + runningTotal.toString() +"\n Last sold Item: " + lastSoldItem.toString();
        return saleInfo;
    }
}
