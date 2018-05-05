package View;

import Controller.Controller;
import Utilities.*;

import Model.TotalPrice;
import java.util.Arrays;

/**
 *
 * @author Rikard
 */
public class View{

	private Controller controller;

    /**
     *
     * @param contr
     */
    public View(Controller contr){
            this.controller = contr;
            
	}
        
    /**
     *
     */
    public void scanItem(){
            
        }

    /**
     *
     */
    public void sampleExcecution(){
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
            System.out.println("You paid 100000 and your change is: " + controller.pay(new AmountOfMoney(100000)));
            
           /* controller.startNewSale();
            int[] itemsToScan= {111,300,200};
            SaleDTO[] scans = scanItems(itemsToScan);
            System.out.println(Arrays.toString(scans));
            */
            controller.startNewSale();
            System.out.println(controller.scanItem(2, 200));
            System.out.println(controller.scanItem(3, 300));
            lastScan= controller.scanItem(44, 113);
            System.out.println(lastScan);
            System.out.println(lastScan.getSoldItems());
            total = controller.finalizeSale();
            System.out.println("Price before discount: " + total);
            total = controller.isEligibleForDiscount(99999999);
            System.out.println("Price after discount: " + total);
            System.out.println("You paid 100000 and your change is: " + controller.pay(new AmountOfMoney(100000)));
            
            
    }
            
            
        
    
    private SaleDTO[] scanItems(int[] itemIdentifiers){
        SaleDTO[] scannedItems = new SaleDTO[itemIdentifiers.length];
        for(int i = 0; i<itemIdentifiers.length;i++){
            scannedItems[i]= controller.scanItem(i, itemIdentifiers[i]);
        }
        return scannedItems;
    }
}
