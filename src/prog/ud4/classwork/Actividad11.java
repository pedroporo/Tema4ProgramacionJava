/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad11 {

    public static void main(String[] args) {
        imprime('a', 20, 5);
    }

    public static void imprime(char caracter, int numVeces, int numLineas) {
        for (int i = 0; i < numLineas; i++) {

            Actividad10.imprime(caracter, numVeces);
        }

    }
}
