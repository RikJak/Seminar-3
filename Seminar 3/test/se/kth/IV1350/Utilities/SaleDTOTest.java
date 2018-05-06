/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.IV1350.Utilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.IV1350.Integration.Item;
import se.kth.IV1350.Model.SoldItems;

/**
 *
 * @author Rikard
 */
public class SaleDTOTest {
    
    public SaleDTOTest() {
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
     * Test of getRunningTotal method, of class SaleDTO.
     */
    @Test
    public void testGetRunningTotal() {
        System.out.println("getRunningTotal");
        SaleDTO instance = null;
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.getRunningTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastSoldItem method, of class SaleDTO.
     */
    @Test
    public void testGetLastSoldItem() {
        System.out.println("getLastSoldItem");
        SaleDTO instance = null;
        Item expResult = null;
        Item result = instance.getLastSoldItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoldItems method, of class SaleDTO.
     */
    @Test
    public void testGetSoldItems() {
        System.out.println("getSoldItems");
        SaleDTO instance = null;
        SoldItems expResult = null;
        SoldItems result = instance.getSoldItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SaleDTO.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SaleDTO instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
