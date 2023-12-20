/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad10 {
    public static void main(String[] args) {
        imprime('a',20);
        imprime('7', 2);
        imprime('.', 54);
    }
    public static void imprime(char caracter, int numVeces){
        for (int i = 0; i <= numVeces; i++) {
            System.out.print(caracter);
        }
        System.out.println("");
    }
}
