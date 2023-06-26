package problema01;

/**
 *
 * @author Joseph
 */
import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {

        Combate gestor = new Combate();
        Scanner entrada = new Scanner(System.in);

        int eleccion;
        boolean bandera;

        bandera = true;

        System.out.println("--------------- WORLD FIGTH RPG ---------------");
        gestor.establecerArmasDisponibles();

        do {
            System.out.println();
            System.out.println("------- MENU -------");
            System.out.println("1) Crear personaje");
            System.out.println("2) Estadisticas personajes");
            System.out.println("3) Combate PVP");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion: ");
            eleccion = entrada.nextInt();

            switch (eleccion) {
                case 1 -> {
                    gestor.crearPersonaje();
                }
                case 2 -> {
                    gestor.visualizarEstadisticas();
                }
                case 3 -> {
                    System.out.println("En mantenimiento");
                }
                case 4 -> {
                    System.out.println();
                    System.out.println("Programa Terminado");
                    bandera = false;
                }
                default -> {
                    System.out.println();
                    System.out.println("--- Opcion incorrecta ---");
                }
            }
        } while (bandera);

    }
}
