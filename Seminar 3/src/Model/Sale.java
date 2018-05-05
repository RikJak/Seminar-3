package Model;


import Integration.Item;

import Integration.DiscountRegistry;
import Utilities.*;

/**
 *
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
     *
     * @param cashRegister
     */
    public Sale(CashRegister cashRegister) {
                saleInformation = new SaleInformation(System.nanoTime());
                this.cashRegister = cashRegister;
                totalPrice = new TotalPrice(saleInformation);
                ongoingSale =true;
	}

	private void setTimeOfSale() {
            saleInformation.setTimeOfSale(System.nanoTime());
	}

    /**
     *
     * @return
     */
    public TotalPriceDTO finalizeSale() {
                totalPrice = new TotalPrice(saleInformation);
                ongoingSale = false;
                return new TotalPriceDTO(totalPrice);
	}

    /**
     *
     * @param quantity
     * @param item
     * @return
     */
    public SaleDTO sellItem(int quantity,Item item) {
            if(ongoingSale){
		for(int i = 0; i<quantity;i++){
                    saleInformation.updateSale(item);
                }
            }
                return getSaleData();
            
        }

    /**
     *
     * @return
     */
    public SaleDTO getSaleData() {
		return saleInformation.getSaleInformation();
	}

    /**
     *
     * @param amountPaid
     * @return
     */
    public AmountOfMoney payForSale(AmountOfMoney amountPaid) {
		return cashRegister.registerPayment(amountPaid, totalPrice);
	}

    /**
     *
     * @param discount
     * @return
     */
    public TotalPriceDTO getDiscount(Discount discount) {
		totalPrice.applyDiscount(discount);
                return new TotalPriceDTO(totalPrice);
	}

}
