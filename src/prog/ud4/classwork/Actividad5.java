/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad5 {

    public static void main(String[] args) {
        mostrarTablasMultiplicar(7);
    }

    public static void mostrarTablasMultiplicar(int multiplicando) {
        
        System.out.printf("Tabla del %d\n", multiplicando);
        System.out.println("-----------");
        //Mostrar tabla de multiplicar
        int contador = 1;
        do {
            int resultado = multiplicando * contador;
            System.out.printf("%d * %d = %d \n", multiplicando, contador, resultado);
            contador++;
        } while (contador <= 10);
    }
}
