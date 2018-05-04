package Controller;

import DTO.SaleDTO;
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
		Item scannedItem = (registryCreator.getItemRegistry()).getItem(itemID);
                //System.out.println(scannedItem);
            return sale.sellItem(quantity,scannedItem);
	}

	public TotalPrice finalizeSale() {
		return sale.finalizeSale();
	}

	public TotalPrice isEligibleForDiscount(int customerID) {
		return null;
	}

	public AmountOfMoney pay(AmountOfMoney paidAmount) {
		return sale.payForSale(paidAmount);
	}

}
