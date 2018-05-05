/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Utilities.AmountOfMoney;
import Utilities.SaleDTO;
import Utilities.TotalPriceDTO;
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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of startNewSale method, of class Controller.
     */
    @Test
    public void testStartNewSale() {
        System.out.println("startNewSale");
        Controller instance = null;
        instance.startNewSale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scanItem method, of class Controller.
     */
    @Test
    public void testScanItem() {
        System.out.println("scanItem");
        int quantity = 0;
        int itemID = 0;
        Controller instance = null;
        SaleDTO expResult = null;
        SaleDTO result = instance.scanItem(quantity, itemID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizeSale method, of class Controller.
     */
    @Test
    public void testFinalizeSale() {
        System.out.println("finalizeSale");
        Controller instance = null;
        TotalPriceDTO expResult = null;
        TotalPriceDTO result = instance.finalizeSale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEligibleForDiscount method, of class Controller.
     */
    @Test
    public void testIsEligibleForDiscount() {
        System.out.println("isEligibleForDiscount");
        int customerID = 0;
        Controller instance = null;
        TotalPriceDTO expResult = null;
        TotalPriceDTO result = instance.isEligibleForDiscount(customerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pay method, of class Controller.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        AmountOfMoney paidAmount = null;
        Controller instance = null;
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.pay(paidAmount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
