/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.view;

import java.time.LocalDateTime;
import se.kth.iv1350.utilities.LogToFile;
import se.kth.iv1350.utilities.AmountOfMoney;

/**
 *  Prints the revenue to a file.
 * @author Rikard
 */
public class PrintRevenueToFile implements TotalRevenueView{
    private AmountOfMoney total = new AmountOfMoney(0);
    private int transactionNO = 0;
    LogToFile log = new LogToFile("revenueLog.txt");

    /**
     *  Updates the revenue with the value of the last transaction and then prints it to a file.
     * @param amountPaid the amount paid in the last transaction.
     */
    @Override
    public void newPayment(AmountOfMoney amountPaid) {
        total.add(amountPaid);
        transactionNO++;
        
        log.writeToFile(total.toString()+" Transaction: "+ transactionNO + "  at:"+ LocalDateTime.now());
        
    }
    
    
}
