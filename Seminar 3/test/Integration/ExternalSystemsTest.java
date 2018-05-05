/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration;

import Model.Reciept;
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
public class ExternalSystemsTest {
    
    public ExternalSystemsTest() {
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
     * Test of updateInventorySystem method, of class ExternalSystems.
     */
    @Test
    public void testUpdateInventorySystem() {
        System.out.println("updateInventorySystem");
        SaleDTO saleInformation = null;
        ExternalSystems instance = new ExternalSystems();
        instance.updateInventorySystem(saleInformation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccountingSystem method, of class ExternalSystems.
     */
    @Test
    public void testUpdateAccountingSystem() {
        System.out.println("updateAccountingSystem");
        SaleDTO saleInformation = null;
        ExternalSystems instance = new ExternalSystems();
        instance.updateAccountingSystem(saleInformation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReciept method, of class ExternalSystems.
     */
    @Test
    public void testPrintReciept() {
        System.out.println("printReciept");
        Reciept receipt = null;
        ExternalSystems instance = new ExternalSystems();
        instance.printReciept(receipt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
