import java.util.*;

public class Libro {
	
	private int id;
	private String titulo;
	private String ISBN;
	private float precioInicial;
	private float precioMinimo;
	private Date fechaAlta;
	private Date fechaBaja;
	private int estado;
	private Vendedor vendedor;
	

	public Libro(int id, String titulo, String ISBN, float precioInicial, float precioMinimo, Date fechaAlta,
			Date fechaBaja, int estado, Vendedor vendedor) {
		this.id = id;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.precioInicial = precioInicial;
		this.precioMinimo = precioMinimo;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.estado = estado;
		this.vendedor = vendedor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public float getPrecioInicial() {
		return precioInicial;
	}


	public void setPrecioInicial(float precioInicial) {
		this.precioInicial = precioInicial;
	}


	public float getPrecioMinimo() {
		return precioMinimo;
	}


	public void setPrecioMinimo(float precioMinimo) {
		this.precioMinimo = precioMinimo;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public Date getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
	

}
