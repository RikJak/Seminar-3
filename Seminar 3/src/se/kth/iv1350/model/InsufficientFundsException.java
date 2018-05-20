package se.kth.iv1350.model;


/**
 * This exception is throw if the uses does not enter enough money 
 * @author Rikard
 */
public class InsufficientFundsException extends Exception {

    /**
     * Creates a new instance of <code>InsufficientFundsException</code> without
     * detail message.
     */
    public InsufficientFundsException() {
    }

    /**
     * Constructs an instance of <code>InsufficientFundsException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}
