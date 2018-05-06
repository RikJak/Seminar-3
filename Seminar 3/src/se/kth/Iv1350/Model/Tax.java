package se.kth.iv1350.Model;

import se.kth.iv1350.Integration.TaxRates;

/**
 *
 * @author Rikard
 */
public class Tax {

	private double currenttaxRates = 1.25;

    /**
     * The current taxRate
     * @param currentTaxRates
     */
    public Tax() {
        
	}
        
        
/*      
        
	public SaleInformation addTax(SaleInformation saleInfo) {
		return null;
	}
*/

    /**
     *
     * @return
     */


    public double getCurrenttaxRates() {
        return currenttaxRates;
    }
}
