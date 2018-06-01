package se.kth.iv1350.utilities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.ItemDescription;
import se.kth.iv1350.integration.ItemIdentifier;
import se.kth.iv1350.integration.ItemMatcher;
import se.kth.iv1350.integration.ItemNotFoundException;

/**
 * This matcher searches for Items with a description matching the one we are searching for.
 * @author Rikard
 */
public class ItemDescriptionMatcher implements ItemMatcher{
    
    /**
     * This method takes an item and finds the item in the registry that has the same ItemDescription
     * @param searchedItem the item we are searching for.
     * @param registry the registry containing all items.
     * @return the found Item.
     * @throws ItemNotFoundException is thrown if there is no Item matching the one we are looking for.
     */
    @Override
    public Item getItem(Item searchedItem, HashMap<ItemIdentifier, Item> registry) throws ItemNotFoundException {
        ItemIdentifier ID;
        ItemDescription description;
        Iterator<ItemIdentifier> iteratorForItems = registry.keySet().iterator();
        while(iteratorForItems.hasNext()){
            ID = iteratorForItems.next();
            description = registry.get(ID).getItemDescription();
            if(searchedItem.getItemDescription().equals(description)){
                return registry.get(ID);
            }
            
            
        }
        throw new ItemNotFoundException(searchedItem.getItemID());
    }
    
}
