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
    public SaleInformation() {
       
        runningTotal = new AmountOfMoney(0);
        soldItems = new SoldItems();
    }
    
    /**
     *
     * @return
     */
    public SaleDTO getSaleInformation(){
        return new SaleDTO(runningTotal,lastSoldItem,soldItems);
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


}
