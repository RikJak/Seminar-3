package View;

import Controller.Controller;
import Model.InsufficientFundsException;
import Utilities.*;

import Model.TotalPrice;
import java.util.Arrays;

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
    public void sampleExcecution(){
            System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
            controller.startNewSale();
            System.out.println(controller.scanItem(2, 111));
            System.out.println(controller.scanItem(3, 300));
            SaleDTO lastScan= controller.scanItem(2, 201);
            System.out.println(lastScan);
            System.out.println(lastScan.getSoldItems());
            TotalPriceDTO total = controller.finalizeSale();
            System.out.println("Price before discount: " + total);
            total = controller.isEligibleForDiscount(19931128);
            System.out.println("Price after discount: " + total);
            try{
            System.out.println("You paid 100000 and your change is: " + controller.pay(new AmountOfMoney(3000)));
            }catch(InsufficientFundsException e){
                    System.out.println(e);
                    }
            
            System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
           /* controller.startNewSale();
            int[] itemsToScan= {111,300,200};
            SaleDTO[] scans = scanItems(itemsToScan);
            System.out.println(Arrays.toString(scans));
            */
            controller.startNewSale();
            System.out.println(controller.scanItem(2, 200));
            System.out.println(controller.scanItem(3, 300));
            lastScan= controller.scanItem(1, 113);
            System.out.println(lastScan);
            System.out.println(lastScan.getSoldItems());
            total = controller.finalizeSale();
            System.out.println("Price before discount: " + total);
            total = controller.isEligibleForDiscount(99999999);
            System.out.println("Price after discount: " + total);
            AmountOfMoney payment = new AmountOfMoney(40000);
            
            
            try{
            System.out.println("\nYou paid "+ payment +" and your change is: " + controller.pay(payment));
            }catch(InsufficientFundsException e){
                    System.out.println(e);
                    }
            System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
            
    }
    
}
