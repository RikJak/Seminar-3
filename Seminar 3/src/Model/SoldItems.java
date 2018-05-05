/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Integration.Item;
import Integration.ItemIdentifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Rikard
 */
public class SoldItems {
    private HashMap<Item,Integer> soldItems;

    public SoldItems() {
        soldItems = new HashMap<>();
    }
    
    public void add(Item lastScannedItem){
        Item ID = lastScannedItem;
        if(soldItems.containsKey(ID)){
            soldItems.put(ID, soldItems.get(ID) + 1);
        }else{
            soldItems.put(ID, 1);
        }
    }
    
    public String toString(){
        StringBuilder buildListOfSoldItems = new StringBuilder();
        Iterator iteratorForSoldItems = soldItems.entrySet().iterator();
        while(iteratorForSoldItems.hasNext()){
            
        }

    }
    
    
}
