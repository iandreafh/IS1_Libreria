
public class Bono {
	
	private int id;
	private float cantidad;
	private Vendedor vendedor;
	
	public Bono(int id, float cantidad, Vendedor vendedor) {
		this.id = id;
		this.cantidad = cantidad;
		this.vendedor = vendedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	

}
