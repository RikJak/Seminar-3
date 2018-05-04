package Model;

import DTO.SaleDTO;
import Integration.Item;
import Integration.AmountOfMoney;
import Integration.Discount;

public class Sale {

	private Item scannedItems;

	private SaleInformation currentSaleInfo;

	private TotalPrice totalPrice;

	private SaleInformation saleInformation;

	private CashRegister cashRegister;

	public Sale(CashRegister cashRegister) {
                saleInformation = new SaleInformation(System.nanoTime());
                this.cashRegister = cashRegister;
	}

	private void setTimeOfSale() {
            saleInformation.setTimeOfSale(System.nanoTime());
	}

	public TotalPrice finalizeSale() {
		return new TotalPrice(saleInformation.getRunningTotal());
	}

	public SaleDTO sellItem(int quantity,Item item) {
		for(int i = 0; i<quantity;i++){
                    saleInformation.updateSale(item);
                }
                return saleInformation.getSaleInformation();
        }

	public SaleDTO getSaleData() {
		return null;
	}


	public AmountOfMoney payForSale(AmountOfMoney amountPaid) {
		return null;
	}

	public TotalPrice getDiscount(Discount discount) {
		return null;
	}

}
