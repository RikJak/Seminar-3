package View;

import Controller.Controller;
import Utilities.*;

import Model.TotalPrice;

public class View{

	private Controller controller;


	public View(Controller contr){
            this.controller = contr;
            
	}
        
        public void scanItem(){
            
        }
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
            
        }
}
