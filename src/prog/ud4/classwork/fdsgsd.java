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
public class fdsgsd {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la nota:");
        int nota = teclado.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Suspendido");
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.print("Aprobado");
            default:
                System.out.print("Nota incorrecta");
        }

        teclado.close();
    }
}
