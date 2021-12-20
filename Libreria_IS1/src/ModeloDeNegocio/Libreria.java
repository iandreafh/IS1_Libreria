package ModeloDeNegocio;

import java.util.*;

public class Libreria {

    private int capacidadLibros;
    private List<Libro> listaLibros;
    private List<Venta> listaVentas;
    private List<Vendedor> listaVendedores;

    public Libreria(int capacidadLibros) {
        this.capacidadLibros = capacidadLibros;
        this.listaLibros = new ArrayList<Libro>();
        this.listaVentas = new ArrayList<Venta>();
        this.listaVendedores = new ArrayList<Vendedor>();
    }

    /**
     * *
     * Devuelve la capacidad de la libreria
     *
     * @return
     */
    public int getCapacidadLibros() {
        return this.capacidadLibros;
    }

    /**
     * *
     * Set de la capacidad maxima de la libreria
     *
     * @param capacidadLibros
     */
    public void setCapacidadLibros(int capacidadLibros) {
        this.capacidadLibros = capacidadLibros;
    }

    /**
     * *
     * Metodo que devuelve todos los libros en la libreria
     *
     * @return Lista de libros en la libreria
     */
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * *
     *
     * @param listaLibros
     */
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * *
     * Metodo que devuelve todas las ventas de la libreria
     *
     * @return Lista de ventas de la libreria
     */
    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    /**
     * *
     *
     * @param listaVentas
     */
    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    /**
     * *
     * Metodo que devuelve la lista de los vendedores asociados a la libreria
     *
     * @return Lista de vendedores en la libreria
     */
    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    /**
     * *
     *
     * @param listaVendedores
     */
    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    /**
     * *
     * Da de alta un nuevo vendedor
     *
     * @param v Instancia de vendedor a dar de alta
     * @return true si el vendedor ha sido anadido a la lista de vendedores
     */
    public boolean vendedorNuevo(Vendedor v) {
        return this.listaVendedores.add(v);
    }

    //TODO: Este asociar vendedor no se que hace
    /**
     * *
     *
     * @param dni
     * @return
     */
    public Vendedor asociarVendedor(String dni) {
        Vendedor v = null;
        for (int i = 0; i < this.listaVendedores.size(); i++) {
            if (this.listaVendedores.get(i).getDni().equals(dni)) {
                v = this.listaVendedores.get(i);
            }
        }

        return v;
    }

    /**
     * *
     * Metodo que anade un libro nuevo a la libreria
     *
     * @param libro Instancia de libro a anadir
     * @return True si el libro ha sido anadido a la libreria
     */
    public boolean libroNuevo(Libro libro) {
        return this.listaLibros.add(libro);
    }

    /**
     * *
     * Metodo que actualiza el estado del libro para darlo de baja
     *
     * @param id del libro
     * @return devuelve true si el libro ha sido encontrado y dado de baja
     */
    public boolean bajaLibro(int id) {
        boolean encontrado = false;
        for (int i = 0; i < this.listaLibros.size(); i++) {
            if (this.listaLibros.get(i).getId() == id) {
                this.listaLibros.get(i).setEstado(-1); // Estado -1 es no disponible, 0 en exposicion, 1 ya vendido
                System.out.println("Doy de baja " + this.listaLibros.get(i).getTitulo());
                encontrado = true;
            }
        }

        return encontrado;
    }

    /**
     * *
     * Busca un libro por id
     *
     * @param id del libro a buscar
     * @return devuelve el objeto libro correspondiente
     */
    public Libro buscarLibro(int id) {
        Libro buscado = null;
        for (int i = 0; i < this.listaLibros.size(); i++) {
            if (this.listaLibros.get(i).getId() == id) {
                buscado = this.listaLibros.get(i);
            }
        }

        return buscado;
    }

    /**
     * *
     * Listado de libros alfabeticamente
     *
     * @return devuelve el listado de libros
     */
    public List<Libro> listadoLibrosAlfabeticamente() {
        List<Libro> listado = listaLibros;
        listado.sort(new NombreLibroComparator());
        return listado;
    }

    /**
     * *
     * Listado de libros ordenados por antiguedad en fecha de alta
     *
     * @return devuelve una lista de libros conteniendo los libros
     */
    public List<Libro> listadoLibrosAntiguos() {
        List<Libro> listado = new ArrayList<>();
        for (int i = 0; i < this.listaLibros.size(); i++) {
            //Si el libro esta en exposicion, lo añado
            if (this.listaLibros.get(i).getEstado() == 0) {
                listado.add(listaLibros.get(i));
            }
        }
        listado.sort(new FechaAltaComparator());
        return listado;
    }

}
