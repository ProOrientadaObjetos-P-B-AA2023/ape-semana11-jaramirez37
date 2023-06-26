package problema01;

/**
 *
 * @author Joseph
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Combate {

    public ArrayList<Personaje> listaJugadores;
    public ArrayList<Arma> listaArmas;

    public Combate() {
        listaJugadores = new ArrayList<>();
        listaArmas = new ArrayList<>();
    }

    public void crearPersonaje() {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        boolean bandera;

        bandera = false;
        do {
            System.out.println();
            System.out.println("------ CREACION DE PERSONAJES ------");
            System.out.println("1) Guerrero");
            System.out.println("2) Mago");
            System.out.println("3) Arquero");
            System.out.println("4) Salir");
            System.out.print("Escoga una opcion: ");
            eleccion = sc.nextInt();
            sc.nextLine();

            switch (eleccion) {
                case 1 -> {
                    PersonajeGuerrero guerrero = new PersonajeGuerrero();

                    System.out.println("---- GUERERO ----");
                    System.out.print("-Ingrese el nombre de tu personaje: ");
                    guerrero.setNombre(sc.nextLine());
                    guerrero.setArmaGuerrero(listaArmas.get(0));
                    guerrero.setAtaque(20);
                    listaJugadores.add(guerrero);
                }
                case 2 -> {
                    PersonajeMago mago = new PersonajeMago();

                    System.out.println("---- MAGO ----");
                    System.out.print("-Ingrese el nombre del personaje: ");
                    mago.setNombre(sc.nextLine());
                    mago.setArmaMago(listaArmas.get(3));
                    mago.setAtaque(10);
                    listaJugadores.add(mago);
                }
                case 3 -> {
                    PersonajeArquero arquero = new PersonajeArquero();

                    System.out.println("---- ARQUERO ----");
                    System.out.print("-Ingrese el nombre del personaje: ");
                    arquero.setNombre(sc.nextLine());
                    arquero.setArmaArquero(listaArmas.get(6));
                    arquero.setAtaque(15);
                    listaJugadores.add(arquero);
                }
                case 4 -> {
                    System.out.println();
                    bandera = true;
                }
                default -> {
                    System.out.println();
                    System.out.println("-- Opcion incorrecta --");
                }
            }

            listaJugadores.get(listaJugadores.size() - 1).setNivel(1);
            listaJugadores.get(listaJugadores.size() - 1).setExperiencia(0);
            listaJugadores.get(listaJugadores.size() - 1).setVida(100);

        } while (!bandera);
    }

    public void visualizarEstadisticas() {
        if (!listaJugadores.isEmpty()) {
            System.out.println("---- VISUALIZACION DE ESTADISTICAS ----");
            for (Personaje aux : listaJugadores) {
                System.out.println(aux);
            }
        } else {
            System.out.println();
            System.out.println("No se encuentran jugadores creados");
        }
    }

    public void establecerArmasDisponibles() {

        ArmaGuerrero espadaBasica = new ArmaGuerrero(10, 0, 50);
        ArmaGuerrero espadaMedio = new ArmaGuerrero(15, 2, 60);
        ArmaGuerrero espadaAlto = new ArmaGuerrero(25, 5, 68);
        ArmaMago baculoBasico = new ArmaMago(8, 0, 25);
        ArmaMago baculoMedio = new ArmaMago(15, 0, 30);
        ArmaMago baculoAlto = new ArmaMago(22, 5, 35);
        ArmaArquero arcoBasico = new ArmaArquero(20, 8, 25);
        ArmaArquero arcoMedio = new ArmaArquero(22, 9, 35);
        ArmaArquero arcoAlto = new ArmaArquero(25, 10, 40);

        listaArmas.add(espadaBasica);
        listaArmas.add(espadaMedio);
        listaArmas.add(espadaAlto);
        listaArmas.add(baculoBasico);
        listaArmas.add(baculoMedio);
        listaArmas.add(baculoAlto);
        listaArmas.add(arcoBasico);
        listaArmas.add(arcoMedio);
        listaArmas.add(arcoAlto);
    }

    public void turnoCombate(Personaje jugador, Personaje oponente) {
        try {

            Scanner sc = new Scanner(System.in);
            int opcion_1;
            int numero_defensa;
            int numero_ataque;

            System.out.println("ES TU TURNO " + jugador.getNombre() + " !!!!!");
            System.out.println("1) Atacar");
            System.out.println("2) Defenderse");
            System.out.print("Escoge una opcion: ");
            opcion_1 = sc.nextInt();

            switch (opcion_1) {
                case 1 -> {
                    System.out.println("Adivina el numero del 1 al 5 para atacar");
                    numero_ataque = (int) (Math.random() * 6);
                    System.out.println("Ingresa tu numero: ");
                    if (numero_ataque == sc.nextInt()) {
                        System.out.println("Has atacado al enemigo");
                        oponente.setVida(oponente.getVida() - jugador.atacar());
                    } else {
                        System.out.println("El oponete lo ha esquivado");
                        System.out.println("Numero Ataque: " + numero_ataque);
                    }
                }
                case 2 -> {
                    System.out.println("Adivina el numero del 1 al 10 para defenderte");
                    numero_defensa = (int) (Math.random() * 11);
                    System.out.println("Ingresa tu numero: ");
                    if (numero_defensa == sc.nextInt()) {
                        System.out.println("Uffff lo has esquivado");
                        jugador.defenderse();
                    } else {
                        System.out.println("Has recibido daño");
                        System.out.println("Numero Defensa: " + numero_defensa);
                        oponente.setVida(oponente.getVida() - jugador.atacar());
                    }
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }

    }

    public void combatePVP() {
        System.out.println("--- SALON DE COMBATES 1 vs 1---");

        if (listaJugadores.isEmpty() | listaJugadores.size() == 1) {
            System.out.println("No hay los jugadores necesarios");
        } else {

            Personaje oponente_1 = listaJugadores.get((int) (Math.random() * (listaJugadores.size() - 1)));
            Personaje oponente_2 = listaJugadores.get((int) (Math.random() * (listaJugadores.size() - 1)));
            if (oponente_1 == oponente_2) {
                oponente_2 = listaJugadores.get((int) (Math.random() * (listaJugadores.size() - 1)));
            }

            while (oponente_1.getVida() <= 0 | oponente_2.getVida() <= 0) {
                turnoCombate(oponente_1, oponente_2);
                turnoCombate(oponente_2, oponente_1);

                if (oponente_1.getVida() <= 0) {
                    System.out.println("Ganador: " + oponente_2.getNombre());
                    oponente_2.setExperiencia(oponente_2.getExperiencia() + 1);
                    oponente_2.setNivel(oponente_2.getNivel() + 1);
                    oponente_2.setVida(oponente_2.getVida() + 10);
                }
                if (oponente_2.getVida() <= 0) {
                    System.out.println("Ganador: " + oponente_1.getNombre());
                    oponente_1.setExperiencia(oponente_1.getExperiencia() + 1);
                    oponente_1.setNivel(oponente_1.getNivel() + 1);
                    oponente_1.setVida(oponente_1.getVida() + 10);
                }
            }
        }
    }
}
