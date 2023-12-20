/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class Actividad28 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        String palabra3 = scanner.next();
        StringBuilder palabraCompleta = new StringBuilder("");
        palabraCompleta.append(palabra1);
        palabraCompleta.append(" ");
        palabraCompleta.append(palabra2);
        palabraCompleta.append(" ");
        palabraCompleta.append(palabra3);
        System.out.println(palabraCompleta);
        System.out.println(palabraCompleta.reverse());
        String palabra4 = scanner.next().concat(" ");
        int ultimoEspacio=palabraCompleta.lastIndexOf(" ");
        palabraCompleta.insert(ultimoEspacio+1, palabra4);
        System.out.println(palabraCompleta);
    }
    
}
