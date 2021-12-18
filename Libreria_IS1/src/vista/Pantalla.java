/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import ModeloDeNegocio.Controladora;
import java.util.Date;
import java.util.Scanner;

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
        int opc= s.nextInt();
        
        if (opc==0) {
            finProceso();
        }else if (opc==1){
            altaLibros();
        }

    }
    
    private void altaLibros(){
        Date fechaAlta=new Date();
        Date fechaBaja=new Date();
        //controladora.anadirLibro(0, "Libro1", "111111A", 0, 0, fechaAlta, fechaBaja, 0, controladora.anadirVendedor("11111111-A", "apellido2", "apellido1", 0, "prueba@gmail.com"));
    }
}
