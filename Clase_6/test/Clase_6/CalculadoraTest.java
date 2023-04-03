package Clase_6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Caso 1
     */
    @Test
    public void testCaso1() {
        System.out.println("Caso 1: 80*3 = 240");
        double unNumero = 80.0;
        double otroNumero = 3.0;
        Calculadora instance = new Calculadora();
        double result = instance.multiplicar(unNumero, otroNumero);
        double expResult = 240.0;
        assertEquals(expResult, result, 0);
    }

    /**
     * Caso 2
     */
    @Test
    public void testCaso2() {
        System.out.println("Caso 2:(180+150)/3 = 110");
        double unNumero = 150.0;
        double otroNumero = 180.0;
        Calculadora instance = new Calculadora();
        double result = instance.sumar(unNumero, otroNumero);
        double numDiv = 3.0;
        Calculadora instance2 = new Calculadora();
        double expResult = 110.0;
        double result2 = instance2.dividir(result, numDiv);
        assertEquals(expResult, result2, 0);
    }

    /**
     * Caso 3
     */
    @Test
    public void testCaso3() {
        System.out.println("Caso 3:(90-50)*15 != 605");
        double unNumero = 90.0;
        double otroNumero = 50.0;
        double numMult = 15.0;
        Calculadora instance = new Calculadora();
        double result = instance.restar(unNumero, otroNumero);
        double result2 = instance.multiplicar(result, numMult);
        double expResult = 605.0;
        assertEquals(expResult, result2, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 4
     */
    @Test
    public void testCaso4() {
        System.out.println("Caso 4:(70+40)*25 != 2700 ");
        double unNumero = 70.0;
        double otroNumero = 40.0;
        double numMult = 25.0;
        Calculadora instance = new Calculadora();
        double result = instance.sumar(unNumero, otroNumero);
        double result2 = instance.multiplicar(result, numMult);
        double expResult = 2700.0;
        assertEquals(expResult, result2, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
