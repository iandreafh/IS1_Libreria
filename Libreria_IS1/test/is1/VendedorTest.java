/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package is1;

import java.util.ArrayList;
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
public class VendedorTest {

    private Vendedor vendedor;

    public VendedorTest() {
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

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDni method, of class Vendedor.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Vendedor instance = vendedor;
        String expResult = "11111111-A";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Vendedor.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String dni = "22222222-A";
        Vendedor instance = vendedor;
        instance.setDni(dni);
        assertEquals(instance.getDni(), dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Vendedor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Vendedor instance = vendedor;
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Vendedor.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nombre2";
        Vendedor instance = vendedor;
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Vendedor.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Vendedor instance = vendedor;
        String expResult = "apellido1";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Vendedor.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Vendedor instance = vendedor;
        instance.setApellidos(apellidos);
        assertEquals(apellidos, instance.getApellidos());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Vendedor.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Vendedor instance = vendedor;
        long expResult = 111111111L;
        long result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Vendedor.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        long telefono = 111111111L;
        Vendedor instance = vendedor;
        instance.setTelefono(telefono);
        assertEquals(telefono, instance.getTelefono());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Vendedor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Vendedor instance = vendedor;
        String expResult = "prueba@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Vendedor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "prueba2@gmail.com";
        Vendedor instance = vendedor;
        instance.setEmail(email);
        assertEquals(email, instance.getEmail());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaBonos method, of class Vendedor.
     */
    @Test
    public void testGetListaBonos() {
        System.out.println("getListaBonos");
        Vendedor instance = vendedor;
        List<Bono> expResult = new ArrayList<>();
        Bono bono1 = new Bono(10, 1, vendedor);
        expResult.add(bono1);
        vendedor.anadirBono(bono1);
        List<Bono> result = instance.getListaBonos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaBonos method, of class Vendedor.
     */
    @Test
    public void testSetListaBonos() {
        System.out.println("setListaBonos");
        List<Bono> listaBonos = new ArrayList<>();
        Bono bono1 = new Bono(10, 1, vendedor);
        listaBonos.add(bono1);
        Vendedor instance = vendedor;
        instance.setListaBonos(listaBonos);
        assertEquals(listaBonos, instance.getListaBonos());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class Vendedor.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        String dni = "22222222-A";
        String nombre = "nombre2";
        String apellidos = "apellido2";
        long telefono = 222222222L;
        String email = "prueba2@gmail.com";
        Vendedor instance = vendedor;
        instance.modificar(dni, nombre, apellidos, telefono, email);
        assertEquals(dni, instance.getDni());
        assertEquals(nombre, instance.getNombre());
        assertEquals(apellidos, instance.getApellidos());
        assertEquals(telefono, instance.getTelefono());
        assertEquals(email, instance.getEmail());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of anadirBono method, of class Vendedor.
     */
    @Test
    public void testAnadirBono() {
        System.out.println("anadirBono");
        Bono bono1 = new Bono(10, 1, vendedor);
        Vendedor instance = vendedor;
        boolean expResult = true;
        boolean result = instance.anadirBono(bono1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
