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
public class Actividad25 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String numero1 = scanner.next();
        String numero2 = scanner.next();
        
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Multiplicacion: "+(num1*num2));
    }
    
}
