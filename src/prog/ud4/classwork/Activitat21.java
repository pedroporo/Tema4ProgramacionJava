/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;



/**
 *
 * @author batoi
 */
public class Activitat21 {

    public static void main(String[] args) {
        System.out.println(comprobarSaludo("Adios"));
        System.out.println(comprobarSaludo("Hola"));
        System.out.println(comprobarSaludo("Goodbye"));
        System.out.println(comprobarSaludo("Hello"));
    }
    public static boolean comprobarSaludo(String texto) {
        return texto.equals("Hola")
                || texto.equals("Hello")
                || texto.equals("Que tal?");
    }
}
