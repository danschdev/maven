/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danschdev.rubik;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class CubeTest {
    
    public CubeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of constructor method, of class Cube.
     */
    @Test
    public void testConstructor() {
        Cube instance = new Cube();
        int expResult = 0;
        int result = instance.value[0][0][0];
        assertEquals(expResult, result);
    }

    /**
     * Test of sayHello method, of class Cube.
     */
    @Test
    public void testSayHello() {
        Cube instance = new Cube();
        String expResult = "Hello Barmbek!";
        String result = instance.sayHello();
        assertEquals(expResult, result);
    }
    
}
