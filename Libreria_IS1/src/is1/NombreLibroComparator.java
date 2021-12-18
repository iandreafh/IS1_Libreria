/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is1;

import java.util.Comparator;

/**
 *
 * @author mariavaro
 */
public class NombreLibroComparator implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareTo(l2.getTitulo());
    }

}
