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
public class Actividad26 {

    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.next().concat(" ");
        System.out.println("Introduce tu primer apellido");
        String apellido1 = scanner.next().concat(" ");
        System.out.println("Introduce tu segundo apellido");
        String apellido2 = scanner.next();
        String nombreCompleto = nombre.concat(apellido1).concat(apellido2);
        //String nombreCompleto= nombre+" "+apellido1+" "+apellido2;
        minusculasMayusculasYLongitud(nombreCompleto);
        ocurrenciasUltimoCaracter(nombreCompleto);
        mostrar2PrimerosCaracteres(nombreCompleto);
        cammelCaseNombre(nombre, apellido1, apellido2);
        ateriscos(nombreCompleto);
        reversa(nombreCompleto);
    }

    public static void minusculasMayusculasYLongitud(String nombreCompleto) {
        System.out.printf("Minuscules: %s\n", nombreCompleto.toLowerCase());
        System.out.printf("Mayuscules: %s\n", nombreCompleto.toUpperCase());
        System.out.printf("Longitud: %d\n", nombreCompleto.length());
        
    }

    public static void ocurrenciasUltimoCaracter(String nombreCompleto) {
        char ultimoCaracter = nombreCompleto.charAt(nombreCompleto.length() - 1);
        int ocurrencias=0;
        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (nombreCompleto.charAt(i) == ultimoCaracter){
            ocurrencias++;
            }
        }
        System.out.printf("Numero de ocurrencias de %s es %d\n",ultimoCaracter,ocurrencias );
    }
    public static void mostrar2PrimerosCaracteres(String nombreCompleto) {
        if (nombreCompleto.length()>=2){
    System.out.printf("2 Primeros caracteres: %s\n",nombreCompleto.substring(0, 2));
        }
    }
    public static void cammelCaseNombre(String nombre,String apellido1,String apellido2){

        System.out.printf("Cammelcase: %s %s %s\n",transformarCammelCase(nombre),transformarCammelCase(apellido1),transformarCammelCase(apellido2));
    }
    public static String transformarCammelCase(String texto){
    String primerCaracter=texto.substring(0,1).toUpperCase();
    String restoCaracteres=texto.substring(1,texto.length()).toLowerCase();
    return primerCaracter.concat(restoCaracteres);
    }
    public static void ateriscos(String nombreCompleto){
        System.out.printf("***%s***\n",nombreCompleto);
    }
    public static void reversa(String nombreCompleto){

        for (int i = nombreCompleto.length()-1; i >=0; i--) {
            System.out.print(nombreCompleto.charAt(i)); 
        }
        System.out.println("");
    }
}
