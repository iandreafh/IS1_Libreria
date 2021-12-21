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

    public Pantalla(Controladora c) {
        this.controladora = c;
    }

    public void mostrarOpciones() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        while (opc != 0) {
            System.out.println("\nMENÚ PRINCIPAL:"
                    + "\n \t 1. Gestión de Libros "
                    + "\n\t 2. Gestión de Vendedores "
                    + "\n\t 3. Venta "
                    + "\n\n\t 0. Salir");
            System.out.println("Selección: ");
            opc = s.nextInt();
            if (opc < 0 || opc > 3) {
                System.out.println("La intruccion no esta reconocida");
            } else if (opc == 0) {
                finProceso();
            } else if (opc == 1) {
                gestionLibros();
            } else if (opc == 2) {
                gestionVendedores();
            } else if (opc == 3) {
                venta();
            }
        }
    }

    private void finProceso() {
        System.out.println("Hasta pronto!");
    }

    private void gestionLibros() {
        System.out.println("\nMENÚ GESTION DE LIBROS: "
                + "\n\t 1. Alta de Libro "
                + "\n\t 2. Baja de Libro "
                + "\n\t 3. Listado de Libros alfabéticamente "
                + "\n\t 4. Listado de Libros por antigüedad "
                + "\n\t 5. Listado de Libros vendidos"
                + "\n\t 6. Listado de Libros retirados"
                + "\n\t 0. Salir\n");
        System.out.println("Selección: ");
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
        System.out.println("\nMENÚ GESTIÓN VENDEDORES: "
                + "\n\t 1. Alta Vendedor "
                + "\n\t 2. Modificación Vendedor"
                + "\n\t 3. Consulta Vendedor"
                + "\n\t 0. Salir\n");
        System.out.println("Selección: ");
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
            case 3:
                consultarVendedor();
                break;
            default:
                System.out.println("Comando no valido");
                break;
        }

    }

    public void venta() {
        Scanner s = new Scanner(System.in);

        System.out.println("\nInicio de una nueva Venta");

        controladora.crearVenta();

        int decision = 1;
        int id;
        float precioFinal;
        boolean operacion;

        while (decision != 2) {

            System.out.println("\tIntroduzca el id del libro a vender: ");
            id = s.nextInt();

            //Asumimos que la negociacion de precio se hara previamente mediante consulta del libro
            System.out.println("\tIntroduzca el precio final del libro a vender: ");
            precioFinal = s.nextFloat();

            operacion = controladora.addLibroVenta(id, precioFinal);
            if (operacion == true) {
                System.out.println("Se anadio el libro al carrito de compra.");
            } else {
                System.out.println("No pudo completarse la operación.");
            }

            System.out.println("¿Quiere introducir un nuevo libro?: \n\t 1. Si\n\t 2. No");
            decision = s.nextInt();
        }
        //Imprimo un resumen de la venta, para que la confirme
        this.controladora.imprimirTicket();
        System.out.println("\t¿Quiere confirmar la venta?:"
                + "\n\t 1. Si \n\t 2. No");
        int confirmacion = s.nextInt();
        if (confirmacion == 1) {
            controladora.confirmarVenta();
        } else {
            System.out.println("Venta cancelada.");
        }
    }

    public void altaLibros() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el dni del vendedor: ");
        String dni = s.nextLine();
        controladora.asociarVendedor(dni);
        boolean exit = false;

        while (!exit) {

            System.out.println("Introduzca el título del libro: ");
            String titulo = s.nextLine();
            while (titulo == "") {
                System.out.println("Error: Debe introducir un titulo");
                titulo = s.nextLine();
            }

            System.out.println("Introduzca el ISBN del libro: ");
            String ISBN = s.nextLine();
            while (ISBN == "") {
                System.out.println("Error: Debe introducir un ISBN");
                ISBN = s.nextLine();
            }

            System.out.println("Introduzca el precio inicial del libro (formato 0,00): ");
            float precioInicial = s.nextFloat();
            while (precioInicial < 0) {
                System.out.println("Error: Debe introducir un numero positivo");
                precioInicial = s.nextFloat();
            }

            System.out.println("Introduzca el precio mínimo del libro (formato 0,00): ");
            float precioMinimo = s.nextFloat();
            while (precioMinimo < 0) {
                System.out.println("Error: Debe introducir un numero positivo");
                precioMinimo = Float.parseFloat(s.nextLine());
            }

            boolean operacion = controladora.anadirLibro(titulo, ISBN, precioInicial, precioMinimo);

            if (operacion == true) {
                System.out.println("Se completo la acción correctamente.");
            } else {
                System.out.println("No pudo completarse la acción.");
            }

            s = new Scanner(System.in);
            System.out.println("\n\t¿Quiere dar de alta otro libro?:"
                    + "\n\t 1. Si \n\t 2. No");
            int confirmacion = Integer.parseInt(s.nextLine());
            if (confirmacion == 2) {
                exit = true;
            }
        }
    }

    public void bajaLibros() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el id del Libro a eliminar");
        int id = s.nextInt();

        boolean operacion = controladora.bajaLibro(id);

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

        System.out.println("Se imprimirá el listado de libros en exposición por orden de antiguedad: ");

        while (listIt.hasNext()) {
            System.out.println(listIt.next().toString());
        }
    }

    public void listadoDeLibrosVendidos() {
        List listado = controladora.listadoLibrosVendidos();

        Iterator itVendidos = listado.iterator();

        System.out.println("Se imprimirá el listado de libros vendidos en la librería: ");

        while (itVendidos.hasNext()) {
            System.out.println(itVendidos.next().toString());
        }
    }

    public void listadoDeLibrosRetirados() {
        List listado = controladora.listadoLibrosRetirados();

        Iterator itRetirados = listado.iterator();

        System.out.println("Se imprimirá el listado de libros retirados en la librería: ");

        while (itRetirados.hasNext()) {
            System.out.println(itRetirados.next().toString());
        }
    }

    public void altaVendedor() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el dni del nuevo vendedor: ");
        String dni = s.nextLine();

        System.out.println("Introduzca el nombre: ");
        String nombre = s.nextLine();

        System.out.println("Introduzca el apellido: ");
        String apellidos = s.nextLine();

        System.out.println("Introduzca el telefono: ");
        long telefono = Long.parseLong(s.nextLine());

        System.out.println("Introduzca el email: ");
        String email = s.nextLine();

        boolean operacion = controladora.anadirVendedor(dni, nombre, apellidos, telefono, email);

        if (operacion == true) {
            System.out.println("Se completo la acción correctamente.");
        } else {
            System.out.println("No pudo completarse la acción.");
        }
    }

    public void modificarVendedor() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el dni del vendedor: ");
        String dni = s.nextLine();
        System.out.println("Introduzca el nuevo email del vendedor: ");
        String email = s.nextLine();

        boolean operacion = controladora.modificarVendedor(dni, email);
        if (operacion == false) {
            System.out.println("No existe dicho vendedor. ");
        }
    }

    public void consultarVendedor() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el dni del vendedor: ");
        String dni = s.next();

        boolean operacion = controladora.consultarVendedor(dni);
        if (operacion == false) {
            System.out.println("No existe dicho vendedor. ");
        }
    }
}
