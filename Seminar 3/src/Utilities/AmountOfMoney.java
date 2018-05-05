package Utilities;

public class AmountOfMoney {

	private char currency;

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void updateAmount(double newAmount) {
            amount = newAmount;
	}
        
        public void add(AmountOfMoney addition){
            amount += addition.getAmount();
        }
        
        public AmountOfMoney(double startingAmount){
            amount = startingAmount;
        }
        
        public String toString(){
            return String.format("%.2f", this.amount);
        }
        

}
