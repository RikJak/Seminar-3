package Model;


import Utilities.*;

import Model.SaleInformation;
import Model.Tax;

/**
 * Contains the final price of the transaction.
 * @author Rikard
 */
public class TotalPrice {

	private  AmountOfMoney price;

	private double tax;

    /**
     * Initializes the class.
     * It also adds the current tax rate to the price.
     * @param finalSaleInfo the information of the sale that was finished.
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
     * Changes the price with the amount specified by the provided discount object.
     * @param discount the provided discount.
     */
    public void applyDiscount(Discount discount) {
            price.updateAmount(price.getAmount()*discount.getDiscount());
	}

    /**
     * *Gets the current price.
     * @return
     */
    public AmountOfMoney getPrice() {
		return price;
	}

}
