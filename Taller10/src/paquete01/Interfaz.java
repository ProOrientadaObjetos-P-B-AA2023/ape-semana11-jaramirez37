package paquete01;

import java.util.ArrayList;
import package02.*;

/**
 *
 * @author reroes
 */
public class Interfaz {

    public static void menu_principal() {
        System.out.println("             ┌─────────────────────────────────┐");
        System.out.println("             │              Menu         │");
        System.out.println("             │─────────────────────────────────│");
        System.out.println("             │  1) Menú a la Carta       │");
        System.out.println("             │  2) Menú del Día          │");
        System.out.println("             │  3) Menú de Niños         │");
        System.out.println("             │  4) Menú Económico        │");
        System.out.println("             │  5) Salir                 │");
        System.out.println("             └─────────────────────────────────┘");
        System.out.print("-Ingrese una opcion: ");

    }

    public static void PresentarLista(ArrayList<Menu> lista) {
        if (lista.size() == 0) {
            System.out.println("┌───────────────────────────────────────────────────────────────┐");
            System.out.println("│                 NO EXISTEN DATOS DE PRESTAMOS                 │");
            System.out.println("└───────────────────────────────────────────────────────────────┘");
        } else {
            int n = 1;
            for (Menu aux : lista) {
                System.out.println("┌───────────────────────────────────────────────────────────┐");
                System.out.println("│                     Menu  " + n + ":                        │");
                System.out.println("└───────────────────────────────────────────────────────────┘");
                System.out.println(aux);
                System.out.println("└───────────────────────────────────────────────────────────┘");
                n++;
            }
        }
    }

    public static void ingreso1() {
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("│PORFAVOR INGRESE LOS SIGUIENTES DATOS DE PRESTAMO AUTOMOVIL│");
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
    }

    public static void ingreso2() {
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("│PORFAVOR INGRESE LOS SIGUIENTES DATOS DE PRESTAMO EDUCATIVO│");
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
    }

    public static void manejoErrores(int tipoError) {
        switch (tipoError) {
            case 1 -> {
                System.out.println("┌─────────────────────────────────────┐");
                System.out.println("│ERROR (No ingrese letras ni simbolos)│");
                System.out.println("└─────────────────────────────────────┘");
            }
            case 2 -> {
                System.out.println("┌─────────────────────────────────────┐");
                System.out.println("│ERROR (Escoga una opcion disponible).│");
                System.out.println("└─────────────────────────────────────┘");
            }
            case 3 -> {
                System.out.println("┌──────────────────────────────────────────┐");
                System.out.println("│ERROR (Ingrese un numero decimal positivo)│");
                System.out.println("└──────────────────────────────────────────┘");
            }
            case 4 -> {
                System.out.println("┌──────────────────────────────────────────┐");
                System.out.println("│ERROR (Ingrese un numero entero positivo).│");
                System.out.println("└──────────────────────────────────────────┘");
            }
        }
    }
}
