package Integration;
import java.util.*;
import Utilities.*;
/*


*/
public class DiscountRegistry {

	private HashMap<Integer,Double> elligibleID;


	public Discount getDiscount(int customerID) {
                Integer ID = new Integer(customerID);
		if(elligibleID.containsKey(ID)){
                    //System.out.println("Integration.DiscountRegistry.getDiscount()");
                    //System.out.println(elligibleID.get(ID));
                    return new Discount(elligibleID.get(ID));
                }else{
                    return new Discount(1);
                }
	}

	public DiscountRegistry() {
            elligibleID = new HashMap<Integer, Double>();
           elligibleID.put(new Integer(19931128), 0.1);
           elligibleID.put(new Integer(19980523), 0.5);
           elligibleID.put(new Integer(19960709), 0.85);
           elligibleID.put(new Integer(19940613), 0.99);
           elligibleID.put(new Integer(19911121), 1.11);

	}

}
