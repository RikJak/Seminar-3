/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.integration;

import java.util.HashMap;

/**
 *
 * @author Rikard
 */
public class ItemIDMatcher implements ItemMatcher{

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
