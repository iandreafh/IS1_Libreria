/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import ModeloDeNegocio.Controladora;
import java.util.*;

/**
 *
 * @author pablo
 */
public class Pantalla {

    private Controladora controladora;

//    public Pantalla(Controladora controlador) {
//        this.controladora = controlador;
//    }
    public void mostrarOpciones() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        System.out.println("\nMENÚ PRINCIPAL:\n \t 1. Gestión de Libros \n\t 2. Gestión de Vendedores \n\t 3. Venta \n\n\t 0. Salir");

        opc = s.nextInt();
        if (opc < 0 || opc > 3) {
            System.out.println("La intruccion no esta reconocida");
        } else if (opc == 0) {
            finProceso();
        } else if (opc == 1) {
            gestionLibros();
        } else if (opc == 2) {
            gestionVendedores();
        }

//        do {
//            System.out.println("\n\n\n\tMenú Principal:\n");
//            System.out.println("\t1. Gestión de Almacen");
//            System.out.println("\t2. Gestión de Ventas");
//            System.out.println("\t3. Listar tienda completa");
//            System.out.println("\t---------------------");
//            System.out.println("\t\t0. Salir");
//            System.out.print("\n\n--> Introduzca una opción: ");
//            opc = s.nextInt();
//            while (opc < 0 || opc > 3) {
//                System.out.print("--> Introduzca una opción valida: ");
//                opc = s.nextInt();
//                System.out.println("\n");
//            }
//            if (opc != 0) {
//                realizarOpcion(opc);
//            }
//        } while (opc != 0);
    }

    private void finProceso() {
        System.out.println("Hasta pronto!");
    }

    private void gestionLibros() {
        System.out.println("\nMENÚ GESTION DE LIBROS: \t 1. Alta de Libro \n\t 2. Baja de Libro \n\t 3. Listado de Libros alfabéticamente \n\t 4. Listado de Libros por antigüedad \n\t 5. Listado de Libros vendidos \n\t 6. Listado de Libros retirados \n\t 0. Salir");

        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 0:
                finProceso();
                break;
            case 1:
                altaLibros();
                break;
            case 2:
                bajaLibros();
                break;
            case 3:
                listadoDeLibrosAlfabeticamente();
                break;
            case 4:
                listadoDeLibrosAntiguedad();
                break;
            case 5:
                listadoDeLibrosVendidos();
                break;
            case 6:
                listadoDeLibrosRetirados();
                break;
            default:
                System.out.println("Comando no valido");
                break;
        }

    }

    private void gestionVendedores() {
        System.out.println("\nMENÚ GESTIÓN VENDEDORES: \n\t 1. Alta Vendedor \n\t 2. Modificación Vendedor \n\t 0. Salir");

        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 0:
                finProceso();
                break;
            case 1:
                altaVendedor();
                break;
            case 2:
                modificarVendedor();
                break;
            default:
                System.out.println("Comando no valido");
                break;
        }

    }

    private void altaLibros() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el título del libro: ");
        String titulo = s.next();

        System.out.println("Introduzca el ISBN del libro: ");
        String ISBN = s.next();

        boolean operacion = controladora.anadirLibro(titulo, ISBN, 0, 0, 0);

        if (operacion == true) {
            System.out.println("Se completo la acción correctamente.");
        } else {
            System.out.println("No pudo completarse la acción.");
        }
    }

    public void bajaLibros() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el id del Libro a eliminar");
        int id = s.nextInt();

        boolean operacion = controladora.deleteLibro(id);

        if (operacion == true) {
            System.out.println("Se completo la acción correctamente.");
        } else {
            System.out.println("No pudo completarse la acción.");
        }
    }

    public void listadoDeLibrosAlfabeticamente() {
        List listado = controladora.listadoLibrosAlfabeticamente();

        Iterator listIt = listado.iterator();

        System.out.println("Se imprimirá el listado de libros por orden alfabético: ");

        while (listIt.hasNext()) {
            System.out.println(listIt.next().toString());
        }
    }

    private void listadoDeLibrosAntiguedad() {
        List listado = controladora.listadoLibrosAntiguos();

        Iterator listIt = listado.iterator();

        System.out.println("Se imprimirá el listado de libros por orden de antiguedad: ");

        while (listIt.hasNext()) {
            System.out.println(listIt.next().toString());
        }
    }

    public void listadoDeLibrosVendidos() {
        System.out.println("YA MAÑANA SI ESO");
    }

    public void listadoDeLibrosRetirados() {
        System.out.println("YA MAÑANA SI ESO");
    }

    public void altaVendedor() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el dni del nuevo vendedor: ");
        String dni = s.next();

        System.out.println("Introduzca el nombre: ");
        String nombre = s.next();

        System.out.println("Introduzca el apellido: ");
        String apellidos = s.next();

        System.out.println("Introduzca el telefono: ");
        long telefono = s.nextLong();

        System.out.println("Introduzca el email: ");
        String email = s.next();

        boolean operacion = controladora.anadirVendedor(dni, nombre, apellidos, 0, email);

        if (operacion == true) {
            System.out.println("Se completo la acción correctamente.");
        } else {
            System.out.println("No pudo completarse la acción.");
        }
    }
    
    public void modificarVendedor(){
        System.out.println("YA PARA MAÑANA");
    }
}
