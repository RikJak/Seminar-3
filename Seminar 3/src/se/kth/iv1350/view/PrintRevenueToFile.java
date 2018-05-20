/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.view;

import se.kth.iv1350.startup.LogToFile;
import se.kth.iv1350.utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class PrintRevenueToFile implements TotalRevenueView{
    AmountOfMoney total = new AmountOfMoney(0);
    @Override
    public void newPayment(AmountOfMoney amountPaid) {
        LogToFile log = new LogToFile("revenueLog.txt");
        
    }
    
    
}
