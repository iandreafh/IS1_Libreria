/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package is1;

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
public class LibreriaTest {

    public LibreriaTest() {
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
     * Test of getCapacidadLibros method, of class Libreria.
     */
    @Test
    public void testGetCapacidadLibros() {
        System.out.println("getCapacidadLibros");
        Libreria instance = new Libreria(100);
        int expResult = 100;
        int result = instance.getCapacidadLibros();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacidadLibros method, of class Libreria.
     */
    @Test
    public void testSetCapacidadLibros() {
        System.out.println("setCapacidadLibros");
        int capacidadLibros = 50;
        Libreria instance = new Libreria(100);
        instance.setCapacidadLibros(capacidadLibros);
//        assertEquals(expResult, result);
    }

    /**
     * Test of getListaLibros method, of class Libreria.
     */
    @Test
    public void testGetListaLibros() {
        System.out.println("getListaLibros");
        Libreria instance = null;
        List<Libro> expResult = null;
        List<Libro> result = instance.getListaLibros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaLibros method, of class Libreria.
     */
    @Test
    public void testSetListaLibros() {
        System.out.println("setListaLibros");
        List<Libro> listaLibros = null;
        Libreria instance = null;
        instance.setListaLibros(listaLibros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaVentas method, of class Libreria.
     */
    @Test
    public void testGetListaVentas() {
        System.out.println("getListaVentas");
        Libreria instance = null;
        List<Venta> expResult = null;
        List<Venta> result = instance.getListaVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaVentas method, of class Libreria.
     */
    @Test
    public void testSetListaVentas() {
        System.out.println("setListaVentas");
        List<Venta> listaVentas = null;
        Libreria instance = null;
        instance.setListaVentas(listaVentas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaVendedores method, of class Libreria.
     */
    @Test
    public void testGetListaVendedores() {
        System.out.println("getListaVendedores");
        Libreria instance = null;
        List<Vendedor> expResult = null;
        List<Vendedor> result = instance.getListaVendedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaVendedores method, of class Libreria.
     */
    @Test
    public void testSetListaVendedores() {
        System.out.println("setListaVendedores");
        List<Vendedor> listaVendedores = null;
        Libreria instance = null;
        instance.setListaVendedores(listaVendedores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VendedorNuevo method, of class Libreria.
     */
    @Test
    public void testVendedorNuevo() {
        System.out.println("VendedorNuevo");
        Vendedor v = null;
        Libreria instance = null;
        boolean expResult = false;
        boolean result = instance.VendedorNuevo(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asociarVendedor method, of class Libreria.
     */
    @Test
    public void testAsociarVendedor() {
        System.out.println("asociarVendedor");
        String dni = "";
        Libreria instance = null;
        Vendedor expResult = null;
        Vendedor result = instance.asociarVendedor(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LibroNuevo method, of class Libreria.
     */
    @Test
    public void testLibroNuevo() {
        System.out.println("LibroNuevo");
        Libro libro = null;
        Libreria instance = null;
        boolean expResult = false;
        boolean result = instance.LibroNuevo(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLibro method, of class Libreria.
     */
    @Test
    public void testDeleteLibro() {
        System.out.println("deleteLibro");
        int id = 0;
        Libreria instance = null;
        boolean expResult = false;
        boolean result = instance.deleteLibro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class Libreria.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        int id = 0;
        Libreria instance = null;
        Libro expResult = null;
        Libro result = instance.buscarLibro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listadoLibrosAlfabeticamente method, of class Libreria.
     */
    @Test
    public void testListadoLibrosAlfabeticamente() {
        System.out.println("listadoLibrosAlfabeticamente");
        Libreria instance = null;
        List<Libro> expResult = null;
        List<Libro> result = instance.listadoLibrosAlfabeticamente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listadoLibrosAntiguos method, of class Libreria.
     */
    @Test
    public void testListadoLibrosAntiguos() {
        System.out.println("listadoLibrosAntiguos");
        Libreria instance = null;
        List<Libro> expResult = null;
        List<Libro> result = instance.listadoLibrosAntiguos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
