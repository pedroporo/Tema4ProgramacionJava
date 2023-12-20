/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

/**
 *
 * @author batoi
 */
public class Actividad3 {
    public static void main(String[] args) {
        mostrarTablasMultiplicar();
    }
    public static void mostrarTablasMultiplicar() {
        for (int i = 1; i <= 10; i++) {

            System.out.printf("Tabla del %d\n", i);
            System.out.println("-----------");
            //Mostrar tabla de multiplicar
            int contador = 1;
            do {
                int resultado = i * contador;
                System.out.printf("%d * %d = %d \n", i, contador, resultado);
                contador++;
            } while (contador <= 10);
        }
    }
}
