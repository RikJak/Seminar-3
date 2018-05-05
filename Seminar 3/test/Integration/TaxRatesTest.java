/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;

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
public class TaxRatesTest {
    
    public TaxRatesTest() {
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
     * Test of TaxRates method, of class TaxRates.
     */
    @Test
    public void testTaxRates() {
        System.out.println("TaxRates");
        TaxRates instance = new TaxRates();
        TaxRates expResult = null;
        TaxRates result = instance.TaxRates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxRate method, of class TaxRates.
     */
    @Test
    public void testGetTaxRate() {
        System.out.println("getTaxRate");
        char taxCategory = ' ';
        TaxRates instance = new TaxRates();
        double expResult = 0.0;
        double result = instance.getTaxRate(taxCategory);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
