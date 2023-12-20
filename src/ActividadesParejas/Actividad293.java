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
public class Actividad293 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Introduzca una cadena de texto: ");
        String texto = scanner.nextLine();
        espejo(texto);
    }
    public static void espejo(String texto){
    StringBuilder reversa = new StringBuilder("");
    reversa.append(texto);
    reversa.reverse();
    System.out.println(texto+reversa.substring(1,reversa.length()));
        
    }
}
