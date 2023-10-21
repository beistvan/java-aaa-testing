/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingaaaexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp5
 */
public class TestingAAAExampleTest {
    
    public TestingAAAExampleTest() {
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
     * Test of szamolas method, of class TestingAAAExample.
     */
    @Test
    public void testSzamolas() {
        // AAA test
        System.out.println("Szamolas ellenorzese Excellel kiszamolt adattal");
        //Arrange - beállítás
        double a = 2.0;
        double b = 3.0;
        double expResult = 2.0487129074949; // Excelbol van
        //Act - cselekvés
        double result = TestingAAAExample.szamolas(a, b);
        //Assert - elvárunk egy értéket
        assertEquals(expResult, result, 1e-13); // pontossag a vesszo utani 13. szamjegyig
    }

    /**
     * Test of main method, of class TestingAAAExample.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestingAAAExample.main(args);
    }
    
}
