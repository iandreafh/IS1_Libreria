import java.util.*;

public class Venta {
	
	private int id;
	private Date fecha;
	private double precioTotal;
	private List<LineaVenta> listaLdv;
	
	
	public Venta(int id, Date fecha) {
		this.id = id;
		this.fecha = fecha;
		this.precioTotal = 0;
		this.listaLdv = new ArrayList<LineaVenta>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}


	public List<LineaVenta> getListaLdv() {
		return listaLdv;
	}


	public void setListaLdv(List<LineaVenta> listaLdv) {
		this.listaLdv = listaLdv;
	}
	
	
	private int sigId() {
		int id;
		if(this.listaLdv.isEmpty())
			id = 0;
		else
			id = this.listaLdv.get(this.listaLdv.size()).getId() + 1;
			
		return id;
	}
	
	public void añadirLinea(float precioFinal, Libro libro) {
		LineaVenta nueva = new LineaVenta(sigId(), precioFinal, libro);
		this.listaLdv.add(nueva);
	}
	
	public void confirmarVenta() {
		crearBonos();
	}
	
	public void crearBonos() {
		Vendedor v;
		float cantidad;
		//Por cada linea de venta, creo un bono
		for(int i = 0; i < this.listaLdv.size(); i++) {
			v = this.listaLdv.get(i).getLibro().getVendedor();
			cantidad = (float) (this.listaLdv.get(i).getPrecioFinal() * 0.15);
			
			//Hay que ver que hacemos con el id del bono, por defecto 1
			Bono nuevo = new Bono(1, cantidad, v);
			this.listaLdv.get(i).setBono(nuevo);
			v.añadirBono(nuevo);
		}
	}

}
