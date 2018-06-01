package se.kth.iv1350.integration;

/**
 *This class describes the Item
 * @author Rikard
 */
public class ItemDescription {

	private String itemDescription;

	//private int price;

    /**
     * Constructor for the item.
     * @param description what the item is.
     */
        
        public ItemDescription(String description){
            itemDescription = description;
        }
        
        public String toString(){
            return itemDescription;
        }
            /**
     * Checks if an object is equal to this.
     * @param o the object to be checked.
     * @return result of comparison.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof ItemDescription) {
            ItemDescription compID = (ItemDescription) o;
            return itemDescription.equals(compID.itemDescription);
        }
        return false;
    }
}
