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
        Color expResult = Color.GREEN;
        Color result = instance.getFront();
        assertEquals(expResult, result);
    }

    /**
     * Test of turnFromTo method, of class Cube.
     */
    @Test
    public void testTurnFromTo() throws Exception {
        System.out.println("turnFromTo");
        Side start = Side.front;
        Side target = Side.up;
        Color frontColor = start.getColor();
        Cube instance = new Cube();
        instance.turnFromTo(start, target);
               
        Color targetColor = target.getColor();
        assertEquals(frontColor, targetColor);
    }

    /**
     * Test of getFront method, of class Cube.
     */
    @Test
    public void testGetFront() {
        System.out.println("getFront");
        Cube instance = new Cube();
        Color expResult = Color.GREEN;
        Color result = instance.getFront();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBack method, of class Cube.
     */
    @Test
    public void testGetBack() {
        System.out.println("getBack");
        Cube instance = new Cube();
        Color expResult = Color.YELLOW;
        Color result = instance.getBack();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLeft method, of class Cube.
     */
    @Test
    public void testGetLeft() {
        System.out.println("getLeft");
        Cube instance = new Cube();
        Color expResult = Color.PURPLE;
        Color result = instance.getLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRight method, of class Cube.
     */
    @Test
    public void testGetRight() {
        System.out.println("getRight");
        Cube instance = new Cube();
        Color expResult = Color.BLUE;
        Color result = instance.getRight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUp method, of class Cube.
     */
    @Test
    public void testGetUp() {
        System.out.println("getUp");
        Cube instance = new Cube();
        Color expResult = Color.RED;
        Color result = instance.getUp();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDown method, of class Cube.
     */
    @Test
    public void testGetDown() {
        System.out.println("getDown");
        Cube instance = new Cube();
        Color expResult = Color.PINK;
        Color result = instance.getDown();
        assertEquals(expResult, result);
    }
    
}
