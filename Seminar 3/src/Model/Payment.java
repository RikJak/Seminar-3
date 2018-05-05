package Model;

import Integration.DiscountRegistry;
import Utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class Payment {

	private TotalPrice amountToBePaid;

    /**
     *
     * @param totalPrice
     * @return
     */
    public Payment Payment(TotalPrice totalPrice) {
		return null;
	}

    /**
     *
     * @param dsicount
     * @return
     */
    public TotalPrice applyDiscount(DiscountRegistry dsicount) {
		return null;
	}

    /**
     *
     * @param cashPayment
     * @return
     */
    public AmountOfMoney pay(AmountOfMoney cashPayment) {
		return null;
	}

}
