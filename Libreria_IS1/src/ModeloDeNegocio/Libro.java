package ModeloDeNegocio;

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

    public Libro(int id, String titulo, String ISBN, float precioInicial, float precioMinimo, Date fechaAlta, Vendedor vendedor) {
        this.id = id;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.precioInicial = precioInicial;
        this.precioMinimo = precioMinimo;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = null;
        this.estado = 0; //Por defecto un nuevo libro esta en exposicion
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
    
    public String toString(){
        String factura="Datos del libro actual:\n\t ID: "+this.id
                +"\n\t Título: "+this.titulo
                +"\n\t ISBN: "+this.ISBN
                +"\n\t Precio Inicial: "+this.precioInicial
                +"\n\t Precio Minimo: "+this.precioMinimo
                +"\n\t Vendedor: "+this.vendedor.getNombre()+" "+this.vendedor.getApellidos()
                +"\n\t Estado: "+(estado==0?"En exposición":(estado==1?"Vendido":"De baja"));
        
        return factura;
    }
}
