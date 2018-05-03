package View;

import Controller.Controller;
import DTO.SaleDTO;
import Integration.AmountOfMoney;
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
            TotalPrice total = controller.finalizeSale();
            
            controller.isEligibleForDiscount(19931128);
            controller.pay(new AmountOfMoney(100000));
            
        }
}
