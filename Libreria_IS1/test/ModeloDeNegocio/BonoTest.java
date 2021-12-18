/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ModeloDeNegocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class BonoTest {

    public BonoTest() {
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
     * Test of getId method, of class Bono.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Bono instance = new Bono(10, 1, v);
        int expResult = 10;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Bono.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 5;
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Bono instance = new Bono(10, 1, v);
        instance.setId(id);
        assertEquals(id, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Bono.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Bono instance = new Bono(10, 4.8F, v);
        float expResult = 4.8F;
        float result = instance.getCantidad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Bono.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        float cantidad = 5.3F;
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Bono instance = new Bono(10, 4.8F, v);
        instance.setCantidad(cantidad);
        assertEquals(cantidad, instance.getCantidad(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Bono.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Bono instance = new Bono(10, 4.8F, v);
        Vendedor expResult = v;
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Bono.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Bono instance = new Bono(10, 4.8F, v);
        instance.setVendedor(v);
        assertEquals(instance.getVendedor(), v);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
