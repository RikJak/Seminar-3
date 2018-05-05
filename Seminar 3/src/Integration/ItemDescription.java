package Integration;

/**
 *
 * @author Rikard
 */
public class ItemDescription {

	private String itemDescription;

	//private int price;

    /**
     *
     * @param description
     */
        
        public ItemDescription(String description){
            itemDescription = description;
        }
        
        public String toString(){
            return itemDescription;
        }
}
