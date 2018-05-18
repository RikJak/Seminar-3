/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.integration;

/**
 *
 * @author Rikard
 */
public class DatabaseFailureException extends Exception {

    /**
     * Creates a new instance of <code>DatabaseFailureException</code> without
     * detail message.
     */
    public DatabaseFailureException() {
    }

    /**
     * Constructs an instance of <code>DatabaseFailureException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DatabaseFailureException(String msg) {
        super(msg);
    }
}
