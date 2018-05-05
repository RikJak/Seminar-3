package Model;


import Utilities.*;

import Model.SaleInformation;
import Model.Tax;

/**
 *
 * @author Rikard
 */
public class TotalPrice {

	private  AmountOfMoney price;

	private double tax;

    /**
     *
     * @param finalSaleInfo
     */
    public TotalPrice(SaleInformation finalSaleInfo) {
		price = finalSaleInfo.getRunningTotal();
                tax = Tax.getCurrenttaxRates();
                addTax();
	}

	private void addTax() {
            price.updateAmount(price.getAmount()*tax);
	}

    /**
     *
     * @param discount
     */
    public void applyDiscount(Discount discount) {
            price.updateAmount(price.getAmount()*discount.getDiscount());
	}

    /**
     *
     * @return
     */
    public AmountOfMoney getPrice() {
		return price;
	}

}
