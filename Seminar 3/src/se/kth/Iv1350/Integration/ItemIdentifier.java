
package se.kth.IV1350.Integration;

/**
 * This identifies an Item and is used to compare if they are the same.
 * @author Rikard
 */
public class ItemIdentifier {

    int itemID;

    /**
     * Constructs the ItemIdentifier.
     * @param id the identifier for this item.
     */
    public ItemIdentifier(int id) {
        itemID = id;
    }

    /**
     * {@inheritDoc}
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof ItemIdentifier) {
            ItemIdentifier compID = (ItemIdentifier) o;
            return itemID == compID.getItemID();
        }
        return false;
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public int hashCode() {
        return getItemID();
    }

    /**
     * Returns the ItemID as an integer.
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

}
