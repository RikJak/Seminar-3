/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilities.AmountOfMoney;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rikard
 */
public class CashRegisterTest {
    
    public CashRegisterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registerPayment method, of class CashRegister.
     */
    /*@Test
    public void testRegisterPayment() {
        System.out.println("registerPayment");
        AmountOfMoney amountPaid = null;
        TotalPrice finalPrice = null;
        CashRegister instance = null;
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.registerPayment(amountPaid, finalPrice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
    public void testUpdateBalance(){
        System.out.println("UpdateBalance");
        AmountOfMoney startingBalance = new AmountOfMoney(1000);
        CashRegister instance = new CashRegister(startingBalance);
        AmountOfMoney price = new AmountOfMoney(200);
        instance.updateBalance(price);
        AmountOfMoney result = instance.getBalance();
        startingBalance.add(price);
        assertEquals(startingBalance.getAmount(), result.getAmount(),0);
    }
    
}
