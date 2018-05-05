/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Integration.DiscountRegistry;
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
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of Payment method, of class Payment.
     */
    @Test
    public void testPayment() {
        System.out.println("Payment");
        TotalPrice totalPrice = null;
        Payment instance = new Payment();
        Payment expResult = null;
        Payment result = instance.Payment(totalPrice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyDiscount method, of class Payment.
     */
    @Test
    public void testApplyDiscount() {
        System.out.println("applyDiscount");
        DiscountRegistry dsicount = null;
        Payment instance = new Payment();
        TotalPrice expResult = null;
        TotalPrice result = instance.applyDiscount(dsicount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pay method, of class Payment.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        AmountOfMoney cashPayment = null;
        Payment instance = new Payment();
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.pay(cashPayment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
