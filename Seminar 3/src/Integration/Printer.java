package Integration;

import Model.Reciept;

/**
 *This class represents an external printer that prints the physical reciept.
 * @author Rikard
 */
public class Printer {

    /**
     *Sets up the Printer class.
     * 
     */
    public Printer() {
		
	}

    /**
     *Prints out the recieved reciept to the console.
     * @param recieptOfSale is the reciept of the recently finished sale.
     */
    public void printReciept(Reciept recieptOfSale) {
            System.out.println(recieptOfSale);
	}

}
