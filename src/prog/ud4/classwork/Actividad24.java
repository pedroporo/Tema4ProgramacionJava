/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad24 {

    public static void main(String[] args) {
        System.out.println(cambiarVocales("Mi moto alpina derrapante"));
    }

    public static String cambiarVocales(String cadena) {
        String cadenaFinal = cadena.replace('a', 'a');
        cadenaFinal = cadenaFinal.replace('e', 'a');
        cadenaFinal = cadenaFinal.replace('i', 'a');
        cadenaFinal = cadenaFinal.replace('o', 'a');
        cadenaFinal = cadenaFinal.replace('u', 'a');
        return cadenaFinal;
    }
}
