package Utilities;

import Model.TotalPrice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rikard
 */
public class TotalPriceDTO {
    private final AmountOfMoney totalPrice;

    /**
     *
     * @param totalPrice
     */
    public TotalPriceDTO(TotalPrice totalPrice) {
        this.totalPrice = totalPrice.getPrice();
    }

    /**
     *
     * @return
     */
    public AmountOfMoney getTotalPrice() {
        return totalPrice;
    }
    
    public String toString(){
        return totalPrice.toString();
    }
    
}
