package Model;


import Integration.Item;

import Integration.DiscountRegistry;
import Utilities.*;

public class Sale {

	private Item scannedItems;

	private SaleInformation currentSaleInfo;

	private TotalPrice totalPrice;

	private SaleInformation saleInformation;

	private CashRegister cashRegister;
        
        private boolean ongoingSale;

	public Sale(CashRegister cashRegister) {
                saleInformation = new SaleInformation(System.nanoTime());
                this.cashRegister = cashRegister;
                totalPrice = new TotalPrice(saleInformation);
                ongoingSale =true;
	}

	private void setTimeOfSale() {
            saleInformation.setTimeOfSale(System.nanoTime());
	}

	public TotalPriceDTO finalizeSale() {
                totalPrice = new TotalPrice(saleInformation);
                ongoingSale = false;
                return new TotalPriceDTO(totalPrice);
	}

	public SaleDTO sellItem(int quantity,Item item) {
            if(ongoingSale){
		for(int i = 0; i<quantity;i++){
                    saleInformation.updateSale(item);
                }
            }
                return getSaleData();
            
        }

	public SaleDTO getSaleData() {
		return saleInformation.getSaleInformation();
	}


	public AmountOfMoney payForSale(AmountOfMoney amountPaid) {
		return cashRegister.registerPayment(amountPaid, totalPrice);
	}

	public TotalPriceDTO getDiscount(Discount discount) {
		totalPrice.applyDiscount(discount);
                return new TotalPriceDTO(totalPrice);
	}

}
