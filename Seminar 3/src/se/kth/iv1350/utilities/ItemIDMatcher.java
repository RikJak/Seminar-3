
package se.kth.iv1350.utilities;

import java.util.HashMap;
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.ItemIdentifier;
import se.kth.iv1350.integration.ItemMatcher;
import se.kth.iv1350.integration.ItemNotFoundException;

/**
 * Returns the item with an ItemIdentifier identical to the one we are searching for.
 * @author Rikard
 */
public class ItemIDMatcher implements ItemMatcher{

    /**
     * This method takes an item and finds the item in the registry that has the same ItemIdentification
     * @param searchedItem the item we are searching for.
     * @param registry the registry containing all items.
     * @return the found Item.
     * @throws ItemNotFoundException is thrown if there is no Item matching the one we are looking for.
     */
    @Override
    public Item getItem(Item searchedItem, HashMap<ItemIdentifier, Item> itemRegistry) throws ItemNotFoundException{
        ItemIdentifier ID = searchedItem.getItemID();
        if (itemRegistry.containsKey(ID)) {
            return itemRegistry.get(ID);
        } else {
            throw new ItemNotFoundException(ID);
        }
    }
    
    
}
