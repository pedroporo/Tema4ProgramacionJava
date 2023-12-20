/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad22 {

    public static void main(String[] args) {
        separarLetras("Hola Món");
    }

    public static void separarLetras(String texto) {
        String cadena = "Hola Món";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter != ' ') {

                System.out.print(caracter);
                if (i < texto.length() - 1) {
                    System.out.print("-");
                }
            }

        }
    }
}
