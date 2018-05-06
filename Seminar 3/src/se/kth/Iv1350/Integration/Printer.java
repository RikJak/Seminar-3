package se.kth.iv1350.Integration;

import se.kth.iv1350.Model.Receipt;

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
    public void printReciept(Receipt recieptOfSale) {
            System.out.println(recieptOfSale);
	}

}
