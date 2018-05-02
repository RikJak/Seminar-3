package Controller;

import Integration.*;
import Model.*;

public class Controller {

	private Sale sale;

	private RegistryCreator registryCreator;

	private Reciept reciept;

	private Discount discount;
        
        private CashRegister cashRegister;
        
        private AmountOfMoney startingBalance = new AmountOfMoney(100);

	public void startNewSale() {
            sale = new Sale(cashRegister);
	}

	public Controller(RegistryCreator registers) {
                registryCreator  = registers;
                cashRegister = new CashRegister(startingBalance);
	}

	public SaleDTO scanItem(int quantity, int itemID) {
		Item scannedItem = registryCreator.getItemRegistry().getItem(itemID);
                
            return sale.sellItem(scannedItem);
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
