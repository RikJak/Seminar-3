package Utilities;

import Integration.Item;
import Model.SoldItems;
import java.util.ArrayList;

/**
 *
 * @author Rikard
 */
public class SaleDTO {


	private final AmountOfMoney runningTotal;

	private final Item lastSoldItem;

	private final SoldItems soldItems;

    /**
     *
     * @param timeOfSale
     * @param runningTotal
     * @param lastSoldItem
     * @param soldItems
     */
    public SaleDTO( AmountOfMoney runningTotal, Item lastSoldItem, SoldItems soldItems) {

        this.runningTotal = runningTotal;
        this.lastSoldItem = lastSoldItem;
        this.soldItems = soldItems;
    }

    /**
     *
     * @return
     */


    /**
     *
     * @return the current amount of money
     */
    public AmountOfMoney getRunningTotal() {
        return runningTotal;
    }

    /**
     *
     * @return the last item scanned.
     */
    public Item getLastSoldItem() {
        return lastSoldItem;
    }

    /**
     *
     * @return
     */
    public SoldItems getSoldItems() {
        return soldItems;
    }
    
    public String toString(){
        String saleInfo = "Current total: " + runningTotal.toString() +"\n Last sold Item: " + lastSoldItem.toString() +"\n Price: " + lastSoldItem.getPrice();
        return saleInfo;
    }
}
