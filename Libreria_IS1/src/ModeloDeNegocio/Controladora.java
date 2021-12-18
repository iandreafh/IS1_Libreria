package ModeloDeNegocio;
import ModeloDeNegocio.Libreria;

import java.util.*;

public class Controladora {
	
	private Libreria lib;
	private Venta ventaActual;
	
	public Controladora() {
		this.lib = new Libreria(100); //Capacidad para 100 libros, por ejemplo
	}
        

	//Habria que a�adir todos los metodos de la controladora
        //He cambiado lo que devuelve de boolean a Vendedor
	public Vendedor anadirVendedor(String dni, String nombre, String apellidos, long telefono, String email) {
		Vendedor v = new Vendedor(dni, nombre, apellidos, telefono, email);
		return v;
	}
	
	public boolean asociarVendedor(String dni) {
		boolean encontrado = false;
		Vendedor v = this.lib.asociarVendedor(dni);
		if(v != null)
			encontrado = true;
		
		return encontrado;
	}
	
	public boolean anadirLibro(int id, String titulo, String ISBN, float precioInicial, float precioMinimo, Date fechaAlta,
			Date fechaBaja, int estado, Vendedor vendedor) {
		//Cuidado con si la lista esta vacia y es el primer libro
		int sigId = this.lib.getListaLibros().get(this.lib.getListaLibros().size()).getId() + 1;
		Libro libro = new Libro(sigId, titulo, ISBN, precioInicial, precioMinimo, fechaAlta, fechaBaja, estado, vendedor);
		return this.lib.LibroNuevo(libro);
	}
	
	public void crearVenta() {
		//Cuidado con si la lista esta vacia y es la primera venta
		int sigId = this.lib.getListaVentas().get(this.lib.getListaVentas().size()).getId() + 1;
		ventaActual = new Venta(sigId, new Date());
	}
	
	public boolean addLibro(int id, float precioFinal) {
		Libro libro = this.lib.buscarLibro(id);
		boolean ok = true;
		if(libro == null) //Si no encuentro el libro, no ok
			ok = false;
		else
			ok = this.ventaActual.anadirLinea(precioFinal, libro);
		
		return ok;
	}
	
	public void confirmarVenta() {
		this.ventaActual.confirmarVenta();
		List<String> emails = new ArrayList<String>();
	}
	
	//Este metodo no haria falta, hay que borrarlo, ya que se hace automatico al crear el bono
	public List<String> informarVendedores() {
		List<String> emails = new ArrayList<String>();
		
		for(int i = 0; i < this.ventaActual.getListaLdv().size(); i++) {
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
	
}
	

