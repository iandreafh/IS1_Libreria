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
public class ControladoraTest {

    private Venta ventaActual;
    private int capacidadLibros;
    private List<Libro> listaLibros = new ArrayList<Libro>();
    private List<Venta> listaVentas = new ArrayList<Venta>();
    private List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
    private Libreria libreria;
    private Vendedor vendedor1;
    private Vendedor vendedor2;
    private Libro libro1;
    private Libro libro2;

    public ControladoraTest() {
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

        libro1 = new Libro(85, "libro1", "1111-A", 15.1F, 3.5F, fecha, vendedor1);
        libro2 = new Libro(95, "libro2", "1111-B", 1.1F, 0.5F, fecha, vendedor2);

        listaLibros.add(libro1);
        listaLibros.add(libro2);

        Venta venta1 = new Venta(1, fecha);
        Venta venta2 = new Venta(2, fecha);

        listaVentas.add(venta1);
        listaVentas.add(venta2);

        libreria = new Libreria(capacidadLibros);
        libreria.setListaLibros(listaLibros);
        libreria.setListaVendedores(listaVendedores);
        libreria.setListaVentas(listaVentas);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of anadirVendedor method, of class Controladora.
     */
    @Test
    public void testAnadirVendedor() {
        System.out.println("anadirVendedor");
        String dni = "11111111-X";
        String nombre = "nombre";
        String apellidos = "apellido1";
        long telefono = 111111111L;
        String email = "prueba@gmail.com";
        Controladora instance = new Controladora(libreria);
        boolean expResult = true;
        boolean result = instance.anadirVendedor(dni, nombre, apellidos, telefono, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of asociarVendedor method, of class Controladora.
     */
    @Test
    public void testAsociarVendedor() {
        System.out.println("asociarVendedor");
        String dni = "11111111-A";
        Controladora instance = new Controladora(libreria);
        instance.anadirVendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");
        boolean expResult = true;
        boolean result = instance.asociarVendedor(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of anadirLibro method, of class Controladora.
     */
    @Test
    public void testAnadirLibro() {
        System.out.println("anadirLibro");
        String titulo = "libro1";
        String ISBN = "1111-A";
        float precioInicial = 15.1F;
        float precioMinimo = 3.5F;
        Controladora instance = new Controladora(libreria);

        //Usamos el metodo anadirVendedor para modificar el atributo vendedor de controladora y de esa forma se pasa como parametro de anadirLibro
        instance.anadirVendedor("11111111-A", "nombre", "apellido1", 111111111, "prueba@gmail.com");

        boolean expResult = true;
        boolean result = instance.anadirLibro(titulo, ISBN, precioInicial, precioMinimo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crearVenta method, of class Controladora.
     */
    @Test
    public void testCrearVenta() {
        System.out.println("crearVenta");
        Controladora instance = new Controladora(libreria);
        instance.crearVenta();

        Venta expresult = new Venta(3, new Date());
        Venta result = instance.getVenta();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addLibro method, of class Controladora.
     */
    @Test
    public void testAddLibroVenta() {
        System.out.println("addLibro");     
        float precioFinal = 150.1F;
        Controladora instance = new Controladora(libreria);
        boolean expResult = true;
        int id = this.libro1.getId();

        //Tenemos que crear una venta actual para poder ejecutar el incluirLibro
        instance.crearVenta();
        boolean result = instance.addLibroVenta(id, precioFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarVenta method, of class Controladora.
     */
    @Test
    public void testConfirmarVenta() {
        System.out.println("confirmarVenta");
        Controladora instance = new Controladora(libreria);
        instance.confirmarVenta();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bajaLibro method, of class Controladora.
     */
    @Test
    public void testBajaLibro() {
        System.out.println("deleteLibro");
        int id = this.libro1.getId();
        Controladora instance = new Controladora(libreria);

        boolean expResult = true;
        boolean result = instance.bajaLibro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listadoLibrosAlfabeticamente method, of class Controladora.
     */
    @Test
    public void testListadoLibrosAlfabeticamente() {
        System.out.println("listadoLibrosAlfabeticamente");
        Controladora instance = new Controladora(libreria);
        
        int expResult = 10; //Los 8 libros creados en cargaDatos mas 2 de test
        int result = instance.listadoLibrosAlfabeticamente().size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listadoLibrosAntiguos method, of class Controladora.
     */
    @Test
    public void testListadoLibrosAntiguos() {
        System.out.println("listadoLibrosAntiguos");
        Controladora instance = new Controladora(libreria);

        int expResult = 6;
        int result = instance.listadoLibrosAntiguos().size();
        assertEquals(expResult, result);
    }

}
