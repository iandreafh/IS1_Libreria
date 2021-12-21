package ModeloDeNegocio;

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

        //Esto no hace referencia a las ID de listaLDV, sino que hace referencia a su propia ID
        //if(this.listaLdv.isEmpty())
        //	id = 0;
        //else
        //id = this.listaLdv.get(this.listaLdv.size()).getId() + 1;
        id = getId();
        setId(id);

        return id;
    }

    /**
     * *
     * Metodo que anade una linea de venta a la venta actual
     *
     * @param precioFinal precio final del libro a vender
     * @param libro instancia del libro
     * @return
     */
    public boolean anadirLinea(float precioFinal, Libro libro) {
        LineaVenta nueva = new LineaVenta(sigId(), precioFinal, libro);
        this.precioTotal += precioFinal;
        return this.listaLdv.add(nueva);
    }

    /**
     * *
     * Metodo que genera los bonos una vez confirmada la venta y actualiza el
     * estado de los libros a vendido
     */
    public void confirmarVenta() {
        crearBonos();
    }

    /**
     * *
     * Genera los bonos asociados a cada linea de venta
     */
    private void crearBonos() {
        Vendedor v;
        float cantidad;
        //Por cada linea de venta, creo un bono e informo al vendedor
        for (int i = 0; i < this.listaLdv.size(); i++) {
            v = this.listaLdv.get(i).getLibro().getVendedor();
            // Actualizo el estado a vendido (1)
            this.listaLdv.get(i).getLibro().setEstado(1);

            cantidad = (float) (this.listaLdv.get(i).getPrecioFinal() * 0.85);

            int sigId = v.getListaBonos().size() + 1;
            Bono nuevo = new Bono(sigId, cantidad, v);
            this.listaLdv.get(i).setBono(nuevo);
            v.anadirBono(nuevo);
            informarVendedor(this.listaLdv.get(i).getLibro(), nuevo, this.listaLdv.get(i).getPrecioFinal());
        }
    }

    /**
     * *
     * Metodo que informa al vendedor de la venta y generacion del bono a su
     * favor
     *
     * @param libro libro vendido
     * @param bono bono generado a favor del vendedor
     */
    private void informarVendedor(Libro libro, Bono bono, float precioFinal) {
        String email = bono.getVendedor().getEmail();
        String mensaje = "\n Buenas, " + bono.getVendedor().getNombre();
        mensaje += "\nLe informamos que su libro " + libro.getTitulo() + " registrado el dia " + libro.getFechaAlta() + " se ha vendido por " + precioFinal + " euros."
                + "\nTiene un nuevo bono de " + bono.getCantidad() + " euros a su disposicion. En total ya lleva " + bono.getVendedor().getListaBonos().size() + " bonos."
                + "\n Gracias por utilizar nuestros servicios, La Libreria.";

        //Se enviaria el mensaje a ese email
        System.out.println(mensaje);
    }

    public String toString() {
        String message = "\nResumen de la venta: "
                + "\n Cantidad de libros: " + this.listaLdv.size()
                + "\n Precio total: " + this.precioTotal +'\n';

        return message;
    }

}
