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
public class Actividad6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int maximo = maximoDeTresNumeros(numero1,numero2,numero3);
        System.out.printf("El mayor es %d",maximo);
        
        //System.out.printf("El mayor es %d",maximoDeTresNumeros());
    }

    public static int maximoDeTresNumeros(int num1, int num2, int num3) {
        int mayor = maximoDe2Numeros(num1, num2);
        return maximoDe2Numeros(mayor, num3);
    }
    public static int maximoDe2Numeros(int num1, int num2){
        if (num1>num2) {
            return num1;
        } else {
           return num2;
        }
    }
}
