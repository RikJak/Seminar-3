
package se.kth.IV1350.Utilities;

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
     * @return the dicount rate
     */
    public double getDiscount() {
        return disountRate;
    }
    
    
}
