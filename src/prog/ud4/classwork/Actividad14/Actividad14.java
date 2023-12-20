/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork.Actividad14;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class Actividad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado1 = Matematica.suma(12, 15);
        int resultado2 = Matematica.suma(45, 50, 34);
        
        while (true) {            
          System.out.println("Introduce un numero:");
          int numero = scanner.nextInt();
            if (Matematica.primo(numero)) {
                System.out.printf("El numero %d es primo\n",numero);
            } else {
                System.out.printf("El numero %d no es primo\n",numero);
            }
          
        }
        
        
    }
    
}
