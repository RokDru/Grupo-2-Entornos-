/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package IlieMarius;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WEB1-26
 */
public class Ejercicio1y2IT {
    
    public Ejercicio1y2IT() {
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
     * Test of mayor method, of class Ejercicio1.
     */
    @Test
    public void testMayor() {
        System.out.println("mayor");
        int a = 1;
        int b = 2;
        int c = 3;
        int expResult = c;
        int result = Ejercicio1y2.mayor(a, b, c);
        assertEquals(expResult, result);      
    }
    @Test
    public void testMayor2() {
        System.out.println("mayor");
        int a = 1;
        int b = 3;
        int c = 2;
        int expResult = b;
        int result = Ejercicio1y2.mayor(a, b, c);
        assertEquals(expResult, result);      
    }
    @Test
    public void testMayor3() {
        System.out.println("mayor");
        int a = 3;
        int b = 2;
        int c = 1;
        int expResult = a;
        int result = Ejercicio1y2.mayor(a, b, c);
        assertEquals(expResult, result);      
    }

    /**
     * Test of calcularMCM method, of class Ejercicio1.
     */
    @Test
    public void testCalcularMCM() {
        System.out.println("calcularMCM");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Ejercicio1y2.calcularMCM(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularMCM2() {
        System.out.println("calcularMCM");
        int a = 2;
        int b = -1;
        int expResult = -1;
        int result = Ejercicio1y2.calcularMCM(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularMCM3() {
        System.out.println("calcularMCM");
        int a = -1;
        int b = 0;
        int expResult = 0;
        int result = Ejercicio1y2.calcularMCM(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcularMCM4() {
        System.out.println("calcularMCM");
        int a = -1;
        int b = -1;
        int expResult = 1;
        int result = Ejercicio1y2.calcularMCM(a, b);
        assertEquals(expResult, result);
    }
    
}
