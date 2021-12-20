package ModeloDeNegocio;

import java.util.*;

public class Controladora {

    private Libreria lib;
    private Venta ventaActual;
    private Vendedor vendedorActual;

    public Controladora(Libreria lib) {
        this.lib = lib; //Capacidad para 100 libros, por ejemplo
        this.cargaDatos();
    }

    public boolean anadirVendedor(String dni, String nombre, String apellidos, long telefono, String email) {
        Vendedor v = new Vendedor(dni, nombre, apellidos, telefono, email);
        //this.vendedorActual=v;
        return this.lib.vendedorNuevo(v);
    }

    public boolean asociarVendedor(String dni) {
        boolean encontrado = false;
        this.vendedorActual = this.lib.asociarVendedor(dni);
        if (vendedorActual != null) {
            encontrado = true;
        }

        return encontrado;
    }

    public boolean anadirLibro(String titulo, String ISBN, float precioInicial, float precioMinimo) {
        //Cuidado con si la lista esta vacia y es el primer libro
//        int sigId = this.lib.getListaLibros().get(this.lib.getListaLibros().size()).getId() + 1;
        int sigId = this.lib.getListaLibros().size() + 1;
        Date fechaAlta = new Date();
        Libro libro = new Libro(sigId, titulo, ISBN, precioInicial, precioMinimo, fechaAlta, this.vendedorActual);
        return this.lib.libroNuevo(libro);
    }

    public void crearVenta() {
        //Cuidado con si la lista esta vacia y es la primera venta
//        int sigId = this.lib.getListaVentas().get(this.lib.getListaVentas().size()-1).getId() + 1;
        int sigId = this.lib.getListaVentas().size() + 1;
        ventaActual = new Venta(sigId, new Date());
        System.out.println("Se ha iniciado una nueva Venta con ID " + this.ventaActual.getId() + " y con fecha " + this.ventaActual.getFecha());
    }

    public boolean addLibroVenta(int id, float precioFinal) {
        Libro libro = this.lib.buscarLibro(id);
        boolean ok = true;
        if (libro == null) //Si no encuentro el libro, no ok
        {
            ok = false;
        } else {
            ok = this.ventaActual.anadirLinea(precioFinal, libro);
        }

        return ok;
    }

    public void confirmarVenta() {
        this.ventaActual.confirmarVenta();
        List<String> emails = new ArrayList<String>();
    }

    public boolean bajaLibro(int id) {
        return this.lib.bajaLibro(id);
    }

    public List<Libro> listadoLibrosAlfabeticamente() {
        return this.lib.listadoLibrosAlfabeticamente();
    }

    public List<Libro> listadoLibrosAntiguos() {
        return this.lib.listadoLibrosAntiguos();
    }

    void cargaDatos() {
        // Dos vendedores.
        anadirVendedor("111111", "Julia", "Rodriguez", 654789877, "jrodriguez@mail.com");
        anadirVendedor("222222", "Lara", "Jimenez", 764547748, "larita@mail.com");

        // Tres depósitos de libros, con uno, dos y tres libros, respectivamente. Los dos primeros 
        // correspondientes a un vendedor, y el depósito de tres libros asignado al otro vendedor.
        //Alta de 1 y 2 libros asociados al primer vendedor
        this.asociarVendedor("111111");
        this.anadirLibro("Harry Potter y la piedra filosofal", "1234-123-123", 12, 10); // id 1
        this.anadirLibro("Fairy Oak", "1234-123-124", 10, 10); // id 2
        this.anadirLibro("Orgullo y prejuicio", "1234-123-125", 18, 15); // id 3

        //Alta de 3 libros asociados al segundo vendedor
        this.asociarVendedor("222222");
        this.anadirLibro("Peppa pig", "1234-123-133", 12, 10); // id 4
        this.anadirLibro("Star Wars", "1234-123-134", 15, 10); // id 5
        this.anadirLibro("Los pilares de la Tierra", "1234-123-135", 20, 18); // id 6

        //Dos ventas, una con un libro y otra con dos.
        this.crearVenta(); //Venta con 1 libro
        this.addLibroVenta(3, 16);
        this.confirmarVenta();

        this.crearVenta(); //Venta con 2 libros
        this.addLibroVenta(2, 12);
        this.addLibroVenta(4, 10);
        this.confirmarVenta();

        // Dos retiradas de libros, una por cada vendedor, una de solo un libro y otra de dos.
        this.bajaLibro(1); //Baja libro 1 del primero vendedor
        this.bajaLibro(5); //Baja libro 5 del segundo vendedor
        this.bajaLibro(6); //Baja libro 6 del segundo vendedor
    }

    //Necesitamos para poder comprobar el resultado con los test
    public Venta getVenta() {
        return this.ventaActual;
    }

    public boolean consultarVendedor(String dni) {
        boolean encontrado = false;
        Vendedor v = this.lib.asociarVendedor(dni);
        if (v != null) {
            v.toString();
            encontrado = true;
        }
        return encontrado;
    }

}
