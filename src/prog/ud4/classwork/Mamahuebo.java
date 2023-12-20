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
public class Mamahuebo {

    public static Scanner scanner;
    //Colores para los nombres de la gente
    public static final String freezer = "\033[30m";
    public static final String satanasCorPetit = "\033[31m";
    public static final String celula = "\033[32m";
    public static final String sonGohan = "\033[33m";
    public static final String boo = "\033[34m";
    public static final String goku = "\033[35m";
    public static final String tenShinHan = "\033[36m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.printf("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⣶⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⢿⠀⠀⠀⢠⣤⣤⠀⠀⡆⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣼⢦⣦⣿⢸⠆⢸⡄⠀⠿⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠉⠈⠁⠈⠀⠀⠁⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠄⢀⣤⡶⣛⣄⣤⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣯⣾⣿⣿⣿⣿⣿⣿⣿⣿⣛⣛⡛⠛⠓⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡶⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣛⣛⡛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣼⣿⡿⢛⡛⢿⠟⠛⡛⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠗⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⠰⡟⠳⠘⠳⠞⢻⡎⢛⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⡶⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣀⡤⠀⠀⠀⠰⣄⠈⢁⣿⣿⣿⣿⣿⣿⣟⣋⡉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⡀⠻⠂⠶⠆⠈⠇⠘⣿⢿⣿⣿⣿⣿⣿⠉⠁⠀⠀⠀⠠⠤⠤⠀⠀⠀⠑⠄⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢟⠢⠁⠈⢃⡀⠀⠐⠛⠀⠀⢸⡆⣿⣿⠛⠉⠀⠀⠀⠘⠒⠒⠠⠤⠤⠤⠤⠤⠤⠄⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢑⣷⣠⣤⣤⣤⣤⠤⣤⣰⡬⠚⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⢈⡏⣏⠀⢀⣠⣾⠋⠁⠙⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⢸⣿⣿⣶⣿⡟⠁⠀⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢛⣀⣀⣸⡟⣿⡹⠟⠀⠀⠀⣰⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣿⠟⠛⢿⢿⣿⣿⣷⣤⣀⡾⢽⢿⡷⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠒⠦⡴⠚⠉⣸⣿⣿⣇⣀⢀⢸⡟⠉⠉⠙⣿⣿⣿⣾⣿⣷⡤⠓⠲⡔⠢⢤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠊⠁⠀⠀⢀⡤⠤⠀⠙⢿⣿⣿⣷⣾⣾⣯⡀⣐⣾⣿⣿⣿⣿⣿⣿⠀⠀⠀⢱⠀⠀⠀⠀⠉⠲⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠀⠀⠀⠞⠀⠀⢠⣎⣉⠈⠛⢛⠓⠿⡟⠂⠒⠻⡿⢿⡿⠋⠉⠻⣄⠀⠛⠋⠀⠀⠀⣀⠀⠀⠈⠉⠲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⢠⠴⠊⠁⠀⠀⠀⠀⣀⡀⠳⠿⠀⠀⠀⠀⡀⢈⠄⠀⠀⠁⠀⠀⠀⢀⣀⠈⡇⠀⠀⠀⠀⠀⠀⠑⡄⠀⠀⠀⢙⠢⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣺⠀⠀⠀⣀⣀⢠⡖⠋⠉⠁⠀⠀⠀⢀⡀⠀⠓⠚⠀⠀⠀⠀⠀⠀⠀⣼⠬⠒⠃⠀⠀⢀⠀⠀⠰⡿⠋⠀⠀⣠⠞⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⣾⣲⣸⠉⠀⠀⠀⠀⠀⠀⠀⠈⠉⢳⡄⠀⠀⠀⠀⡶⢤⡀⠀⠿⠀⠀⠀⠀⠀⠈⠀⠐⠂⠀⠀⠀⠀⠀⠀⢀⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢆⠀⡰⠋⠀⠀⠀⡠⠶⣄⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠉⠳⡄⠀⠀⠋⠉⠳⢤⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⡀⠀⠀⠀⢸⡀⠉⠉⠀⠀⠀⢀⣋⡀⠀⠀⠀⠀⠀⠀⣀⣠⡇⠀⠀⠀⠀⠀⠈⠇⠀⠀⠀⣀⠴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠒⠤⣀⣈⣻⠦⢄⠀⠀⠀⡏⠛⠃⠀⠀⠀⠀⠀⠀⣿⠼⠃⠀⠀⠀⠀⣀⡤⠤⠤⠔⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠒⠢⠽⢦⣤⣤⣤⣤⠔⠒⠲⠤⠤⢤⣤⣤⡴⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀\n");
        empezarJuego();
    }

    public static void empezarJuego() {
        int b1 = generarAleatorio(1, 3);
        int b2 = generarAleatorio(4, 7);
        int b3 = generarAleatorio(4, 7);
        int b4 = generarAleatorio(4, 7);
        int b5 = generarAleatorio(4, 7);
        int b6 = generarAleatorio(1, 3);
        int b7 = generarAleatorio(1, 3);
        while (b2 == b3) {
            b3 = generarAleatorio(4, 7);
        }
        while (b2 == b4 || b3 == b4) {
            b4 = generarAleatorio(4, 7);
        }
        while (b2 == b5 || b3 == b5 || b4 == b5) {
            b5 = generarAleatorio(4, 7);
        }
        while (b1 == b6) {
            b6 = generarAleatorio(1, 3);
        }
        while (b1 == b7 || b6 == b7) {
            b7 = generarAleatorio(1, 3);
        }
        boolean iniciarJuego = inicio();
        boolean continuarJuego;

        if (iniciarJuego) {
            continuarJuego = nivel1();
            if (continuarJuego) {
                continuarJuego = nivel2(b1, b2);
                if (continuarJuego) {
                    continuarJuego = nivel3(b3);
                    if (continuarJuego) {
                        continuarJuego = nivel4();
                        if (continuarJuego) {
                            continuarJuego = nivel5(b4, b5, b6, b7);
                            if (continuarJuego) {
                                mostrarResultadoFinal(continuarJuego);
                            } else {
                                mostrarResultadoFinal(continuarJuego);
                            }
                        } else {
                            mostrarResultadoFinal(continuarJuego);
                        }
                    } else {
                        mostrarResultadoFinal(continuarJuego);
                    }
                } else {
                    mostrarResultadoFinal(continuarJuego);
                }
            } else {
                mostrarResultadoFinal(continuarJuego);
            }
        } else {
            fin();
        }

    }

    public static boolean inicio() {

        System.out.println("BENVINGUTS A L’AVENTURA DE DRAGON BALL");
        System.out.println("========================================");
        System.out.println("Son-Goku es troba tranquil·lament a casa junt al seu fill Son-Gohan, a\n qui li està ajudant a resoldre uns deures que li han manat fer a\n l’escola, concretament son de matemàtiques. De sobte, apareix a\n casa el Fullet Tortuga i els conta que el malvat villà Freezer està\n planejant encontrar les 7 boles del drac per tal de demanar un desig i\n obtindre un poder que ningú podrà mai podrà parar. El planeta està\n en perill. El Fullet Tortuga et demana ajuda ¿Vols que Son-Goku i\n Son-Gohan accepten el repte? (1 per acceptar, cualquer atlte per declinar)");
        byte iniciarJuego = scanner.nextByte();
        if (iniciarJuego == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarResultadoFinal(boolean resultado) {
        limpiarConsola();
        if (resultado == true) {
            System.out.println("Enhorabona!! Heu aconseguit les 7 boles de Drac. El món torna a respirar tranquil. Fins un altra amics! ");
            System.out.printf("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⣁⣤⣶⣶⣾⣷⣶⣶⣤⣈⠙⠿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⣠⣾⣿⣿⣿⣿⡏⠀⠀⠀⠀⠉⠳⣄⠘⢿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⣼⣿⣿⣿⣿⣿⣿⣿⣶⣦⡀⠀⠀⠀⠘⣧⠈⢿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢸⣿⣿⣿⣿⣿⣿⣿⠇⠹⣿⣿⡄⠀⠀⠀⢿⡇⠸⣿\n⣿⠿⠿⠿⣿⣿⣿⣿⣿⠀⢸⣿⣿⣿⣿⣿⣷⠄⠀⠀⠠⣾⣷⠀⠀⠀⣼⡇⠀⣿\n⣿⣶⣶⣦⣄⡉⠻⣿⣿⡇⢸⣿⣿⣿⣿⣿⣷⣶⡄⢠⣶⣿⣿⡀⠀⣠⣿⡇⢰⣿\n⣿⡏⠀⠀⠙⢿⡄⠹⣿⣿⡀⢻⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⡟⢀⣾⣿\n⣿⣿⣿⡆⠀⠈⣿⠀⢿⣿⣷⣄⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣠⣾⣿⣿\n⣿⣿⣿⣧⣀⣤⡿⠀⣿⣿⣿⣿⣷⣄⡉⠛⠿⠿⠿⠿⠿⠟⠛⢉⣠⣾⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⠟⢁⣼⣿⠟⠋⠉⠙⠻⣿⣿⣶⣶⣤⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⠛⠋⢉⣠⣴⣿⡿⠁⣴⣿⡛⠻⣦⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⡇⠐⣿⣿⣿⡀⣿⠇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣄⠙⠻⠿⠟⠋⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n");
        } else {
            System.out.println("Malauradament, la aventura ha acabat i el món torna a ser un lloc insegur. \nUna llàstima!");

        }
        fin();
    }

    public static void fin() {
        System.out.print("Adéu.");
    }

    public static boolean nivel1() {
        limpiarConsola();
        System.out.printf("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣄⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠞⠋⠀⠀⠀⠀⠈⠙⠦⡀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⣦⡀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⣤⣾⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣺⡆⢀⣀⣀⣀⠀⠀⠀⠀⣠⡤⢤⣤⣴⡟⢫⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⢄⣼\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣷⣭⣿⠟⠃⣘⡛⠀⠀⠀⠀⣙⣋⠉⠉⠉⢻⣿⠃⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣼⣿\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣶⣤⣄⡉⠓⢾⠤⠚⣉⣠⣤⠄⣴⡿⢿⣷⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠃⣘⠿\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠓⠾⣟⣾⣿⣷⠚⠲⣿⣿⣾⡃⣿⠋⠀⠈⠉⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣧⡀⠀⠀⣼⡄⠀⠀⢀⡼⢁⡆⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣙⢦⡘⠻⠯⢀⣠⡎⠀⠘⠛⠲⢄⡀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⢀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣄⣀⣀⣠⢤⡴⢻⠀⣿⠀⠙⠒⠚⣻⢋⠀⠀⠰⠄⠀⠀⢉⣷⣦⠖⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⡴⠻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣫⢈⣤⠞⢁⣼⣱⠟⠀⠈⢰⡇⠀⠀⢠⣞⣽⣋⣀⣀⣀⣠⡴⠞⣉⡷⢖⣫⣽⢷⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\n⠀⠀⠀⠀⠀⡇⠀⣇⣤⣾⠟⠁⠀⠀⠀⢀⡴⢶⣻⢯⢏⣾⠃⢠⢮⡾⠋⠉⠙⠲⣿⡷⠞⠉⠉⠉⢁⣠⠶⠋⢉⡴⠖⠋⢁⣿⡿⠋⠉⠉⠉⠉⠛⢳⣄⠀⠀⠀⠀⠀⠀⠀⢰⠆⢈\n⠀⠀⠀⢀⡼⠁⢸⡏⣼⣣⣶⢲⡖⣲⣾⣅⣤⣜⡻⣿⡟⠀⣴⢻⠟⠀⠀⠀⢀⡴⠋⠀⠀⠀⣠⠞⠉⣤⠖⠊⠉⠀⠀⢠⡾⡏⠀⣠⠖⠒⠉⠉⠉⠉⠙⣆⠀⠀⠀⠀⠀⠀⣿⣤⠼\n⠀⠀⢀⠞⢡⣶⣌⣟⣿⣸⣁⣯⣴⣿⡟⠹⢹⡏⢻⡞⠀⠀⠑⣏⠀⠀⠀⠀⡼⠁⠀⠀⣠⠞⠁⣠⡞⠁⠀⠀⠀⠀⢠⣏⣁⣷⣎⡁⢀⣠⠖⠋⠉⠉⠉⢻⠒⠀⠀⠀⢠⣿⢋⣴⣿\n⠀⠀⠀⢷⣿⡿⠛⠛⠛⠛⠉⠉⢹⣿⡇⢰⢸⡇⡞⠀⠀⠀⠀⠘⣧⠀⠀⢸⠁⠀⣠⠞⠁⢀⡾⠉⠀⠀⠀⠀⠀⣰⠟⠛⠛⡟⠻⣟⠿⣤⡴⠒⠋⠉⣹⣿⡇⠀⠀⠀⣿⣿⡼⣿⣿\n⠀⠀⠀⣿⢿⣧⠀⠀⠀⠀⠀⠀⠀⢿⢧⡸⣆⢷⡹⡄⠀⠀⠀⢸⡘⠳⣄⣿⣠⠞⠁⠀⠀⠚⠁⠀⠀⠀⢠⡀⠀⣇⠀⠀⠀⡇⠀⢈⣝⡛⠒⠿⠿⠟⠋⢁⡇⠀⠀⠀⣿⣼⣇⠈⠛\n⠀⠀⠀⠈⠛⠛⠛⠒⠢⢤⣤⣤⣤⣼⡮⣷⣜⣧⣳⣽⣦⣀⠀⠀⠳⣄⠘⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⢤⡙⣆⠀⠀⣇⣴⣯⠤⢿⣦⠀⠀⠀⠀⣾⠀⠀⠀⠀⠹⣿⣿⠛⢳\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠺⠧⠖⠚⠋⠉⣽⠈⠻⣄⠀⠀⠈⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢮⣦⣀⡿⢋⣀⠤⠤⣿⡇⠀⠀⠀⠘⣧⠀⠀⠀⠀⠘⢿⡶⣿\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠈⠙⢧⡀⠀⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠤⠶⠂⠀⠀⠉⢿⡿⠋⢁⡀⠤⢼⣴⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠸⡏⠈\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠙⡷⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠎⠀⠀⠀⠀⣠⡤⠀⢸⡷⠚⠁⠀⣀⡸⣿⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢧⣶\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠋⠀⠀⠀⣠⡴⠛⠁⠀⠀⣸⣧⠞⠉⠁⢀⣰⣿⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣼⣿\n⠂⠐⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠺⣖⡒⠒⠒⠒⠒⠒⠒⣲⠞⠛⠒⠒⢒⡶⠚⠓⠒⠒⢒⣲⠞⠛⣿⠞⠛⠛⣒⢺⣻⠒⠒⠒⠒⠒⡗⠒⠒⠒⠒⠒⣿⠒\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣏⠁⠀⠀⠀⠀⠚⠁⠀⢀⠀⠐⠉⠀⠀⠀⢀⣀⣨⡟⠀⠀⡟⣦⠖⠉⢡⢿⠇⠀⠀⠀⠀⣰⡇⠀⠀⠀⠀⠀⠀⢠\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣏⠽⠿⠯⠭⣭⣭⣉⢉⣩⡭⠿⠛⠛⠉⣉⣉⣭⣽⠁⠀⠀⡇⠈⢷⣀⡾⠛⣄⠀⠀⠀⠰⣏⡅⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣯⠳⠶⢤⣴⣶⠾⠿⠿⣉⣉⣭⣽⣿⠿⠿⠒⠚⠉⣷⠀⠀⡇⠀⣰⠟⠒⠒⠻⡆⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⢧⡤⣄⣀⣓⣤⣤⣤⣤⣽⠒⠋⣉⣀⡤⠤⠴⣶⣟⢿⡄⠀⡇⢰⣯⠔⠒⠒⢲⠇⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⢸⠀⡼⠈⠉⡍⠉⠉⡏⢉⡟⠋⠉⢣⠀⠀⠀⠘⡿⠀⠹⣆⡇⢨⣅⠤⠴⠶⡾⠀⠀⠀⠀⠀⠈⡇⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⢸⢰⡇⠀⠀⠃⠀⢠⠇⠈⠀⠀⠀⢸⠀⠀⠀⠀⠃⠀⠀⢹⡇⠘⣁⣀⣀⣠⡇⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⢸⠘⠁⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠘⠀⠀⠀⠀⠀⠀⠀⠈⣇⠀⢯⠀⠀⢸⣷⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢸⡀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢸⡏⠉⢹⡇⠀⠀⠀⠀⣠⠇⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠃⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⣆⢠⣷⣿⣿⣷⢶⣶⣄⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠡⠀⠀⠀⠀⠀⠀⠀⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠈⣿⠿⠛⠉⠛⠻⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⡟⠁⠀⢸⠇⠰⡇⠈⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⣏⣤⠇⢰⣼⡇⠘⡇⠀⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣇⣩⠁⠈⡟⠀⣠⢇⣠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠳⠤⢴⣁⣴⠧⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠈⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⣞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢷⠂⠸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⡆⠀⠀⠀⠀⠀⠀⠀⠐\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡄⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣆⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣸⡆⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣆⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠊⠁⣷⡆⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡧⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡦⣄⣀⣀⣀⣀⠀⢀⣤⣞⣁⣀⣀⡴⢻⠇⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠈⠉⠉⠀⠈⢹⠉⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⣀⡞⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⠁⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⠒⠛⠻⣿⣿⣿⠀⠀⠀⠀⠀⢹⡃⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡎⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⢹⡀⠀⢀⣿⣹⡿⢳⡄⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣲⢬⣍⣉⣉⣉⣩⡤⠞⠁⠀⠀⠀⠀⠈⠓⠶⠤⣤⣀⣀⡇⠀⠀⠀⠀⢀⣠⠶⠋⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠞⠃⠈⠁⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⢷⠂⠀⠉⠉⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⠟⠁⠀⠀⠀⠀⠳⠄⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠜⢧⣤⣄⣄⡤⠖⠊⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠋⠀⠀⠀⠀⠀⠀⢠⣧⠀⢠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢠⣿⣿⣿⡄⠀⠀⣸⠎⣷⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠋⠁⠀⠀⠀⠀⠀⠀⢀⣀⣴⣿⣡⠤⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢠⡏⠙⠿⠿⠓⠚⠛⣡⣶⡏⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠲⠤⠤⠄⠀⠤⢤⡦⠖⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠙⠲⡆⠀⠀⠀⠀⠀⠈⢿⡀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⡧⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠘⣦⡀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠈⠳⡇⠀⠀⠀⠀⠀⠀⠈⢣⡀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠸⣄⠀⠀⠀⠀⠀⠀⠀⢷⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠙⢧⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠑⠦⣄⡀⠀⠀⢸⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⢲⣼⠀⠀⠀⠀\n");
        int n1 = generarAleatorio(0, 10);
        int n2 = generarAleatorio(11, 20);
        int resposta = 0;
        for (int i = n1; i <= n2; i++) {
            resposta += i;
        }
        System.out.printf("n1 es %d y n2 es %d\n", n1, n2);
        System.out.printf("La resposta es %d\n", resposta);
        System.out.printf("%sSon Goku:%s Molt bé! Anem a buscar les boles de drac abans que Freezer puga tenir-les. --va dir Son-Goku des de la seua casa en el número %d de Ciutat del Nord\n", goku, reset, n1);
        System.out.printf("Goku va recordar que l’última vegada que les boles van ser repartides\n pel mon de manera aleatòria, una d’elles va anar a parar a la zona on\n actualment viu el seu amic Satanàs Cor Petit i que probablement ell la\n tinga en el seu poder. Van marxar doncs cap al número %d de la\n Ciutat Meravella, que és on ell viu.\nDesprés d’un llarg camí, hem arribat a la casa de Satanàs, i en\n efecte, ell té una de les boles. Però no vol donar-nos-la gratuïtament,\n ja que li té molta estima. Ens proposa la següent lluita matemática: \n", n2);
        System.out.printf("%sSatanàs Cor Petit:%s Sabríeu dir-me quin és el sumatori entre el\n número de la vostra casa i el número la meua? Si l’endevineu, vos\n donaré la bola i m’uniré al vostre equip\n", satanasCorPetit, reset);

        return ferIntentsNumeros(resposta);
    }

    public static boolean nivel2(int b1, int b2) {
        limpiarConsola();
        StringBuilder respuesta = new StringBuilder("");
        String s1 = generarStringAleatorio(b2, false);
        String s2 = generarStringAleatorio(b2, false);
        System.out.printf("El texto sagrado 1 es %s y el texto sagrado 2 es %s\n", s1, s2);
        int posicionS2 = s2.length();
        int posicionS1 = 0;

        for (int i = 0; i < b2; i++) {
            respuesta.append(s2.charAt(posicionS2 - 1));
            respuesta.append(s1.charAt(posicionS1));
            posicionS2--;
            posicionS1++;
        }
        System.out.printf("b1 es %d y b2 es %d\n", b1, b2);
        System.out.printf("La resposta es %s\n", respuesta);
        System.out.printf("%sSatanàs Cor Petit:%s Sou uns cracks de les matemàtiques! Pensava\n que només sabíeu lluitar. Ací teniu la bola de %d estelles. Per cert,\n tinc el número de telèfon de Ten Shin Han, qui em va enviar un\n WhatsApp la setmana passada per contar-me que havia trobat la bola\n de %d esteles en el Desert de l’Oblit. Anem-hi!\n", satanasCorPetit, reset, b1, b2);
        System.out.printf("Només arribar, trobaren a Ten Shin Han el qual no tenia el seu millor\n dia, i no els van rebre amb bona cara. Estava molt cabrejat perquè\n estava intentant resoldre un enigma matemàtic i no veia forma de fer-ho.\n");
        System.out.printf("%sSon Gohan:%s  Hola Ten Shin Han, necessitem que ens dones la teua bola de drac.\n", goku, reset);
        System.out.printf("%sTen Shin Han:%s Sí, un moment, resulta que porte així com 3 hores per\n a descrifrar un enigma alfabètic anomenat “La mescla sagrada de\n cadenes de text” i no veig la solució. Si m’ajudeu a resoldre-lo, vos\n donaré la bola. \n", tenShinHan, reset);
        return ferIntentsStrings(respuesta.toString());
    }

    public static boolean nivel3(int b3) {
        limpiarConsola();
        long factor = factorial(b3);
        System.out.printf("El resultat del factoria es %d\n", factor);
        System.out.print("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓█▒▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░▒█▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░▒▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒░░▓▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░▒▒▒░░▒▒▒▒▒▓▒░░▒▒░░▓▒░▒▒▓▒▒▒▒░▒▒▒░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░▒▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓▓░▒▓▓▓▒░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░▒▒▒▒░▒▓▓▓▒▓█▒▓▒▒▒▓▒▒░░▒▓▓▒▒▒▓▒█░█▓▒▒░▒▒▒▒░░░░░░░░░░░░░░\n░░░░░░░░░░░░░▒▓▒▒░▒▒▒▓█▓▒▓█▓▒▒░▒▒▒▓▒▒▓▒▒░▒▒▒██▒██▓▒▒▒░▒▒▓▒░░░░░░░░░░░░\n░░░░░░░░░░░▒▓▒▒▒▒▒▒▓███▓▒▓█▓▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓█▒█▓██▓▒▒▒▒▒▓▒░░░░░░░░░░░\n░░░░░░░░░░▓▓▒▒▓▓▓███████▓▓█▓▓▒▒▒▒▓▓▓▓▓▒▒▒▒▒▓▓▓▓███████▓▓▒▒▒▓▒░░░░░░░░░\n░░░░░░░░░█▓▓▒▒▒▒▓▓▓▓▓███▓▒▒▓█▓▓▒▒▒▒▒▒▒▒▒▓▓██▓▓████▓▓▓▓▓▒▒▒▓▓▓▒░░░░░░░░\n░░░░░░░░░▓██▓▓▓▓▓▒▒░▒▒▓██▓▒▒▒▒▓████▓▓██▓▓▒▒▒▒▓██▒▒░░▒▒▓▓▓▓▓██▒░░░░░░░░\n░░░░░░░░▒████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓█▒▒▒▓█▓▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▓▓████▓░░░░░░░░\n░░░░░░▒▓█████▓▓▓▒▓▓▒▒▒▒░░░▒▒▒█████████████▒▒▒░░░▒▒▒▓▓▒▒▓▓█████▓▒░░░░░░\n░░░░░▒▓████████▓▓▓▓▒░▒▓▓▒▒▒▒▓▓▓▓▓▓████▓▓▓▓▓▒▒▒▒▓▓▒░▒▓▓▓▓███████▓▒░░░░░\n░░░░▒▒████████████▓▒▒▒▓▓▓▓▓▓▓█▓▓▓█████▓▓▓█▓▓▓▓▓▓▒▒▒▒▓███████████▒▒░░░░\n░░░▒░▓█████████████▓▒▓▓▓▓████▓▓▒█▓▓▓▓▓█▓▒▓█▓██▓▓▓▓▒▓████████████▓▒▒░░░\n░░▒▒▒▓█████▓▓█████████████▓▓██▓█▓▓▒▒▒▒▓█▓██▓▓█████████████▓█████▓▒▒▒░░\n░░▓░▒█████▓▓████████████▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓███████████▓▓▓████▒░▓░░\n░░▓▒▓███▓▓▓████████▓▓▓█▓▓▓▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▓▓▓█▓▓████████▓▓▓███▓▒▓░░\n░░▓▒▓████████▓▓▓▓▓███▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓███▓▓▓▓████████▓▒▓░░\n░░▓▓▓█▓░░░▓█▓▓▓▒▒▒█████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓████▓░▒▓▓▓█▓▒░░▒█▓▓▓░░\n░░░▒▓▓▓░░░░██▓▒░▒▓▒▒▓███████▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓██████▓▒▒▓░░▒██▒░░░▓▓▓░░░░\n░░░░░▒▓▒░░░█▓▒░░░░░░▒▒▓▓████▓▓▓█▓██▓▓█▓█▓▓▓████▓▓▒░░░░░▒░▓█▒░░▒▓▒░░░░░\n░░░░░░░▒▒░░▓▓░░░▒▒▒▒░░░░▒▓▓█▓▓▓▓▓▓▓█▓▒▓▓▓▓▓█▓▓▒░░░░▒▒▒░░░▒▓▒░░▒░░░░░░░\n░░░░░░░░░░░░▓▒▒▒▓▓░░░░░▒▓▒░▒▓▒▓█▓▓▓▓▓▓▓█▓▒▒▒░▒▓▒░░░░░▓▓▒▒▒▒░░░░░░░░░░░\n░░░░░░░░░░░░▓▒▓▓▓▒░░░░▒▓▒░░▒░░▒▒▒▒▓▓▓▒▒▒▒░░▒▒░▒▓░░░░░▒▓▓▒▓▒░░░░░░░░░░░\n░░░░░░░░░░░░▒█▓▓▓▒▒░░░▓▓▒░░░░░░░░░░▒▒░░░░░░░░░▒▓▒░░▒▒▒█▓▓▓░░░░░░░░░░░░\n░░░░░░░░░░░░░▒▓██▓▓▓▒▒▓▓▒░░░░░▒░░░░░░░░░▒░░░░░▒▓▒▒▒▓▓▓██▓░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░▒▓███▓▒▓▓▒▒▒░▒▒▒░░░░░░░░░▒▒▒▒▒▒▒█▓▒████▓░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░▒███████▓▒▒▒▒▒▓░░░░░░░░░▓▓▒▒▒▒▓███████░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░▒▓████████▓▒▒▓▓░░░░░░░░░▓▓▒▓▓█████▓██▓░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░▒▓▓████████████▓▓▒▓▒▒▓▓▓████████████▓▓░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░▒▓▓▓▓▓▓▓▓██▓█▓░▒▓▓███▓▓▒░▓█▓██▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░▒█▓▓▓▓▓▓▓█░░░░░░░░░░░░░█▓▓▓▓▓▓▓█░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░▒█▒▒▒▒▓▓▓▒░░░░░░░░░░░░░▒▓▓▒▒▒▒▓█░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░▒▓▒▓▓▓▓█▓░░░░░░░░░░░░░░░▓▓▓▓▓▒▒▓░░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░▓▒▒▒▓▓▒░░░░░░░░░░░░░░░░░░░▓▓▓▒▒▒▓░░░░░░░░░░░░░░░░░░\n░░░░░░░░░░░░░░░░░░░▒▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░▒▓▓▓░░░░░░░░░░░░░░░░░░░\n");
        System.out.printf("%sTen Shin Han:%s Wow! Gràcies, ací teniu la bola de %d esteles. Per cert, vaig saber que el nostre enemic Boo va trobar una bola de drac en la seua mudança a “Muntanya Perduda”. Vos guiaré a la cova de la  muntanya on viu. No és lluny d’aci\n", tenShinHan, reset, b3);
        System.out.printf("Boo es trobava descansant a la cova. Ja que va tindre molts problemes en els seus anteriors enfrontaments amb Goku aquest no tenia intenció  de lluitar més amb ell, però al veure’l què anava a per la seua estimada  bola de drac de %d estelles, no va reaccionar amb bones maneres.\n", b3);
        System.out.printf("%sBoo%s: Què voleu? La meua bola de drac?\n", boo, reset);
        System.out.printf("%sSon Goku%s: Necessitem reunir-les totes abans que Freezer, el món corre un gran perill! Sabem que tú ja no vols fer mal al planeta. T’ho demanem per favor, pel bé de tots\n", goku, reset);
        return ferIntentsNumeros((int) factor);

    }

    public static boolean nivel4() {
        limpiarConsola();
        int numero = generarAleatorio(8, 12);
        String s1 = generarStringAleatorio(numero, true);
        String s2 = generarStringAleatorio(numero, true);
        String s3 = generarStringAleatorio(numero, true);
        StringBuilder dosVocals = new StringBuilder(generarStringAleatorio(2, true));

        String dosVocalsReverse = dosVocals.reverse().toString();
        int respuesta = contadorString2Caracteres(s1,dosVocals.toString())+contadorString2Caracteres(s2,dosVocals.toString())+contadorString2Caracteres(s3,dosVocals.toString())+contadorString2Caracteres(s1,dosVocalsReverse)+contadorString2Caracteres(s2,dosVocalsReverse)+contadorString2Caracteres(s3,dosVocalsReverse);
        System.out.printf("La respuesta es %d\n",respuesta);
        System.out.printf("Cadena 1: %s\n", s1);
        System.out.printf("Cadena 2: %s\n", s2);
        System.out.printf("Cadena 3: %s\n", s3);
        System.out.printf("Cadena de grandaria 2: %s\n", dosVocals);
        System.out.printf("Cadena de grandaria 2 en reverda: %s\n", dosVocals.reverse());
        return ferIntentsNumeros(respuesta);
    }

    public static boolean nivel5(int b4, int b5, int b6, int b7) {
        limpiarConsola();
        int mincmul1 = calcularMCM(b4, b5);
        int mincmul2 = calcularMCM(b6, b7);
        int respuesta = calcularMCM(mincmul1, mincmul2);
        System.out.printf("La resposta es %d\n", respuesta);
        System.out.printf("%sCèl·lula:%s Maleïts sigueu! L’heu endevinat, però.... he de confessar-\nvos que anava de fanal, i que no tinc cap bola de drac. El que sí puc\n dir-vos es que la resta de boles que neccesiteu las té Freezer. Aneu a\n molestar-lo a ell. Adèu!\n", celula, reset);
        System.out.printf("%sSon Goku:%s Bé, anem corrent al planeta de Freezer a llevar-li les\n boles que resten. Esperem que surta tot bé.\n", goku, reset);
        System.out.printf("Van volar al Planeta Infernal on Freezer esperava al seus\n contrincants per a la lluita final. \n");
        System.out.printf("%sSon Goku:%s Hola Freezer, sabem què trames. No ho permetrem.\n Dóna'ns les boles de drac %d, %d, %d i %d què sabem que tens.\n", goku, reset, b4, b5, b6, b7);
        System.out.printf("%sFreezer:%s De cap manera! Doneu-me vosaltres les vostres. Però\n mireu, com no vull lluitar perquè ja tinc una edat, vos done la\n possibilitat de resoldre aquest conflicte amb una lluita matemàtica. Si\n sabeu dir-me quin és el mínim comú múltiple de %d, %d, %d i %d tot\n haurà acabat.\n", freezer, reset, b4, b5, b6, b7);
        return ferIntentsNumeros(respuesta);
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int generarAleatorio(int min, int max) {

        return ((int) (Math.random() * ((max - min) + 1) + min));
    }

    public static String generarStringAleatorio(int longitud, boolean modoV) {
        String caracteres = "";
        if (modoV) {
            caracteres = "aeiou";
        } else if (modoV == false) {
            caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        }
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = generarAleatorio(0, caracteres.length() - 1);
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();
    }

    public static boolean ferIntentsStrings(String textoAEndevinar) {
        int intentActual = 1;
        boolean haGuanyat;
        do {
            System.out.print("Respuesta: ");
            String tiradaUsuari = scanner.next();
            haGuanyat = comprobarResultadoString(tiradaUsuari, textoAEndevinar);
            intentActual++;
        } while (!haGuanyat && intentActual <= 3);
        return haGuanyat;
    }

    public static boolean ferIntentsNumeros(int numeroAEndevinar) {
        int intentActual = 1;
        boolean haGuanyat;
        do {
            int tiradaUsuari = demanarEnterUsuari();
            haGuanyat = comprobarResultadoNumeros(tiradaUsuari, numeroAEndevinar);
            intentActual++;
        } while (!haGuanyat && intentActual <= 3);
        return haGuanyat;
    }

    public static int demanarEnterUsuari() {

        int numero;
        do {
            System.out.print("Respuesta: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                return numero;

            } else {
                System.out.print("Error! Has introducido un numero menor que 0");
            }

        } while (numero < 0);
        return numero;
    }

    public static boolean comprobarResultadoNumeros(int tiradaUsuari, int numeroAEndevinar) {
        if (tiradaUsuari == numeroAEndevinar) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean comprobarResultadoString(String tiradaUsuari, String textoAEndevinar) {
        if (tiradaUsuari.equals(textoAEndevinar)) {
            return true;
        } else {
            return false;
        }
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

public static int contadorString2Caracteres(String linea, String comprobante) {
    int ocurrencias = 0;
    int index = 0;

    while ((index = linea.indexOf(comprobante, index)) != -1) {
        ocurrencias++;
        index += comprobante.length();
    }

    return ocurrencias;
}

    public static long factorial(int n) {
        if (n < 0) {
            System.out.print("No se puede introducir un número negativo");

        }
        if (n == 0 || n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }

    }
}
