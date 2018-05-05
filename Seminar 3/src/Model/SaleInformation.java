package Model;

import Utilities.*;
import Integration.Item;
import Integration.ItemIdentifier;
import java.util.*;

public class SaleInformation {

    private AmountOfMoney runningTotal;

    private SoldItems soldItems;

    private Item lastSoldItem;

    private Long timeOfSale;

    public TotalPrice getFinalAmount() {
        return new TotalPrice(this);
    }

    public SaleDTO updateSale(Item saleUpdate) {
        
        runningTotal.add(saleUpdate.getPrice());
        soldItems.add(saleUpdate);
        lastSoldItem = saleUpdate;
        return getSaleInformation();
    }

    public SaleInformation(long timeOfSale) {
        this.timeOfSale = timeOfSale;
        runningTotal = new AmountOfMoney(0);
        soldItems = new SoldItems();
    }
    
    public SaleDTO getSaleInformation(){
        return new SaleDTO(timeOfSale,runningTotal,lastSoldItem,soldItems);
    }

    public AmountOfMoney getRunningTotal() {
        return runningTotal;
    }

    public ArrayList<Item> getSoldItems() {
        return soldItems;
    }

    public Item getLastSoldItem() {
        return lastSoldItem;
    }

    public long getTimeOfSale() {
        return timeOfSale;
    }

    public void setRunningTotal(AmountOfMoney runningTotal) {
        this.runningTotal = runningTotal;
    }

    public void setSoldItems(ArrayList<Item> soldItems) {
        this.soldItems = soldItems;
    }

    public void setLastSoldItem(Item lastSoldItem) {
        this.lastSoldItem = lastSoldItem;
    }

    public void setTimeOfSale(long timeOfSale) {
        this.timeOfSale = timeOfSale;
    }

}
