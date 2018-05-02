package Controller;

import Model.Sale;
import Integration.RegistryCreator;
import Model.Reciept;
import Integration.Discount;
import Model.SaleDTO;
import Model.TotalPrice;
import Integration.AmountOfMoney;

public class Controller {

	private Sale sale;

	private RegistryCreator registryCreator;

	private Reciept reciept;

	private Discount discount;

	public void startNewSale() {

	}

	public Controller Controller(RegistryCreator registers) {
		return null;
	}

	public SaleDTO scanItem(int quantity, int itemID) {
		return null;
	}

	public TotalPrice finalizeSale() {
		return null;
	}

	public TotalPrice isEligibleForDiscount(int customerID) {
		return null;
	}

	public AmountOfMoney pay(AmountOfMoney paidAmount) {
		return null;
	}

}
