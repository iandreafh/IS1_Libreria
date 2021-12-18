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

    private Vendedor vendedor;
    private Bono bono;

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
        vendedor = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        bono = new Bono(75, 7.1F, vendedor);
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
        Bono instance = bono;
        int expResult = 75;
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
        int id = 3;
        Bono instance = bono;
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
        Bono instance = bono;
        float expResult = 7.1F;
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
        float cantidad = 0.0F;
        Bono instance = null;
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Bono.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Bono instance = null;
        Vendedor expResult = null;
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Bono.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor vendedor = null;
        Bono instance = null;
        instance.setVendedor(vendedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
