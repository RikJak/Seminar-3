package Model;

import Utilities.AmountOfMoney;

public class CashRegister {

	private AmountOfMoney balance;

	public AmountOfMoney registerPayment(AmountOfMoney amountPaid, TotalPrice finalPrice) {
                AmountOfMoney change = calculateChange(amountPaid, finalPrice);
                balance.add(change);
		return change;
	}

	private AmountOfMoney calculateChange(AmountOfMoney amountPaid, TotalPrice finalPrice) {
            double change = amountPaid.getAmount()- finalPrice.getPrice().getAmount();
		return new AmountOfMoney(change);
	}

	private void updateBalance() {
            
	}

	public CashRegister(AmountOfMoney balance) {
            this.balance = balance;
	}

}
