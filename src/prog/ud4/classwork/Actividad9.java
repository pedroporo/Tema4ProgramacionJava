/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

import java.util.Scanner;
import static prog.ud4.classwork.Actividad6.maximoDeTresNumeros;

/**
 *
 * @author batoi
 */
public class Actividad9 {
    public static void main(String[] args) {
        int mayor = maximoDe4Numeros(18, -2, 4, 5);
        System.out.printf("El mayor es %d\n",mayor);
    }
    public static int maximoDe4Numeros(int num1, int num2, int num3,int num4){
    int maximo=Actividad6.maximoDeTresNumeros(num1, num2, num3);
     return Math.max(maximo, num4);
    }
}
