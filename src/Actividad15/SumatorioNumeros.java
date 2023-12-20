/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad15;

/**
 *
 * @author batoi
 */
public class SumatorioNumeros {
    public static void main(String[] args) {
        identificarNumeros(12021);
    }
    public static void identificarNumeros(long x){
    long num = x;
    long suma = 0;
        while (num>0) {            
            long mod= num % 10;
            System.out.printf("%d+",mod);
            num = num /10;
             suma= suma +mod; 
        }
        System.out.printf("\nLa suma es %d\n",suma);
    return;
    }
    
}
