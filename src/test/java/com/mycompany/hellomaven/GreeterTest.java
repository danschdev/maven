/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellomaven;

import danschdev.rubik.Greeter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class GreeterTest {
    
    public GreeterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sayHello method, of class Greeter.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        Greeter instance = new Greeter();
        String expResult = "Hello Barmbek!";
        String result = instance.sayHello();
        assertEquals(expResult, result);
    }
    
}
