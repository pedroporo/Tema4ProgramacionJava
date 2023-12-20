package ActividadesParejas;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author batoi
 */
public class Actividad291 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Introduzca palabra secreta: ");
        String palabraSecreta = scanner.next().toLowerCase();

        boolean acertado=false;
        intentosYComprobacion(acertado,palabraSecreta);
        
    }
    public static void intentosYComprobacion(boolean acertado,String palabraSecreta) {
    do{
            int intento=1;
            do {
                System.out.printf("Intenta averiguar la palabra, intento %d: ",intento);
                String palabraIntento = scanner.next().toLowerCase();
                if (palabraIntento.equals(palabraSecreta)) {
                    System.out.println("Enorabuena!!!");
                    acertado=true;
                    break;
                }
                intento++;
            } while (true);
        
        
        }while (acertado!=true);
    }
}
