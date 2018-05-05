package Controller;

import Utilities.*;
import Integration.*;
import Model.*;

public class Controller {

    private Sale sale;

    private RegistryCreator registryCreator;

    private Reciept reciept;

    private DiscountRegistry discount;

    private CashRegister cashRegister;

    private AmountOfMoney startingBalance = new AmountOfMoney(100);

    public void startNewSale() {
        sale = new Sale(cashRegister);
    }

    public Controller(RegistryCreator registers) {
        registryCreator = registers;
        cashRegister = new CashRegister(startingBalance);
    }

    public SaleDTO scanItem(int quantity, int itemID) {
        Item scannedItem = (registryCreator.getItemRegistry()).getItem(itemID);
        return sale.sellItem(quantity, scannedItem);
    }

    public TotalPriceDTO finalizeSale() {
        return sale.finalizeSale();
    }

    public TotalPriceDTO isEligibleForDiscount(int customerID) {
        return sale.getDiscount(registryCreator.getDiscountRegistry().getDiscount(customerID));
    }

    public AmountOfMoney pay(AmountOfMoney paidAmount) {
        AmountOfMoney change = sale.payForSale(paidAmount);
        reciept = new Reciept(sale.getSaleData(), change, paidAmount);

        return change;

    }

}
