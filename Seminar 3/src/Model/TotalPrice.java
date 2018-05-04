package Model;

import Integration.TaxRates;
import Integration.AmountOfMoney;
import Integration.Discount;

public class TotalPrice extends TaxRates {

	private AmountOfMoney price;

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
