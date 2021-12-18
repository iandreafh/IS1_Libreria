/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ModeloDeNegocio;

import java.util.Date;
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
public class LineaVentaTest {

    public LineaVentaTest() {
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
     * Test of getId method, of class LineaVenta.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        int expResult = 10;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class LineaVenta.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 5;
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        instance.setId(id);
        assertEquals(id, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioFinal method, of class LineaVenta.
     */
    @Test
    public void testGetPrecioFinal() {
        System.out.println("getPrecioFinal");
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        float expResult = 15.8F;
        float result = instance.getPrecioFinal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioFinal method, of class LineaVenta.
     */
    @Test
    public void testSetPrecioFinal() {
        System.out.println("setPrecioFinal");
        float precioFinal = 58.1F;
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        instance.setPrecioFinal(precioFinal);
        assertEquals(precioFinal, instance.getPrecioFinal(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLibro method, of class LineaVenta.
     */
    @Test
    public void testGetLibro() {
        System.out.println("getLibro");
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        Libro expResult = l;
        Libro result = instance.getLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLibro method, of class LineaVenta.
     */
    @Test
    public void testSetLibro() {
        System.out.println("setLibro");
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        instance.setLibro(l);
        assertEquals(l, instance.getLibro());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBono method, of class LineaVenta.
     */
    
    //MUY IMPORTANTE ESTO FUNCIONA PERO NO USAMOS BONO CUANDO CREAMOS LA LINEA DE VENTAS 
    //IMPORTANTE!!!!!!!!!!!!!!!!!!!
    @Test
    public void testGetBono() {
        System.out.println("getBono");
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        Bono bono = new Bono(15, 5.6F, v);
        instance.setBono(bono);
        Bono expResult = bono;
        Bono result = instance.getBono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBono method, of class LineaVenta.
     */
    @Test
    public void testSetBono() {
        System.out.println("setBono");
        Date fecha = new Date();
        Vendedor v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        Libro l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, fecha, 0, v);
        LineaVenta instance = new LineaVenta(10, 15.8F, l);
        Bono bono = new Bono(15, 5.6F, v);
        instance.setBono(bono);
        assertEquals(bono, instance.getBono());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
