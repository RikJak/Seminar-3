/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilities.AmountOfMoney;
import Utilities.Discount;
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
public class TotalPriceTest {
    
    public TotalPriceTest() {
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
     * Test of applyDiscount method, of class TotalPrice.
     */
    @Test
    public void testApplyDiscount() {
        System.out.println("applyDiscount");
        Discount discount = null;
        TotalPrice instance = null;
        instance.applyDiscount(discount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class TotalPrice.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        TotalPrice instance = null;
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
