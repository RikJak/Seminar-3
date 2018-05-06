/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.IV1350.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.IV1350.Integration.Item;
import se.kth.IV1350.Utilities.AmountOfMoney;
import se.kth.IV1350.Utilities.SaleDTO;

/**
 *
 * @author Rikard
 */
public class SaleInformationTest {
    
    public SaleInformationTest() {
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
     * Test of getFinalAmount method, of class SaleInformation.
     */
    @Test
    public void testGetFinalAmount() {
        System.out.println("getFinalAmount");
        SaleInformation instance = new SaleInformation();
        TotalPrice expResult = null;
        TotalPrice result = instance.getFinalAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSale method, of class SaleInformation.
     */
    @Test
    public void testUpdateSale() {
        System.out.println("updateSale");
        Item saleUpdate = null;
        SaleInformation instance = new SaleInformation();
        SaleDTO expResult = null;
        SaleDTO result = instance.updateSale(saleUpdate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaleInformation method, of class SaleInformation.
     */
    @Test
    public void testGetSaleInformation() {
        System.out.println("getSaleInformation");
        SaleInformation instance = new SaleInformation();
        SaleDTO expResult = null;
        SaleDTO result = instance.getSaleInformation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRunningTotal method, of class SaleInformation.
     */
    @Test
    public void testGetRunningTotal() {
        System.out.println("getRunningTotal");
        SaleInformation instance = new SaleInformation();
        AmountOfMoney expResult = null;
        AmountOfMoney result = instance.getRunningTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoldItems method, of class SaleInformation.
     */
    @Test
    public void testGetSoldItems() {
        System.out.println("getSoldItems");
        SaleInformation instance = new SaleInformation();
        SoldItems expResult = null;
        SoldItems result = instance.getSoldItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastSoldItem method, of class SaleInformation.
     */
    @Test
    public void testGetLastSoldItem() {
        System.out.println("getLastSoldItem");
        SaleInformation instance = new SaleInformation();
        Item expResult = null;
        Item result = instance.getLastSoldItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
