package Model;

import Utilities.AmountOfMoney;
import java.security.InvalidParameterException;

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
    public AmountOfMoney registerPayment(AmountOfMoney amountPaid, TotalPrice finalPrice) throws InsufficientFundsException {

        AmountOfMoney change = calculateChange(amountPaid, finalPrice);

        return change;

    }

    private AmountOfMoney calculateChange(AmountOfMoney amountPaid, TotalPrice finalPrice) throws InsufficientFundsException {
        double change = amountPaid.getAmount() - finalPrice.getPrice().getAmount();
        
        if (change < 0) {
            String errorMessage = "You did not pay enough money, you are missing " + new AmountOfMoney(-change, amountPaid.getCurrency()).toString();
            throw new InsufficientFundsException(errorMessage);
        }
        System.out.println(finalPrice.getPrice());
        updateBalance(finalPrice.getPrice());
        return new AmountOfMoney(change);
    }

    public void updateBalance(AmountOfMoney totalPrice) throws InvalidParameterException {
        if (totalPrice.getAmount() < 0) {
            throw new InvalidParameterException("Not possible to add a negative amount");
        }
        balance.add(totalPrice);
    }

    /**
     * This initializes the cash register and sets its starting balance.
     *
     * @param balance is used to set the starting balance.
     */
    public CashRegister(AmountOfMoney balance) {
        this.balance = balance;
    }

    public AmountOfMoney getBalance() {
        return balance;
    }

}
