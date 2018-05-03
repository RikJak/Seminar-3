package Model;

import Integration.TaxRates;
import Integration.AmountOfMoney;
import Integration.Discount;

public class TotalPrice extends TaxRates {

	private AmountOfMoney price;

	private TaxRates tax;

	public TotalPrice(SaleInformation finalSaleInfo) {
		price = finalSaleInfo.getRunningTotal();
	}

	private void addTax(SaleInformation finalSaleInfo) {

	}

	public void applyDiscount(Discount discount) {

	}

	public AmountOfMoney getPrice() {
		return null;
	}

}
