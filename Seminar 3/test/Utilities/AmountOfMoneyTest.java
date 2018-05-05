/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

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
public class AmountOfMoneyTest {
    
    public AmountOfMoneyTest() {
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
     * Test of getAmount method, of class AmountOfMoney.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        AmountOfMoney instance = null;
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAmount method, of class AmountOfMoney.
     */
    @Test
    public void testUpdateAmount() {
        System.out.println("updateAmount");
        double newAmount = 0.0;
        AmountOfMoney instance = null;
        instance.updateAmount(newAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AmountOfMoney.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AmountOfMoney addition = null;
        AmountOfMoney instance = null;
        instance.add(addition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AmountOfMoney.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AmountOfMoney instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
