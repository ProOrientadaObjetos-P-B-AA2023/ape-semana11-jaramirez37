/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import package02.*;

public class Ejecutor01 {

    public static ArrayList<Menu> Platos = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList platos = new ArrayList<Menu>();
        boolean bandera = true;
        String nombre;
        int opcion_1 = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("-------- RESTURANT DON PEPE ---------");
        System.out.println("Ingresa el nombre para la factura: ");
        nombre = entrada.nextLine();;

        do {
            try {
                Interfaz.menu_principal();
                opcion_1 = entrada.nextInt();
            } catch (InputMismatchException e) {
                Interfaz.manejoErrores(1);
                entrada.nextLine();
            }
            switch (opcion_1) {
                case 1 -> {
                    MenuCarta menuCarta1 = new MenuCarta("Carta 001",
                            4.50, 2.00,
                            1.00, 1.50);
                    Cuenta.agregarMenu(menuCarta1);
                }
                case 2 -> {
                    MenuDia menuDia1 = new MenuDia("Dia 001",
                            7.00, 5.00, 1.00);

                    Cuenta.agregarMenu(menuDia1);
                }
                case 3 -> {
                    MenuNinos menuNinos1 = new MenuNinos("Niños 001",
                            5.50, 3.00, 1.00);

                    Cuenta.agregarMenu(menuNinos1);
                }
                case 4 -> {
                    MenuEconomico menuEconomico1 = new MenuEconomico("Econo 001",
                            3.00, 25.00);
                    Cuenta.agregarMenu(menuEconomico1);
                }
                case 5 -> {
                    System.out.println("Muchas gracias por su preferencia.");
                    bandera = false;
                }
            }

        } while (bandera);

        Cuenta cuenta = new Cuenta(nombre, 10.0);
        cuenta.imprimirFactura();
    }
}
