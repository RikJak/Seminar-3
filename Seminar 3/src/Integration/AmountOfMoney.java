package Integration;

public class AmountOfMoney {

	private char currency;

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void updateAmount(double newAmount) {

	}
        
        public AmountOfMoney(double startingAmount){
            amount = startingAmount;
        }

}
