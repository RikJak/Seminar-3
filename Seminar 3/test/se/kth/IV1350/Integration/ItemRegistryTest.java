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
public class ItemRegistryTest {
    
    public ItemRegistryTest() {
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
     * Test of getItem method, of class ItemRegistry.
     */
    @Test
    public void testGetExistingItem() {
        System.out.println("getExistingItem");
        int itemID = 111;
        ItemRegistry instance = new ItemRegistry();
        Item expResult = new Item(111,new ItemDescription("This is a car"),new AmountOfMoney(10000),"Vehicle");
        try{
        Item result = instance.getItem(itemID);
        assertEquals(expResult.getItemID(), result.getItemID());
        }catch(ItemNotFoundException e){
            System.err.println(e);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
       public void testGetNonExistingItem() {
        System.out.println("getNonrxistantItem");
        int itemID = 0;
        ItemRegistry instance = new ItemRegistry();
        Item expResult = null;
        try{
        Item result = instance.getItem(itemID);
        assertEquals(expResult.getItemID(), result.getItemID());
        }catch(ItemNotFoundException e){
            System.err.println(e);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}