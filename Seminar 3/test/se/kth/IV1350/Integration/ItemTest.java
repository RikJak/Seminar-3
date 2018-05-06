/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.IV1350.Integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.IV1350.Utilities.AmountOfMoney;

/**
 *
 * @author Rikard
 */
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getItemID method, of class Item.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        Item instance = null;
        ItemIdentifier expResult = null;
        ItemIdentifier result = instance.getItemID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemDescription method, of class Item.
     */
    @Test
    public void testGetItemDescription() {
        System.out.println("getItemDescription");
        Item instance = null;
        ItemDescription expResult = null;
        ItemDescription result = instance.getItemDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsValidItem method, of class Item.
     */
    @Test
    public void testIsIsValidItem() {
        System.out.println("isIsValidItem");
        Item instance = null;
        boolean expResult = false;
        boolean result = instance.isIsValidItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Item instance = null;
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCategory method, of class Item.
     */
    @Test
    public void testGetItemCategory() {
        System.out.println("getItemCategory");
        Item instance = null;
        String expResult = "";
        String result = instance.getItemCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Item instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
