/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.view;

import se.kth.iv1350.utilities.AmountOfMoney;

/**
 * An interface for classes observing the total revenue for the program
 * @author Rikard
 */
public interface TotalRevenueView {

    /**
     * Updates the revenue
     * @param amountPaid
     */
    void newPayment(AmountOfMoney amountPaid);
}
