/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author batoi
 */
public class Actividad2 {

    public static void main(String[] args) {
        String password = generarBloque2(generarBloque1());
        System.out.println(password);
    }

    public static String generarBloque1() {
        String caracteres = "0123456789abcdefghijklmnopqrstuvwxyz";
        int longitud = generarAleatorio(4, 5);
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = generarAleatorio(0, caracteres.length() - 1);
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();

    }
    public static String generarBloque2(String generarBloque1) {
        StringBuilder bloque2 = new StringBuilder(generarBloque1);
        for (int i = 0; i < generarBloque1.length(); i++) {
            char test=generarBloque1.charAt(i);
            if (esNumero(generarBloque1.charAt(i))) {
                int numero = tranformarANumero(generarBloque1.charAt(i));
                bloque2=bloque2.append((tranformarANumero(generarBloque1.charAt(i))+generarAleatorio(0,10)%10));
                
            }else{
            bloque2=bloque2.append(toUpperCase2(generarBloque1.charAt(i)));
            }
        }
        return bloque2.toString();
    }
    public static boolean esNumero(char ch){
        if (Character.isDigit(ch)) {
            return true;
        }else{
        return false;
        }
        
    }
    public static int tranformarANumero(char ch){
        return Integer.parseInt(String.valueOf(ch));
    }
    public static char toUpperCase2(char ch){

    return Character.toUpperCase(ch);
    }

    
    

    public static int generarAleatorio(int min, int max) {

        return ((int) (Math.random() * ((max - min) + 1) + min));
    }

}
