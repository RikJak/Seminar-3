package Model;

import Integration.TaxRates;

/**
 *
 * @author Rikard
 */
public class Tax {

	private static double currenttaxRates = 1.25;

    /**
     *
     * @param currentTaxRates
     */
    public Tax(TaxRates currentTaxRates) {
		//return null;
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


    public static double getCurrenttaxRates() {
        return currenttaxRates;
    }
}
