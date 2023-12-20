/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class Actividad3 {

    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            menuInicial();
            opcion = obtenerOpcion();
            ejecucionOpcion(opcion);
        } while (opcion != 3);
    }

    public static void menuInicial() {
        System.out.println("Bienvenido a Batoi Constucciones");
        System.out.println("--------------------------------");
        System.out.println("1. Resistencia y rimbombancia");
        System.out.println("2. Rimbombancia");
        System.out.println("3. Salir");

    }

    public static void ejecucionOpcion(int opcion) {
        switch (opcion) {
            case 1:
                obtenerValores(opcion);
                break;
            case 2:
                obtenerValores(opcion);
                break;
            case 3:
                System.out.println("Adiós");
                break;
        }

    }

    public static double obtenerResistencia(double ancho, double profundidad, boolean tieneHormigon) {
        if (tieneHormigon) {
            return ancho * (Math.pow(profundidad, (0.5 * Math.PI)));

        } else if (tieneHormigon == false) {
            return 2 * ancho * (Math.pow(profundidad, (1.5 * Math.PI)));
        }
        return 0;
    }
    
    public static double obtenerRimbombancia(double alto, double ancho, double profundidad) {
        return Math.sqrt((Math.pow(profundidad, 1.5)) + (Math.pow(ancho, 0.25)) + (Math.pow(alto, 0.75)));
    }

    public static boolean sonDimensionesValidas(double alto, double ancho, double profundidad) {

        if (alto < 0 || ancho < 0 || profundidad < 0 || alto < ancho || profundidad > (alto * 2)) {
            return false;
        } else {

            return true;
        }

    }
    public static void obtenerValores(int opcion){
        boolean hecho=false;
        double ancho=0;
        double alto=0;
        double profundidad=0;
        boolean tieneHormigon;
        do{
        System.out.print("Introduce ancho (m): ");
        ancho = scanner.nextDouble();
        System.out.print("Introduce alto (m): ");
        alto = scanner.nextDouble();
        System.out.print("Introduce profundidad (m): ");
        profundidad = scanner.nextDouble();
        System.out.print("¿Tiene hormigón?: ");
        tieneHormigon = scanner.nextBoolean();
        hecho =sonDimensionesValidas(alto, ancho, profundidad);
            if (hecho==false) {
                System.out.println("¡Error! Los datos introducidos no son válidos");
            }
        }while(hecho ==false);
        System.out.printf("Dimensiones => ancho (%d.1m), alto (%d.1m) y profundidad (%d.1m)\n",ancho,alto,profundidad);
        if (opcion==1) {
            System.out.printf("Resistencia --> %d.2",obtenerResistencia(ancho,profundidad,tieneHormigon));
        }
        System.out.printf("Rimbonbancia --> %d.2",obtenerRimbombancia(alto,ancho,profundidad));
    }
    public static int obtenerOpcion() {

        int numero = 0;
        boolean hecho = false;
        do {
            System.out.print("Selecciona una opción [1 - 3 ]: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 3 || numero < 1) {
                    System.out.println("Opción incorrecta");
                } else {
                    hecho = true;
                }
            } else {
                System.out.println("¡Error! Tipo incorrecto");
                scanner.next();
            }

        } while (hecho == false);
        return numero;
    }
}
