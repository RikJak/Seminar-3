package Integration;

public class Item {

	private int itemID;

	private ItemDescription itemDescription;

	private boolean isValidItem;

	private AmountOfMoney price;

	private String itemCategory;


	public Item(int itemID,ItemDescription description,AmountOfMoney cost,String category) {
            this.itemID = itemID;
            this.itemDescription = description;
            price = cost;
            itemCategory = category;
	}

    public int getItemID() {
        return itemID;
    }

    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    public boolean isIsValidItem() {
        return isValidItem;
    }

    public AmountOfMoney getPrice() {
        return price;
    }
        

    public String getItemCategory() {
        return itemCategory;
    }
    public String toString(){
        return ItemDescription.to
    }

}
