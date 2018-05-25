/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.integration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Rikard
 */
public class ItemDescriptionMatcher implements ItemMatcher{

    @Override
    public Item getItem(Item searchedItem, HashMap<ItemIdentifier, Item> registry) throws ItemNotFoundException {
        ItemIdentifier ID= null;
        Iterator<ItemIdentifier> iteratorForItems = registry.keySet().iterator();
        while(iteratorForItems.hasNext()){
            ID = iteratorForItems.next();
            if(searchedItem.getItemDescription().equals(registry.get(ID))){
                return registry.get(ID);
            }
            
            
        }
        throw new ItemNotFoundException(searchedItem.getItemID());
    }
    
}
