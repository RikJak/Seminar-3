
package se.kth.iv1350.utilities;

/**
 * This is the discount that a customer gets.
 * @author Rikard
 */
public class Discount {
   private final double disountRate;

    /**
     * This sets the discount.
     * @param disountRate
     */
    public Discount(double disountRate) {
        this.disountRate = disountRate;
    }
    
    /**
     * Gets the discount rate.
     * @return the discount rate
     */
    public double getDiscount() {
        return disountRate;
    }
    
    
}
