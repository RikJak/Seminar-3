/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author Rikard
 */
public class Discount {
   private final double disountRate;

    /**
     *
     * @param disountRate
     */
    public Discount(double disountRate) {
        this.disountRate = disountRate;
    }
    
    /**
     *
     * @return
     */
    public double getDiscount() {
        return disountRate;
    }
    
    
}
