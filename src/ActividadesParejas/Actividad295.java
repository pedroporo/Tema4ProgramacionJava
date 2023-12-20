/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesParejas;

import java.util.Scanner;

/**
 *
 * @author batoi
 */
public class Actividad295 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner= new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = scanner.nextLine();
        System.out.println(intercambioPalabras(frase));
    }
    public static String intercambioPalabras(String frase){
    StringBuilder intercambio = new StringBuilder("");
    intercambio.append(frase);
    String palabraPrincipal=intercambio.substring(0,intercambio.indexOf(" "));
    String restoFrase=intercambio.substring(intercambio.indexOf(" ")+1,intercambio.lastIndexOf(" "));
    String palabraFinal=intercambio.substring(intercambio.lastIndexOf(" ")+1);
    intercambio.append(intercambio.substring(intercambio.lastIndexOf(" ")+1));
        intercambio.replace(0, intercambio.indexOf(" "), palabraFinal);
        intercambio.replace(intercambio.lastIndexOf(" ")+1, intercambio.length(), palabraPrincipal);
       String output= intercambio.toString();
        return output;
    }
}
