/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ModeloDeNegocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class VentaTest {
    
    private Date fecha;
    private Vendedor v;
    private Libro l;
    private LineaVenta ldv;
    private LineaVenta ldv2;
    private Venta ventaPrueba;
    
    public VentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fecha = new Date();
        v = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        l = new Libro(0, "libro1", "1111-A", 0, 0, fecha, v);
        ldv = new LineaVenta(10, 15.8F, l);
        ldv2 = new LineaVenta(11, 1.8F, l);
        ventaPrueba = new Venta(5, fecha);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Venta.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Venta instance = ventaPrueba;
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Venta.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 7;
        Venta instance = ventaPrueba;
        instance.setId(id);
        assertEquals(id, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Venta.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Venta instance = ventaPrueba;
        Date expResult = fecha;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Venta.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = this.fecha;
        Venta instance = ventaPrueba;
        instance.setFecha(fecha);
        assertEquals(fecha, ventaPrueba.getFecha());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioTotal method, of class Venta.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        Venta instance = ventaPrueba;
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioTotal method, of class Venta.
     */
    @Test
    public void testSetPrecioTotal() {
        System.out.println("setPrecioTotal");
        double precioTotal = 7.5;
        Venta instance = ventaPrueba;
        instance.setPrecioTotal(precioTotal);
        assertEquals(precioTotal, instance.getPrecioTotal(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaLdv method, of class Venta.
     */
    @Test
    public void testGetListaLdv() {
        System.out.println("getListaLdv");
        Venta instance = ventaPrueba;
        List<LineaVenta> expResult = new ArrayList<>();
        expResult.add(this.ldv);
        expResult.add(this.ldv2);
        instance.setListaLdv(expResult);
        List<LineaVenta> result = instance.getListaLdv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaLdv method, of class Venta.
     */
    @Test
    public void testSetListaLdv() {
        System.out.println("setListaLdv");
        List<LineaVenta> listaLdv = new ArrayList<>();
        listaLdv.add(ldv);
        listaLdv.add(ldv2);
        Venta instance = ventaPrueba;
        instance.setListaLdv(listaLdv);
        assertEquals(ventaPrueba.getListaLdv(), listaLdv);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of anadirLinea method, of class Venta.
     */
    @Test
    public void testAnadirLinea() {
        System.out.println("anadirLinea");
        float precioFinal = 3.8F;
        Libro libro = l;
        Venta instance = ventaPrueba;
        boolean expResult = true;
        boolean result = instance.anadirLinea(precioFinal, libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarVenta method, of class Venta.
     */
    //No tengo ni idea de como enfocar este confirmarVenta deberían de ser private??
    @Test
    public void testConfirmarVenta() {
        System.out.println("confirmarVenta");
        Venta instance = ventaPrueba;
        instance.confirmarVenta();
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearBonos method, of class Venta.
     */
    //No tengo ni idea de como enfocar este confirmarVenta deberían de ser private??
    @Test
    public void testCrearBonos() {
        System.out.println("crearBonos");
        Venta instance = null;
        instance.crearBonos();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of informarVendedor method, of class Venta.
     */
    //No tengo ni idea de como enfocar este testInformarVendedor quizas deberían de ser privates??
    @Test
    public void testInformarVendedor() {
        System.out.println("informarVendedor");
        Libro libro = l;
        Bono bono = null;
        Venta instance = null;
        instance.informarVendedor(libro, bono);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
