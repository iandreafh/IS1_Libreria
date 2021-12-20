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
public class LibreriaTest {

    private int capacidadLibros;
    private List<Libro> listaLibros = new ArrayList<Libro>();
    private List<Venta> listaVentas = new ArrayList<Venta>();
    private List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
    private Libreria libreria;
    private Vendedor vendedor1;
    private Vendedor vendedor2;
    private Libro libro1;
    private Libro libro2;

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

        Date fecha = new Date();

        capacidadLibros = 100;
        vendedor1 = new Vendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        vendedor2 = new Vendedor("22222222-B", "nombre2", "apellido2", 222222222, "prueba2@gmail.com");

        listaVendedores.add(vendedor1);
        listaVendedores.add(vendedor2);

        libro1 = new Libro(85, "libro1", "1111-A", 15.1F, 3.5F, fecha, 0, vendedor1);
        libro2 = new Libro(95, "libro2", "1111-B", 1.1F, 0.5F, fecha, 0, vendedor2);

        listaLibros.add(libro1);
        listaLibros.add(libro2);

        Venta venta1 = new Venta(1, fecha);
        Venta venta2 = new Venta(2, fecha);

        listaVentas.add(venta1);
        listaVentas.add(venta2);

        libreria = new Libreria(capacidadLibros);

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
        Libreria instance = libreria;
        int expResult = 100;
        int result = instance.getCapacidadLibros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidadLibros method, of class Libreria.
     */
    @Test
    public void testSetCapacidadLibros() {
        System.out.println("setCapacidadLibros");
        int capacidadLibros = 75;
        Libreria instance = libreria;
        instance.setCapacidadLibros(capacidadLibros);
        assertEquals(instance.getCapacidadLibros(), capacidadLibros);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaLibros method, of class Libreria.
     */
    @Test
    public void testGetListaLibros() {
        System.out.println("getListaLibros");
        Libreria instance = libreria;
        List<Libro> expResult = listaLibros;
        libreria.setListaLibros(listaLibros);
        List<Libro> result = instance.getListaLibros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaLibros method, of class Libreria.
     */
    @Test
    public void testSetListaLibros() {
        System.out.println("setListaLibros");
        List<Libro> listaLibros = this.listaLibros;
        Libreria instance = libreria;
        instance.setListaLibros(listaLibros);
        assertEquals(instance.getListaLibros(), listaLibros);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaVentas method, of class Libreria.
     */
    @Test
    public void testGetListaVentas() {
        System.out.println("getListaVentas");
        Libreria instance = libreria;
        List<Venta> expResult = listaVentas;
        libreria.setListaVentas(listaVentas);
        List<Venta> result = instance.getListaVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaVentas method, of class Libreria.
     */
    @Test
    public void testSetListaVentas() {
        System.out.println("setListaVentas");
        List<Venta> listaVentas = this.listaVentas;
        Libreria instance = libreria;
        instance.setListaVentas(listaVentas);
        assertEquals(instance.getListaVentas(), listaVentas);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaVendedores method, of class Libreria.
     */
    @Test
    public void testGetListaVendedores() {
        System.out.println("getListaVendedores");
        Libreria instance = libreria;
        List<Vendedor> expResult = listaVendedores;
        libreria.setListaVendedores(listaVendedores);
        List<Vendedor> result = instance.getListaVendedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaVendedores method, of class Libreria.
     */
    @Test
    public void testSetListaVendedores() {
        System.out.println("setListaVendedores");
        List<Vendedor> listaVendedores = this.listaVendedores;
        Libreria instance = libreria;
        instance.setListaVendedores(listaVendedores);
        assertEquals(instance.getListaVendedores(), listaVendedores);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of VendedorNuevo method, of class Libreria.
     */
    @Test
    public void testVendedorNuevo() {
        System.out.println("VendedorNuevo");
        Vendedor v = vendedor1;
        Libreria instance = libreria;      
        boolean expResult = true;
        boolean result = instance.vendedorNuevo(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of asociarVendedor method, of class Libreria.
     */
    @Test
    public void testAsociarVendedor() {
        System.out.println("asociarVendedor");
        String dni = "11111111-A";
        Libreria instance = libreria;
        instance.setListaVendedores(listaVendedores);
        Vendedor expResult = vendedor1;
        Vendedor result = instance.asociarVendedor(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LibroNuevo method, of class Libreria.
     */
    @Test
    public void testLibroNuevo() {
        System.out.println("LibroNuevo");
        Libro libro = libro1;
        Libreria instance = libreria;
        instance.libroNuevo(libro1);
        boolean expResult = true;
        boolean result = instance.libroNuevo(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLibro method, of class Libreria.
     */
    @Test
    public void testDeleteLibro() {
        System.out.println("deleteLibro");
        int id = 85;
        Libreria instance = libreria;
        instance.setListaLibros(listaLibros);
        instance.deleteLibro(id);
        boolean expResult = true;
        boolean result = instance.deleteLibro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class Libreria.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        int id = 95;
        Libreria instance = libreria;
        instance.setListaLibros(listaLibros);
        Libro expResult = libro2;
        Libro result = instance.buscarLibro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listadoLibrosAlfabeticamente method, of class Libreria.
     */
    @Test
    public void testListadoLibrosAlfabeticamente() {
        System.out.println("listadoLibrosAlfabeticamente");
        Libreria instance = libreria;
        instance.setListaLibros(listaLibros);
        List<Libro> expResult = listaLibros;
        List<Libro> result = instance.listadoLibrosAlfabeticamente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listadoLibrosAntiguos method, of class Libreria.
     */
    @Test
    public void testListadoLibrosAntiguos() {
        System.out.println("listadoLibrosAntiguos");
        Libreria instance = libreria;
        instance.setListaLibros(listaLibros);
        List<Libro> expResult = listaLibros;
        List<Libro> result = instance.listadoLibrosAntiguos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
