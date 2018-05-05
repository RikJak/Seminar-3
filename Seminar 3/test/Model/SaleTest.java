/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Integration.Item;
import Utilities.AmountOfMoney;
import Utilities.Discount;
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
public class SaleTest {
    
    public SaleTest() {
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
     * Test of finalizeSale method, of class Sale.
     */
    @Test
    public void testFinalizeSale() {
        System.out.println("finalizeSale");
        Sale instance = null;
        TotalPriceDTO expResult = null;
        TotalPriceDTO result = instance.finalizeSale();
        assertEquals(expResult, result);
    }

    /**
     * Test of sellItem method, of class Sale.
     */
    @Test
    public void testSellItem() {
        System.out.println("sellItem");
        int quantity = 0;
        Item item = null;
        Sale instance = null;
        SaleDTO expResult = null;
        SaleDTO result = instance.sellItem(quantity, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaleData method, of class Sale.
     */
    @Test
    public void testGetSaleData() {
        System.out.println("getSaleData");
        Sale instance = null;
        SaleDTO expResult = null;
        SaleDTO result = instance.getSaleData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payForSale method, of class Sale.
     */
    @Test
    public void testPayForSale() {
        System.out.println("payForSale");
        AmountOfMoney amountPaid = null;
        Sale instance = null;
        AmountOfMoney expResult = null;
        try{
        AmountOfMoney result = instance.payForSale(amountPaid);
        }catch(InsufficientFundsException e){
            
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscount method, of class Sale.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        Discount discount = null;
        Sale instance = null;
        TotalPriceDTO expResult = null;
        TotalPriceDTO result = instance.getDiscount(discount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
