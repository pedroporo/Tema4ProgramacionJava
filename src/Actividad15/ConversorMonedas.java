/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad15;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class ConversorMonedas {
    public static double DOLARES = 1.28611;
    public static double YENES = 129.852;
    public static double LIBRAS = 0.86;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoMoneda="";
        System.out.println("¿Cual es la cantidad de € que quieres convertir?:");
        int cantidadEuros= scanner.nextInt();
        System.out.println("¿A qué moneda lo quieres convertir? (1-dólares, 2-yenes, 3-libras): ");
        int monedaElegida= scanner.nextInt();
        System.out.printf("%d euros equivalen a %s \n",cantidadEuros,conversorMonedas(cantidadEuros, monedaElegida));
        
    }

    public static String conversorMonedas(int x, int y) {
        double cantidad= 0;
        String tipoMoneda="";
        if (y == 1) {
            // 1€ es 1.28611 dolares
             cantidad= x*DOLARES;
             tipoMoneda = "dólares";
            
        } else if (y == 2) {
            // 1€ es 129.852 yenes
             cantidad = x*YENES;
             tipoMoneda = "yenes";
            
        } else if (y == 3) {
         //1€ es 0.86 libras
          cantidad = x*LIBRAS;
         tipoMoneda = "libras";
        }
        
        return String.format("%.2f %s", cantidad, tipoMoneda);
    }
}
