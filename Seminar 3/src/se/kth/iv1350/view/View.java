package se.kth.iv1350.view;

import java.util.ArrayList;
import se.kth.iv1350.utilities.TotalPriceDTO;
import se.kth.iv1350.utilities.SaleDTO;
import se.kth.iv1350.utilities.AmountOfMoney;
import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.integration.ItemNotFoundException;
import se.kth.iv1350.model.InsufficientFundsException;
import se.kth.iv1350.model.TotalPrice;
import java.util.Arrays;
import se.kth.iv1350.integration.DatabaseFailureException;
import se.kth.iv1350.integration.Item;
import se.kth.iv1350.integration.ItemDescription;
import se.kth.iv1350.utilities.ItemDescriptionMatcher;
import se.kth.iv1350.utilities.ItemIDMatcher;

/**
 * This class simulates the user interface of the program.
 *
 * @author Rikard
 */
public class View {

    private Controller controller;
    private SaleDTO lastScan;
    private ArrayList<TotalRevenueView> display = new ArrayList<>();

    /**
     * Creates the View and adds observers to the cashRegister
     *
     * @param contr the controller for this program.
     */
    public View(Controller contr) {
        this.controller = contr;
        display.add(new RevenueDisplay());
        display.add(new PrintRevenueToFile());
        for(TotalRevenueView viewer : display){
            contr.addObserver(viewer);
        }

    }

    /**
     * This method simulates two consecutive sales. It prints out what it
     * receives back from the controller.
     */
    public void sampleExcecution() throws DatabaseFailureException {
        System.out.println("Initiating a new transaction\n\n");
        System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
        controller.startNewSale();
        
        Item car  = new Item(111,null,null,null);
        Item baseBall  = new Item(300,null,null,null);
        Item banana  = new Item(201,null,null,null);
        Item bus  = new Item(113,null,null,null);
        Item appleID = new Item(200, null,null,null);
         Item appleDESC = new Item(0, new ItemDescription("This is an apple"),null,null);
        
        try {
            System.out.println(controller.scanItem(2, car));
            System.out.println(controller.scanItem(3, baseBall));
            System.out.println(controller.scanItem(1, appleID));
            controller.setDefaultMatcher(new ItemDescriptionMatcher());
            System.out.println(controller.scanItem(1, appleDESC));
            controller.setDefaultMatcher(new ItemIDMatcher());
            lastScan = controller.scanItem(2, banana);

            System.out.println(lastScan);
            //System.out.println(lastScan.getSoldItems());
        } catch (ItemNotFoundException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        TotalPriceDTO total = controller.finalizeSale();
        System.out.println("Price before discount: " + total);
        total = controller.isEligibleForDiscount(19931128);
        System.out.println("Price after discount: " + total);
        AmountOfMoney payment = new AmountOfMoney(3200);
        try {
            System.out.println("You paid " + payment + " and your change is: " + controller.pay(payment));
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Initiating a new transaction\n\n");
        System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
        controller.startNewSale();

        int[] input2 = {665, 300, 100};
        loopThroughInput(input2);

        total = controller.finalizeSale();
        System.out.println("Price before discount: " + total);
        total = controller.isEligibleForDiscount(99999999);
        System.out.println("Price after discount: " + total);
        payment = new AmountOfMoney(40000);

        try {
            System.out.println("\nYou paid " + payment + " and your change is: " + controller.pay(payment));
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
                
        
        System.out.println("Initiating a new transaction\n\n");
        System.out.println("The current balance in the cashRegister is: " + controller.getCashRegisterBalance());
        controller.startNewSale();

        int[] input3 = {666, 111, 100};
        loopThroughInput(input3);

        total = controller.finalizeSale();
        System.out.println("Price before discount: " + total);
        total = controller.isEligibleForDiscount(99999999);
        System.out.println("Price after discount: " + total);
        payment = new AmountOfMoney(40000);

        try {
            System.out.println("\nYou paid " + payment + " and your change is: " + controller.pay(payment));
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
       
        
    }
    
    private void loopThroughInput(int[] input){
           for (int i = 0; i < input.length; i++) {
            try {
                lastScan = controller.scanItem(i+1, input[i]);
                System.out.println(lastScan);
                //System.out.println(lastScan.getSoldItems());
            } catch (ItemNotFoundException | IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
