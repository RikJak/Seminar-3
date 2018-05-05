/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Integration.Item;
import Utilities.AmountOfMoney;
import Utilities.SaleDTO;
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
        SaleInformation instance = null;
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
        SaleInformation instance = null;
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
        SaleInformation instance = null;
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
        SaleInformation instance = null;
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
        SaleInformation instance = null;
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
        SaleInformation instance = null;
        Item expResult = null;
        Item result = instance.getLastSoldItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeOfSale method, of class SaleInformation.
     */
    @Test
    public void testGetTimeOfSale() {
        System.out.println("getTimeOfSale");
        SaleInformation instance = null;
        long expResult = 0L;
        long result = instance.getTimeOfSale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRunningTotal method, of class SaleInformation.
     */
    @Test
    public void testSetRunningTotal() {
        System.out.println("setRunningTotal");
        AmountOfMoney runningTotal = null;
        SaleInformation instance = null;
        instance.setRunningTotal(runningTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastSoldItem method, of class SaleInformation.
     */
    @Test
    public void testSetLastSoldItem() {
        System.out.println("setLastSoldItem");
        Item lastSoldItem = null;
        SaleInformation instance = null;
        instance.setLastSoldItem(lastSoldItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeOfSale method, of class SaleInformation.
     */
    @Test
    public void testSetTimeOfSale() {
        System.out.println("setTimeOfSale");
        long timeOfSale = 0L;
        SaleInformation instance = null;
        instance.setTimeOfSale(timeOfSale);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
