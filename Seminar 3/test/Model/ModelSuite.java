/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Rikard
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Model.SaleTest.class, Model.RecieptTest.class, Model.TotalPriceTest.class, Model.SaleInformationTest.class, Model.CashRegisterTest.class, Model.TaxTest.class, Model.SoldItemsTest.class, Model.PaymentTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
