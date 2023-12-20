/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesParejas;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class Actividad297 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Introduzce cadena1: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Introduzce cadena2: ");
        String cadena2 = scanner.nextLine();
        mayusculaCoincidencia(cadena1, cadena2);
    }
    public static void mayusculaCoincidencia(String cadena1,String cadena2){

    int numIndice= cadena1.indexOf(cadena2);
    String parteMayusculas = cadena1.substring(numIndice, numIndice + cadena2.length()).toUpperCase();
    String palabra = cadena1.substring(0, numIndice) + parteMayusculas + cadena1.substring(numIndice + cadena2.length());
        System.out.println(palabra);
    }
}
