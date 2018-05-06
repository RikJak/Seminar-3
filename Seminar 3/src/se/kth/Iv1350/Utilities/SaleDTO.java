package se.kth.IV1350.Utilities;

import se.kth.IV1350.Integration.Item;
import se.kth.IV1350.Model.SoldItems;
import java.util.ArrayList;

/**
 * This DTO contains the current state of the sale.
 * @author Rikard
 */
public class SaleDTO {


	private final AmountOfMoney runningTotal;

	private final Item lastSoldItem;

	private final SoldItems soldItems;

    /**
     * Initializes the DTO.
     * @param runningTotal the current total of the sale.
     * @param lastSoldItem the last scanned item.
     * @param soldItems the class containing all items scanned so far.
     */
    public SaleDTO( AmountOfMoney runningTotal, Item lastSoldItem, SoldItems soldItems) {

        this.runningTotal = runningTotal;
        this.lastSoldItem = lastSoldItem;
        this.soldItems = soldItems;
    }


    /**
     * gets the current total.
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
     * @return all items scanned so far.
     */
    public SoldItems getSoldItems() {
        return soldItems;
    }
    
    public String toString(){
        String saleInfo = "Current total: " + runningTotal.toString() +"\n Last sold Item: " + lastSoldItem.toString() +"\n Price: " + lastSoldItem.getPrice();
        return saleInfo;
    }
}
