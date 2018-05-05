package Model;

import Utilities.*;
import Integration.Item;
import Integration.ItemIdentifier;
import java.util.*;

/**
 *
 * @author Rikard
 */
public class SaleInformation {

    private AmountOfMoney runningTotal;

    private SoldItems soldItems;

    private Item lastSoldItem;

    private Long timeOfSale;

    /**
     *
     * @return
     */
    public TotalPrice getFinalAmount() {
        return new TotalPrice(this);
    }

    /**
     *
     * @param saleUpdate
     * @return
     */
    public SaleDTO updateSale(Item saleUpdate) {
        
        runningTotal.add(saleUpdate.getPrice());
        soldItems.add(saleUpdate);
        lastSoldItem = saleUpdate;
        return getSaleInformation();
    }

    /**
     *
     * @param timeOfSale
     */
    public SaleInformation(long timeOfSale) {
        this.timeOfSale = timeOfSale;
        runningTotal = new AmountOfMoney(0);
        soldItems = new SoldItems();
    }
    
    /**
     *
     * @return
     */
    public SaleDTO getSaleInformation(){
        return new SaleDTO(timeOfSale,runningTotal,lastSoldItem,soldItems);
    }

    /**
     *
     * @return
     */
    public AmountOfMoney getRunningTotal() {
        return runningTotal;
    }

    /**
     *
     * @return
     */
    public SoldItems getSoldItems() {
        return soldItems;
    }

    /**
     *
     * @return
     */
    public Item getLastSoldItem() {
        return lastSoldItem;
    }

    /**
     *
     * @return
     */
    public long getTimeOfSale() {
        return timeOfSale;
    }

    /**
     *
     * @param runningTotal
     */
    public void setRunningTotal(AmountOfMoney runningTotal) {
        this.runningTotal = runningTotal;
    }
    
    /**
     *
     * @param lastSoldItem
     */
    public void setLastSoldItem(Item lastSoldItem) {
        this.lastSoldItem = lastSoldItem;
    }

    /**
     *
     * @param timeOfSale
     */
    public void setTimeOfSale(long timeOfSale) {
        this.timeOfSale = timeOfSale;
    }

}
