package Model;

import Utilities.AmountOfMoney;


/**
 *
 * @author Rikard
 */
public class CashRegister {

	private AmountOfMoney balance;

    /**
     *
     * @param amountPaid
     * @param finalPrice
     * @return
     */
    public AmountOfMoney registerPayment(AmountOfMoney amountPaid, TotalPrice finalPrice) {
                AmountOfMoney change = calculateChange(amountPaid, finalPrice);
                balance.add(change);
		return change;
	}

	private AmountOfMoney calculateChange(AmountOfMoney amountPaid, TotalPrice finalPrice) throws InsufficientFundsException {
            double change = amountPaid.getAmount()- finalPrice.getPrice().getAmount();
            if(change <0){
                throw new InsufficientFundsException("Insufficient funds");
            }
		return new AmountOfMoney(change);
	}

	private void updateBalance() {
            
	}

    /**
     *
     * @param balance
     */
    public CashRegister(AmountOfMoney balance) {
            this.balance = balance;
	}

}
