package Integration;

import Utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class Item {

	private ItemIdentifier itemID;

	private ItemDescription itemDescription;

	private boolean isValidItem;

	private AmountOfMoney price;

	private String itemCategory;

    /**
     *
     * @param itemID
     * @param description
     * @param cost
     * @param category
     */
    public Item(int itemID,ItemDescription description,AmountOfMoney cost,String category) {
            this.itemID = new ItemIdentifier(itemID);
            this.itemDescription = description;
            price = cost;
            itemCategory = category;
	}

    /**
     *
     * @return
     */
    public ItemIdentifier getItemID() {
        return itemID;
    }

    /**
     *
     * @return
     */
    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    /**
     *
     * @return
     */
    public boolean isIsValidItem() {
        return isValidItem;
    }

    /**
     *
     * @return
     */
    public AmountOfMoney getPrice() {
        return price;
    }
        
    /**
     *
     * @return
     */
    public String getItemCategory() {
        return itemCategory;
    }
    public String toString(){
        return itemDescription.toString();
    }

}
