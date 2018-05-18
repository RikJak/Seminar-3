package se.kth.iv1350.view;

import se.kth.iv1350.utilities.TotalPriceDTO;
import se.kth.iv1350.utilities.SaleDTO;
import se.kth.iv1350.utilities.AmountOfMoney;
import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.integration.ItemNotFoundException;
import se.kth.iv1350.model.InsufficientFundsException;
import se.kth.iv1350.model.TotalPrice;
import java.util.Arrays;
import se.kth.iv1350.integration.DatabaseFailureException;

/**
 * This class simulates the user interface of the program.
 * @author Rikard
 */
public class View{

	private Controller controller;

    /**
     * Creates the View
     * @param contr the controller for this program.
     */
    public View(Controller contr){
            this.controller = contr;
            
	}
        
 
    /**
     *This method simulates two consecutive sales. It prints out what it receives back from the controller.
     */
    public void sampleExcecution() throws DatabaseFailureException{
            System.out.println("Initiating a new transaction\n\n");
            System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
            controller.startNewSale();
            SaleDTO lastScan= null;
            try{
            System.out.println(controller.scanItem(2, 111));
            System.out.println(controller.scanItem(3, 300));
            lastScan= controller.scanItem(2, 201);

            System.out.println(lastScan);
            //System.out.println(lastScan.getSoldItems());
                }catch(ItemNotFoundException|IllegalArgumentException e){
                System.err.println(e);
    }
            TotalPriceDTO total = controller.finalizeSale();
            System.out.println("Price before discount: " + total);
            total = controller.isEligibleForDiscount(19931128);
            System.out.println("Price after discount: " + total);
            AmountOfMoney payment =new AmountOfMoney(3200);
            try{
            System.out.println("You paid "+payment+ " and your change is: " + controller.pay(payment));
            }catch(InsufficientFundsException e){
                    System.out.println(e);
                    }
            System.out.println("Initiating a new transaction\n\n");
            System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
            controller.startNewSale();
            try{
            System.out.println(controller.scanItem(2, 666));
            System.out.println(controller.scanItem(3, 300));
            lastScan= controller.scanItem(1, 113);
            System.out.println(lastScan);
            //System.out.println(lastScan.getSoldItems());
            }catch(ItemNotFoundException|IllegalArgumentException e){
                System.out.println(e.toString());
            }
            total = controller.finalizeSale();
            System.out.println("Price before discount: " + total);
            total = controller.isEligibleForDiscount(99999999);
            System.out.println("Price after discount: " + total);
            payment = new AmountOfMoney(40000);
            
            
            try{
            System.out.println("\nYou paid "+ payment +" and your change is: " + controller.pay(payment));
            }catch(InsufficientFundsException e){
                    System.out.println(e);
                    }
            System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
            
    }
    
}
