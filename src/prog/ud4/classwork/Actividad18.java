/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
import java.util.Scanner;

public class Actividad18 {

    static final int OPCION_SALUDAR = 1;
    static final int OPCION_COMER = 2;
    static final int OPCION_HABLAR = 3;
    static final int OPCION_SALIR = 4;
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        verMenu();
    }

    public static void verMenu() {
        int opcionSeleccionada;
        do {
            mostrarOpciones();
            opcionSeleccionada = obtenerOpciones();
            ejecutarOpciones(opcionSeleccionada);

        } while (opcionSeleccionada != OPCION_SALIR);
    }

    public static void mostrarOpciones() {
        System.out.printf("%d. Saludar %n", OPCION_SALUDAR);
        System.out.printf("%d. Comer %n", OPCION_COMER);
        System.out.printf("%d. Hablar %n", OPCION_HABLAR);
        System.out.printf("%d. Salir %n", OPCION_SALIR);

    }

    public static int obtenerOpciones() {
        return scanner.nextInt();
    }

    public static void ejecutarOpciones(int opcionSeleccionada) {

        switch (opcionSeleccionada) {
            case OPCION_SALUDAR:
                System.out.println("Hola a todos");
                break;
            case OPCION_COMER:
                System.out.println("Comiendo");
                break;
            case OPCION_HABLAR:
                System.out.println("Bla bla bla");
                break;
            case OPCION_SALIR:
                System.out.println("Adiós");
                break;
            default:
                System.out.println("La opción seleccionada no es válida");
        }
    }
}
