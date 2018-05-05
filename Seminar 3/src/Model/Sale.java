package Model;

import Integration.Item;

import Integration.DiscountRegistry;
import Utilities.*;

/**
 * This is the central class of the program. 
 * Each instance handles one transaction.
 * @author Rikard
 */
public class Sale {

    private Item scannedItems;

    private SaleInformation currentSaleInfo;

    private TotalPrice totalPrice;

    private SaleInformation saleInformation;

    private CashRegister cashRegister;

    private boolean ongoingSale;

    /**
     * Initializes a new sale.
     * @param cashRegister the cash register in the store. 
     *
     */
    public Sale(CashRegister cashRegister) {
        saleInformation = new SaleInformation();
        this.cashRegister = cashRegister;
        totalPrice = new TotalPrice(saleInformation);
        ongoingSale = true;
    }

    /**
     * This ends the current transaction.
     * It sets the ongoingSale variable to false to prevent adding more items to it.
     * @return the final price of the transaction.
     */
    public TotalPriceDTO finalizeSale() {
        totalPrice = new TotalPrice(saleInformation);
        ongoingSale = false;
        return new TotalPriceDTO(totalPrice);
    }

    /**
     * Adds an item to the transaction. 
     * The quantity determines how many of the item are to be added.
     * @param quantity how many of the item are to be added.
     * @param item the item to be added.
     * @return a DTO containing the current state of the transaction. 
     */
    public SaleDTO sellItem(int quantity, Item item) {
        if (ongoingSale) {
            for (int i = 0; i < quantity; i++) {
                saleInformation.updateSale(item);
            }
        }
        return getSaleData();

    }


    /**
     * Returns the current state of the sale.
     * @return the current state of the sale.
     */
    public SaleDTO getSaleData() {
        return saleInformation.getSaleInformation();
    }

    /**
     * Handles the payment for the transaction.
     * @param amountPaid the amount of money handed over by the customer.
     * @return the change.
     * @throws Model.InsufficientFundsException
     */
    public AmountOfMoney payForSale(AmountOfMoney amountPaid) throws InsufficientFundsException{
        return cashRegister.registerPayment(amountPaid, totalPrice);
    }

    /**
     * Returns a new total amount depending on the provided discount.
     * @param discount the discount that is to be added to the total price.
     * @return the new total.
     */
    public TotalPriceDTO getDiscount(Discount discount) {
        totalPrice.applyDiscount(discount);
        return new TotalPriceDTO(totalPrice);
    }

}
