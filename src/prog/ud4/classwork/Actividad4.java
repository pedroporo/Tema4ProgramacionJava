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
public class Actividad4 {

    public static void main(String[] args) {
        /*O 
        int maximo = maximoDeTresNumeros();
        System.out.printf("El mayor es %d",maximo);
        */
        System.out.printf("El mayor es %d",maximoDeTresNumeros());
    }

    public static int maximoDeTresNumeros() {
        Scanner scanner = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Introduce numero %d:", i);
            int numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;

            }
        }
        return mayor;

    }
}
