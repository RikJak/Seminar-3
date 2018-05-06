package se.kth.iv1350.Controller;

import se.kth.iv1350.Utilities.TotalPriceDTO;
import se.kth.iv1350.Utilities.SaleDTO;
import se.kth.iv1350.Utilities.AmountOfMoney;
import se.kth.iv1350.Model.CashRegister;
import se.kth.iv1350.Model.Receipt;
import se.kth.iv1350.Model.Sale;
import se.kth.iv1350.Model.InsufficientFundsException;
import se.kth.iv1350.Integration.Printer;
import se.kth.iv1350.Integration.Item;
import se.kth.iv1350.Integration.RegistryCreator;
import se.kth.iv1350.Integration.ItemNotFoundException;

/**
 * This class handles the interaction between the 'user' and the program itself. It delegates calls from the view to the correct place.
 * @author Rikard
 */
public class Controller {

    private Sale sale;

    private RegistryCreator registryCreator;

    private Receipt reciept;
    
    private Printer printer;


    private CashRegister cashRegister;

    private AmountOfMoney startingBalance = new AmountOfMoney(100);

    /**
     *Initiates a new sale.
     */
    public void startNewSale() {
        sale = new Sale(cashRegister);
    }

    /**
     *Creates the controller and assigns values to the fields.
     * @param registers is used to get access to the faux data base that is used within this program.
     * @param printer is used to get access to the 'printer' used by this POS.
     */
    public Controller(RegistryCreator registers,Printer printer) {
        registryCreator = registers;
        this.printer = printer;
        cashRegister = new CashRegister(startingBalance);
    }

    /**
     * This method retrieves an Item object from the itemRegistry.
     * This is then passed along to the sale class together with how many of this item are to be added to the current transaction.
     * @param quantity how many of this Item have been added.
     * @param itemID the ID of the scanned item. Used to get the Item from the registry.
     * @return the DTO containing the current state of the sale.
     * @throws se.kth.iv1350.Integration.ItemNotFoundException
     */
    public SaleDTO scanItem(int quantity, int itemID) throws ItemNotFoundException{
        Item scannedItem = (registryCreator.getItemRegistry()).getItem(itemID);
        return sale.sellItem(quantity, scannedItem);
    }
    /**
     * An alternative version of the method above.
     * It is used if no quantity is used.
     * @param itemID the item to be added.
     * @return the DTO containing the current state of the sale.
     * @throws se.kth.iv1350.Integration.ItemNotFoundException
     */
     public SaleDTO scanItem( int itemID)throws ItemNotFoundException {

        return scanItem(1, itemID);
    }

    /**
     *This method finalizes the current transaction.
     * @return DTO containing the final price.
     */
    public TotalPriceDTO finalizeSale() {
        return sale.finalizeSale();
    }

    /**
     * Used to find the discount associated with the customer ID and then applying it to the price to be paid.
     *
     * @param customerID used to check if the customer is eligible for a discount.
     * @return DTO containing the new total.
     */
    public TotalPriceDTO isEligibleForDiscount(int customerID) {
        return sale.getDiscount(registryCreator.getDiscountRegistry().getDiscount(customerID));
    }

    /**
     * This method sends the payment to the sale.
     * It uses the final sale information to generate a receipt which is then printed.
     * It also updates the external systems.
     * @param paidAmount the amount of money the customer has paid.
     * @return the change remaining after paying.
     * @throws se.kth.iv1350.Model.InsufficientFundsException 
     */
    public AmountOfMoney pay(AmountOfMoney paidAmount) throws InsufficientFundsException{
        AmountOfMoney change = sale.payForSale(paidAmount);
        SaleDTO finalSaleInformation = sale.getSaleData();
        reciept = new Receipt(finalSaleInformation, change, paidAmount);
        registryCreator.getExternalSystems().updateAccountingSystem(finalSaleInformation);
        registryCreator.getExternalSystems().updateInventorySystem(finalSaleInformation);
        printer.printReciept(reciept);
        

        return change;

    }
    
    /**
     *This method shows how much money is in the cash register.
     * @return the current balance in the cash register.
     */
    public AmountOfMoney getCashRegisterBalance(){
       return cashRegister.getBalance();
    }

}
