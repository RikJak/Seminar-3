
package se.kth.iv1350.integration;

/**
 * This exception is thrown when the searched item does not exist in the database.
 * @author Rikard
 */
public class ItemNotFoundException extends Exception {
    ItemIdentifier itemID;
    /**
     * Creates a new instance of <code>ItemNotFoundException</code> without
     * detail message.
     * @param itemID
     */
    public ItemNotFoundException(ItemIdentifier itemID) {
        super("The requested item does not exist in the registry. ItemID: "+ itemID.getItemID());
        this.itemID = itemID; 
    }
        /**
     * Creates a new instance of <code>ItemNotFoundException</code> without
     * detail message.
     * @param itemID
     */
    public ItemNotFoundException(Item item) {
        super("The requested item does not exist in the registry. You searched for: "+ item);
        this.itemID = itemID; 
    }
    /**
     * Gets the itemID that could not be found;
     * @return itemID
     */
    public int getItemID() {
        return itemID.getItemID();
    }

    /**
     * Constructs an instance of <code>ItemNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ItemNotFoundException(String msg) {
        super(msg);
    }
}
