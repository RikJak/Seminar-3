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
public interface ItemMatcher {
    public Item getItem(Item searchedItem,HashMap<ItemIdentifier,Item> registry) throws ItemNotFoundException;
}
