/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;

/**
 *
 * @author Rikard
 */
public class ItemIdentifier {

    int itemID;

    public ItemIdentifier(int id) {
        itemID = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ItemIdentifier) {
            ItemIdentifier compID = (ItemIdentifier) o;
            return itemID == compID.getItemID();
        }
        return false;
    }

    @Override
    public int hashCode() {

        return itemID;
    }

    public int getItemID() {
        return itemID;
    }

}
