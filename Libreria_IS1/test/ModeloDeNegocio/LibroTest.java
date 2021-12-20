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
public class LibroTest {

    private Date fecha;
    private Vendedor v;
    private Libro l;

    public LibroTest() {
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
        l = new Libro(85, "libro1", "1111-A", 15.1F, 3.5F, fecha, v);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Libro.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Libro instance = l;
        int expResult = 85;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Libro.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 75;
        Libro instance = l;
        instance.setId(id);
        assertEquals(id, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = l;
        String expResult = "libro1";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "libro2";
        Libro instance = l;
        instance.setTitulo(titulo);
        assertEquals(titulo, instance.getTitulo());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getISBN method, of class Libro.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Libro instance = l;
        String expResult = "1111-A";
        String result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setISBN method, of class Libro.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String iSBN = "2222-B";
        Libro instance = l;
        instance.setISBN(iSBN);
        assertEquals(instance.getISBN(), iSBN);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioInicial method, of class Libro.
     */
    @Test
    public void testGetPrecioInicial() {
        System.out.println("getPrecioInicial");
        Libro instance = l;
        float expResult = 15.1F;
        float result = instance.getPrecioInicial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioInicial method, of class Libro.
     */
    @Test
    public void testSetPrecioInicial() {
        System.out.println("setPrecioInicial");
        float precioInicial = 25.8F;
        Libro instance = l;
        instance.setPrecioInicial(precioInicial);
        assertEquals(precioInicial, instance.getPrecioInicial(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioMinimo method, of class Libro.
     */
    @Test
    public void testGetPrecioMinimo() {
        System.out.println("getPrecioMinimo");
        Libro instance = l;
        float expResult = 3.5F;
        float result = instance.getPrecioMinimo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioMinimo method, of class Libro.
     */
    @Test
    public void testSetPrecioMinimo() {
        System.out.println("setPrecioMinimo");
        float precioMinimo = 7.5F;
        Libro instance = l;
        instance.setPrecioMinimo(precioMinimo);
        assertEquals(precioMinimo, instance.getPrecioMinimo(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaAlta method, of class Libro.
     */
    @Test
    public void testGetFechaAlta() {
        System.out.println("getFechaAlta");
        Libro instance = l;
        Date expResult = fecha;
        Date result = instance.getFechaAlta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaAlta method, of class Libro.
     */
    @Test
    public void testSetFechaAlta() {
        System.out.println("setFechaAlta");
        Date fechaAlta = fecha;
        Libro instance = l;
        instance.setFechaAlta(fechaAlta);
        assertEquals(fechaAlta, instance.getFechaAlta());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaBaja method, of class Libro.
     */
    @Test
    public void testGetFechaBaja() {
        System.out.println("getFechaBaja");
        Libro instance = l;
        Date expResult = fecha;
        Date result = instance.getFechaBaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaBaja method, of class Libro.
     */
    @Test
    public void testSetFechaBaja() {
        System.out.println("setFechaBaja");
        Date fechaBaja = fecha;
        Libro instance = l;
        instance.setFechaBaja(fechaBaja);
        assertEquals(fechaBaja, instance.getFechaBaja());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Libro.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Libro instance = l;
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Libro.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 5;
        Libro instance = l;
        instance.setEstado(estado);
        assertEquals(estado, instance.getEstado());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Libro.
     */
    @Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        Libro instance = l;
        Vendedor expResult = v;
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Libro.
     */
    @Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor vendedor =new Vendedor("22222222-A", "nombre2", "apellido2", 222222222, "prueba2@gmail.com");
        Libro instance = l;
        instance.setVendedor(vendedor);
        assertEquals(vendedor, instance.getVendedor());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
