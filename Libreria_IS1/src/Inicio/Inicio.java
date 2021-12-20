package Inicio;
import Vista.Pantalla;
import ModeloDeNegocio.Controladora;
import ModeloDeNegocio.Libreria;
/**
 *
 * @author pablo
 */
public class Inicio {

    public static void main(String[] args) {
        Libreria lib = new Libreria(100);
        Controladora c = new Controladora(lib);
        Pantalla p = new Pantalla(c);
        
        p.mostrarOpciones();
    }
}
