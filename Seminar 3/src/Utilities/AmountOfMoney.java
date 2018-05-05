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
     *
     * @param startingAmount
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
