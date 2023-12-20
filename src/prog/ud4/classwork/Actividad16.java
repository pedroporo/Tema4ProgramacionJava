/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

import matematica.Matematica;

/**
 *
 * @author batoi
 */
public class Actividad16 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int modoNumeros = 0;
        for (int operacion = 1; operacion < 12; operacion++) {
            switch (operacion) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("----");
                    modoNumeros = 1;
                    break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("-----");
                    modoNumeros = 1;
                    break;
                case 3:
                    System.out.println("MULTIPLICACIÓ");
                    System.out.println("-------------");
                    modoNumeros = 1;
                    break;
                case 4:
                    System.out.println("DIVISIÓ");
                    System.out.println("-------");
                    modoNumeros = 1;
                    break;
                case 5:
                    System.out.println("MÒDUL");
                    System.out.println("-----");
                    modoNumeros = 1;
                    break;
                case 6:
                    System.out.println("ARREL QUADRADA");
                    System.out.println("---------------");
                    modoNumeros = 2;
                    break;
                case 7:
                    System.out.println("POTÈNCIA");
                    System.out.println("--------");
                    modoNumeros = 1;
                    break;
                case 8:
                    System.out.println("ÀREA RECTANGLE");
                    System.out.println("--------------");
                    modoNumeros = 3;
                    break;
                case 9:
                    System.out.println("VOLUM PRISMA");
                    System.out.println("------------");
                    modoNumeros = 3;
                    break;
                case 10:
                case 11:
                case 12:
                    modoNumeros = 4;
                    break;
            }
            for (int i = 1; i <= 3; i++) {
                if (modoNumeros == 1 && i == 1) {
                    num1 = 2;
                    num2 = 4;
                } else if (modoNumeros == 1 && i == 2) {
                    num1 = 6;
                    num2 = 8;
                } else if (modoNumeros == 1 && i == 3) {
                    num1 = 3;
                    num2 = 2;
                }

                if (modoNumeros == 2 && i == 1) {
                    num1 = 16;
                } else if (modoNumeros == 2 && i == 2) {
                    num1 = 4;
                } else if (modoNumeros == 2 && i == 3) {
                    num1 = 2;
                }
                double ample = 0;
                double alt = 0;
                double profunditat = 0;
                if (modoNumeros == 3 && i == 1) {
                    ample = 12;
                    alt = 34;
                    profunditat = 10;
                } else if (modoNumeros == 3 && i == 2) {
                    ample = 19.4;
                    alt = 42.4;
                    profunditat = 200;
                } else if (modoNumeros == 3 && i == 3) {
                    ample = 27;
                    alt = 56.4;
                    profunditat = 10;
                }
                int a = 0;
                int b = 0;
                int c = 0;
                boolean solucion;
                if (modoNumeros == 4 && i == 1) {
                    a = 12;
                    b = 34;
                    c = 7;
                } else if (modoNumeros == 4 && i == 2) {
                    a = 19;
                    b = -42;
                    c = 23;
                } else if (modoNumeros == 4 && i == 3) {
                    a = 27;
                    b = 56;
                    c = -16;
                }

                if (operacion == 1) {
                    System.out.printf("%d + %d = %d\n", num1, num2, Matematica.obtindreSuma(num1, num2));
                } else if (operacion == 2) {
                    System.out.printf("%d - %d = %d\n", num1, num2, Matematica.obtindreResta(num1, num2));
                } else if (operacion == 3) {
                    System.out.printf("%d * %d = %d\n", num1, num2, Matematica.obtindreMultiplicacio(num1, num2));
                } else if (operacion == 4) {
                    System.out.printf("%d / %d = %.3f\n", num1, num2, Matematica.obtindreDivisio(num1, num2));
                } else if (operacion == 5) {
                    System.out.printf("%d %% %d = %d\n", num1, num2, Matematica.obtindreModul(num1, num2));
                } else if (operacion == 6) {
                    System.out.printf("√%.2f = %.2f\n", (double) num1, Matematica.obtindreArrelQuadrada(num1));
                } else if (operacion == 7) {
                    System.out.printf("%d ^ %d = %d\n", num1, num2, Matematica.obtindrePotencia(num1, num2));
                } else if (operacion == 8) {
                    System.out.printf("%.2f x %.2f = %d\n", ample, alt, Matematica.obtindreAreaRectangle(ample, alt));
                } else if (operacion == 9) {
                    System.out.printf("%.1f x %.1f x %.1f = %d\n", ample, alt, profunditat, Matematica.obtindreVolumPrisma(ample, alt, profunditat));
                } else if (operacion == 10 || operacion == 11 || operacion == 12) {
                    System.out.println("EQUACIÓ DE SEGON GRAU");
                    System.out.println("---------------------");
                    System.out.printf("%+dx^2 %+dx %+d = 0 x1 = %.3f x2 = %.3f\n", a, b, c, Matematica.obtindreEquacioGrau2(a, b, c, true), Matematica.obtindreEquacioGrau2(a, b, c, false));
                }

            }
            System.out.println("");
        }

    }

}
