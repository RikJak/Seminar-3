package Model;


import Utilities.*;

import Model.SaleInformation;
import Model.Tax;

public class TotalPrice {

	private  AmountOfMoney price;

	private double tax;

	public TotalPrice(SaleInformation finalSaleInfo) {
		price = finalSaleInfo.getRunningTotal();
                tax = Tax.getCurrenttaxRates();
                addTax();
	}

	private void addTax() {
            price.updateAmount(price.getAmount()*tax);
	}

	public void applyDiscount(Discount discount) {
            price.updateAmount(price.getAmount()*discount.getDiscount());
	}

	public AmountOfMoney getPrice() {
		return price;
	}

}
