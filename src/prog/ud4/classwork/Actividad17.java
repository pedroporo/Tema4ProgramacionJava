/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.classwork;

import java.util.Scanner;
import matematica.Matematica;

/**
 *
 * @author batoi
 */
public class Actividad17 {

    public static Scanner scanner;

  public static void main(String[] args) {
     scanner = new Scanner(System.in);
      mensajeBienvenidaYOpciones();

      int opcion;
      do {
          System.out.print("Seleccione una opció [1-8]: ");
           opcion = leerNumero();
          if (opcion < 1 || opcion > 8) {

              System.out.println("Error! L'opció seleccionada no és vàlida. Introduïx-la de nou");

          }
          if (opcion < 0) {

              System.out.println("Error! ha d’introduïr un número enter");

          }
      } while (opcion < 1 || opcion > 8);


      calculator(opcion);
      System.out.println("Fins altra!");
  }

  public static void mensajeBienvenidaYOpciones() {
      System.out.println("Benvingut a Calculator");
      System.out.println("----------------------");
      System.out.println("Quina operació desitja realitzar?");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicació");
      System.out.println("4. Divisió");
      System.out.println("5. Àrea d'un rectangle");
      System.out.println("6. Volum d'un prisma");
      System.out.println("7. Equació de segon grau");
      System.out.println("8. Eixir");

  }

  public static int leerNumero() {
 
      int opcion = 0;
      boolean com=false;

          do {

              if (scanner.hasNextInt()) {
                  opcion = scanner.nextInt();
                  com=true;
              } else {
                  scanner.next();
              }

          } while (com==false);

      return opcion;
  }
  public static double leerNumeroDouble() {
 
      double opcion = 0;
      boolean com=false;

          do {

              if (scanner.hasNextDouble()) {
                  opcion = scanner.nextDouble();
                  com=true;
              } else {
                  scanner.next();
              }

          } while (com==false);

      return opcion;
  }

  public static void calculator(int opcion) {
      int modoTexto=0;
      switch (opcion) {
              case 1:
                  //Suma
                  modoTexto = 1;
                  break;
              case 2:
                  //Resta
                  modoTexto = 1;
                  break;
              case 3:
                  //Multiplicacion
                  modoTexto = 1;
                  break;
              case 4:
                  //Division
                  modoTexto = 1;
                  break;

              case 5:
                  //Area reectangulo
                  modoTexto = 2;
                  break;
              case 6:
                  //Volumen Prisma
                  modoTexto = 3;
                  break;
              case 7:
                  //Ecuacion 2 grado
                  modoTexto = 4;
                  break;
              case 8:

                  break;

      }
      if (modoTexto==1){
          System.out.print("Introduïsca els operants esquerra i dreta: ");
      }else if (modoTexto==2){
          System.out.print("Introduïsca la base i altura del rectangle: ");
      }else if (modoTexto==3){
          System.out.print("Introduïsca el valor de les tres dimensions: ");
      }else if (modoTexto==4){
          System.out.print("Introduïsca els valors de a, b i c, respectivament: ");
      }
      if (opcion==1){
          int num1=leerNumero();
          int num2=leerNumero();
          System.out.printf("%d + %d = %d\n", num1, num2, Matematica.obtindreSuma(num1, num2));
      }else if (opcion==2){
          int num1=leerNumero();
          int num2=leerNumero();
          System.out.printf("%d - %d = %d\n", num1, num2, Matematica.obtindreResta(num1, num2));
      }else if (opcion==3){
          int num1=leerNumero();
          int num2=leerNumero();
          System.out.printf("%d * %d = %d\n", num1, num2, Matematica.obtindreMultiplicacio(num1, num2));
      }else if (opcion==4){
          int num1=leerNumero();
          int num2=leerNumero();
          System.out.printf("%d / %d = %.3f\n", num1, num2, Matematica.obtindreDivisio(num1, num2));
      }else if (opcion==5){
          double ample=leerNumeroDouble();
          double alt=leerNumeroDouble();
          System.out.printf("%.1f x %.1f = %d\n", ample, alt, Matematica.obtindreAreaRectangle(ample, alt));
      }else if (opcion==6){
          double ample=leerNumeroDouble();
          double alt=leerNumeroDouble();
          double profunditat=leerNumeroDouble();
          System.out.printf("%.1f x %.1f x %.1f = %d\n", ample, alt, profunditat, Matematica.obtindreVolumPrisma(ample, alt, profunditat));
      }else if (opcion==7){
          int a=leerNumero();
          int b=leerNumero();
          int c=leerNumero();

          System.out.printf("%+dx^2 %+dx %+d = 0 x1 = %.3f x2 = %.3f\n", a, b, c, Matematica.obtindreEquacioGrau2(a, b, c, true), Matematica.obtindreEquacioGrau2(a, b, c, false));
      }


  }
}
