/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.entornos;

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
public class EntornosIT {
    
    public EntornosIT() {
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
     * Test of numero_mayor method, of class Entornos.
     */
    @Test
    public void testNumero_mayor() {
        System.out.println("numero_mayor");
        int a = 1;
        int b = 2;
        int c = 3;
        int expResult = 3;
        int result = Entornos.numero_mayor(a, b, c);
        assertEquals("Se ha roto",expResult, result);
    }   

    /**
     * Test of ej1Bucle method, of class Entornos.
     */
    @Test
    public void testEj1Bucle() {
        System.out.println("ej1Bucle");
        int[] numeros = null;
        int expResult = 0;
        int result = Entornos.ej1Bucle(numeros);
        assertEquals(expResult, result);       
    }
}
