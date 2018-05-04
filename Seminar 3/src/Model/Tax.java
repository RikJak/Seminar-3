package Model;

import Integration.TaxRates;

public class Tax {

	private static double currenttaxRates = 1.25;

	public Tax(TaxRates currentTaxRates) {
		//return null;
	}
        
        
/*      
        
	public SaleInformation addTax(SaleInformation saleInfo) {
		return null;
	}
*/

    public static double getCurrenttaxRates() {
        return currenttaxRates;
    }
}
