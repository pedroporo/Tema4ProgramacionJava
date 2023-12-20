/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad23 {
    public static void main(String[] args) {
        System.out.println(mitadCadena("Hola que tal"));
        System.out.println(mitadCadena("Hola"));
        System.out.println(mitadCadena("Me gusta correr"));
    }
    public static String mitadCadena(String cadena){
    /*    String devuelto="";
    int mitad = cadena.length()/2;
        for (int i = 0; i < mitad; i++) {
            devuelto= devuelto+cadena.charAt(i);
        }
    return devuelto;*/
    return cadena.substring(0,cadena.length()/2);
    }
}
