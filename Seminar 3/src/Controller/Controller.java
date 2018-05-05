package Controller;

import Utilities.*;
import Integration.*;
import Model.*;

/**
 *
 * @author Rikard
 */
public class Controller {

    private Sale sale;

    private RegistryCreator registryCreator;

    private Reciept reciept;
    
    private Printer printer;


    private CashRegister cashRegister;

    private AmountOfMoney startingBalance = new AmountOfMoney(100);

    /**
     *
     */
    public void startNewSale() {
        sale = new Sale(cashRegister);
    }

    /**
     *
     * @param registers
     */
    public Controller(RegistryCreator registers,Printer printer) {
        registryCreator = registers;
        this.printer = printer;
        cashRegister = new CashRegister(startingBalance);
    }

    /**
     *
     * @param quantity
     * @param itemID
     * @return
     */
    public SaleDTO scanItem(int quantity, int itemID) {
        Item scannedItem = (registryCreator.getItemRegistry()).getItem(itemID);
        return sale.sellItem(quantity, scannedItem);
    }

    /**
     *
     * @return
     */
    public TotalPriceDTO finalizeSale() {
        return sale.finalizeSale();
    }

    /**
     *
     * @param customerID
     * @return
     */
    public TotalPriceDTO isEligibleForDiscount(int customerID) {
        return sale.getDiscount(registryCreator.getDiscountRegistry().getDiscount(customerID));
    }

    /**
     *
     * @param paidAmount
     * @return
     */
    public AmountOfMoney pay(AmountOfMoney paidAmount) throws InsufficientFundsException{
        AmountOfMoney change = sale.payForSale(paidAmount);
        reciept = new Reciept(sale.getSaleData(), change, paidAmount);
        printer.printReciept(reciept);
        

        return change;

    }
    
    public AmountOfMoney getCashRegisterBalance(){
       return cashRegister.getBalance();
    }

}
