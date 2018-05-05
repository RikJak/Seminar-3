package Utilities;

/**
 *
 * @author Rikard
 */
public class AmountOfMoney {

    private String currency;

    private double amount;

    /**
     *
     * @return
     */
    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param newAmount
     */
    public void updateAmount(double newAmount) {
        amount = newAmount;
    }

    /**
     *
     * @param addition
     */
    public void add(AmountOfMoney addition) {
        amount += addition.getAmount();
    }

    /**
     *This is the default constructor for this object. It sets the amount contained and sets the currency to a default value.
     * @param startingAmount the starting value for this AmountOfMoney
     */
    public AmountOfMoney(double startingAmount) {
        amount = startingAmount;
        currency = "sek";
    }

    public AmountOfMoney(double startingAmount, String currency) {
        amount = startingAmount;
        this.currency = currency;
    }

    public String toString() {
        return String.format("%.2f", this.amount) + " " + currency;
    }

}
