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
	
	public int getCapacidadLibros() {
		return this.capacidadLibros;
	}
	
	public void setCapacidadLibros(int capacidadLibros) {
		this.capacidadLibros = capacidadLibros;
	}
	
	public void VendedorNuevo(Vendedor v) {
		this.listaVendedores.add(v);
	}
	
	public Vendedor asociarVendedor(String dni) {
		Vendedor v = null;
		for(int i = 0; i < this.listaVendedores.size(); i++) {
			if(this.listaVendedores.get(i).getDni().equals(dni))
				v = this.listaVendedores.get(i);
		}
		
		return v;
	}
	
	public void LibroNuevo(Libro libro) {
		this.listaLibros.add(libro);
	}
	
	//Metodo que actualiza el estado del libro para ponerlo de baja
	public boolean deleteLibro(int id) {
		boolean encontrado = false;
		for(int i = 0; i < this.listaLibros.size(); i++) {
			if(this.listaLibros.get(i).getId() == id) {
				this.listaLibros.get(i).setEstado(-1); // Estado -1 es no disponible, 0 en exposicion, 1 ya vendido
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	//Habria que hacer el comparator para utilizarlo en el sort de ArrayList
	public List<Libro> listadoLibrosAlfabeticamente() {
		List<Libro> listado = new ArrayList<Libro>();
		
		return listado;
	}
	
	//Habria que hacer el comparator para utilizarlo en el sort de ArrayList
	public List<Libro> listadoLibrosAntiguos() {
		List<Libro> listado = new ArrayList<Libro>();
		
		return listado;
	}

}
