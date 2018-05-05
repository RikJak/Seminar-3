
package Integration;

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
public class DiscountRegistryTest {
    
    public DiscountRegistryTest() {
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
     * Test of getDiscount method, of class DiscountRegistry.
     */
    @Test
    public void testGetValidDiscount() {
        System.out.println("getDiscount");
        int customerID = 19931128;
        DiscountRegistry instance = new DiscountRegistry();
        Discount expResult = new Discount(0.1);
        Discount result = instance.getDiscount(customerID);
        assertEquals(expResult.getDiscount(), result.getDiscount(),0);
  
    }
        @Test
    public void testGetInvalidDiscount() {
        System.out.println("getDiscount");
        int customerID = 999999;
        DiscountRegistry instance = new DiscountRegistry();
        Discount expResult = new Discount(1);
        Discount result = instance.getDiscount(customerID);
        assertEquals(expResult.getDiscount(), result.getDiscount(),0);
       
    }

    
}
