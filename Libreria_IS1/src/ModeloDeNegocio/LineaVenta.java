package ModeloDeNegocio;

import java.util.*;

public class LineaVenta {

    private int id;
    private float precioFinal;
    private Libro libro;
    private Bono bono;

    public LineaVenta(int id, float precioFinal, Libro libro) {
        this.id = id;
        this.precioFinal = precioFinal;
        this.libro = libro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

}
