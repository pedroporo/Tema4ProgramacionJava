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
public class Actividad294 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner= new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = scanner.nextLine();
        System.out.println(noEspacios(frase));
    }
    public static String noEspacios(String frase){
    String test =frase.replace(" ", "");
    return test;
    }
}
