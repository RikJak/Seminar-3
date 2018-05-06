package se.kth.IV1350.Utilities;

import se.kth.IV1350.Model.TotalPrice;

/**
 * A DTO for the TotalPrice class.
 * @author Rikard
 */
public class TotalPriceDTO {
    private final AmountOfMoney totalPrice;

    /**
     *Initializes the DTO
     * @param totalPrice
     */
    public TotalPriceDTO(TotalPrice totalPrice) {
        this.totalPrice = totalPrice.getPrice();
    }

    /**
     * returns the final price
     * @return
     */
    public AmountOfMoney getTotalPrice() {
        return totalPrice;
    }
    
    public String toString(){
        return totalPrice.toString();
    }
    
}
