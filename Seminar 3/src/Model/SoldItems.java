package Model;

import Integration.Item;
import Integration.ItemIdentifier;
import java.util.*;


/**
 *
 * @author Rikard
 */
public class SoldItems {
    private HashMap<Item,Integer> soldItems;

    /**
     *
     */
    public SoldItems() {
        soldItems = new HashMap<>();
    }
    
    /**
     *
     * @param lastScannedItem
     */
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
            Map.Entry pair = (Map.Entry) iteratorForSoldItems.next();
            buildListOfSoldItems.append(pair.getKey() + " x" + pair.getValue()+"\n");
        }
        return buildListOfSoldItems.toString();
    }

    
}
