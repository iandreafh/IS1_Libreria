package ModeloDeNegocio;

import java.util.*;

public class Controladora {

    private Libreria lib;
    private Venta ventaActual;
    private Vendedor vendedorActual;

    public Controladora(Libreria lib) {
        this.lib = lib; //Capacidad para 100 libros, por ejemplo
        cargaDatos();
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

    public boolean anadirLibro(String titulo, String ISBN, float precioInicial, float precioMinimo, int estado) {
        //Cuidado con si la lista esta vacia y es el primer libro
//        int sigId = this.lib.getListaLibros().get(this.lib.getListaLibros().size()).getId() + 1;
        int sigId = this.lib.getListaLibros().size() + 1;
        Date fechaAlta = new Date();
        Libro libro = new Libro(sigId, titulo, ISBN, precioInicial, precioMinimo, fechaAlta, estado, this.vendedorActual);
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

    //Este metodo no haria falta, hay que borrarlo, ya que se hace automatico al crear el bono
    public List<String> informarVendedores() {
        List<String> emails = new ArrayList<String>();

        for (int i = 0; i < this.ventaActual.getListaLdv().size(); i++) {
            emails.add(this.ventaActual.getListaLdv().get(i).getLibro().getVendedor().getEmail());
        }

        return emails;
    }

    public boolean deleteLibro(int id) {
        return this.lib.deleteLibro(id);
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

//        this.anadirLibro("Harry Potter y la piedra filosofal", "9780807286005", 20, 15, new Date(),
//            null, 0, )
        // Tres depósitos de libros, con uno, dos y tres libros, respectivamente. Los dos primeros 
        // correspondientes a un vendedor, y el depósito de tres libros asignado al otro vendedor.
        //Dos ventas, una con un libro y otra con dos.
        // Dos retiradas de libros, una por cada vendedor, una de solo un libro y otra de dos.
    }

    //Necesitamos para poder comprobar el resultado con los test
    public Venta getVenta() {
        return this.ventaActual;
    }

}
