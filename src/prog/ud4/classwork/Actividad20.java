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
public class Actividad20 {
    private static Scanner teclat;
    public static void main(String[] args) {
        teclat = new Scanner(System.in);
        invertirONo();
        
    }
    
    /*--------------------------Metodo nivel 1-------------------------------*/
    public static void invertirONo(){
        
        introduccion();
        double interesAnual = obtenirInteresAnual();
        double capitalInvertit = obtenirCapitalAInvertir(); 
        double ayudaGobern = obtenirAjudaGovern(capitalInvertit);
        mostrarResultadoInversion(interesAnual, capitalInvertit, ayudaGobern);
        
        
    }
     /*--------------------------Metodo nivel 2-------------------------------*/
    public static void introduccion(){
        System.out.println("Batoi INVERSIONS 2023");
        System.out.println("=====================");
    }
    
    public static double obtenirValorFuturInversio( double capitalInvertit, double interesMensual,int numAnys){
        // valorFutur = capitalInvertit * ((1 + interesMensual)^(numAnys * 12))
        double valorFutur = capitalInvertit * Math.pow((1 +interesMensual), (numAnys*12));
    return valorFutur;
    }
    
    
    public static double obtenirAjudaGovern(double capitalInvertit){
        if (capitalInvertit>10000){
        return 25;
        }else if(capitalInvertit>50000){
        return 50;
        }
    return -1;
    }
    public static void mostrarResultadoInversion(double interesAnual,double capitalInvertit,double ayudaGobern){
    System.out.println("Any \t Valor Futur(+ajuda) \t Indicació");
        System.out.println("=============================================");
        for (int i = 1; i <= 15; i++) {
            double valorFutur=obtenirValorFuturInversio(capitalInvertit, interesAnual/12, i);
            
            System.out.printf("%d \t %.2f€ (+%.2f€) \t %s\n",i,valorFutur,ayudaGobern,flechaInversion(capitalInvertit, valorFutur+ayudaGobern));
        }
    }
    /*--------------------------Metodo nivel 3-------------------------------*/
    public static double obtenirInteresAnual(){
        String missage =("Interès anual (%%): ");
        double numero = demanarEnterUsuari(missage, 0);
        double porcentaje = numero/100;
    return porcentaje;
    }
    public static double obtenirCapitalAInvertir(){
        String missage =("Capital a invertir (€): ");
    return demanarEnterUsuari(missage, 0);
    }
    
    
     /*--------------------------Metodo nivel 4-------------------------------*/
    
    public static double demanarEnterUsuari(String missatge,int min) {
        
        double numero;
        do{
        numero = demanarEnterUsuari(missatge);
            if (numero>min){
                return numero;
                
            }else{
            System.out.printf("Error! Les dades introduïdes no són correctes\n");
            }
            
        }while(numero<=min);
       return numero;
    }
    
    public static double demanarEnterUsuari(String missatge) {
        do {
            System.out.printf(missatge);
            if (teclat.hasNextDouble()){
                return teclat.nextDouble();
            }
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            teclat.next();
        } while (true);
    }
    
    public static String flechaInversion(double capitalInvertit, double totalObtingut){
        //Colores
    String reset = "\u001B[0m";
    String rojo = "\u001B[31m";
    String verde = "\u001B[32m";
    String amarillo = "\u001B[33m";
    String azul = "\u001B[34m";
    //Flechas
    //beneficio menor del 25% del capital invertido
    String flechaRojaAbajo = "\u2193";
    //beneficio mayor a 25% i menor del 50% del capital invertido
    String flechaAmarillaRecta = "\u2192";
    //beneficio mayor a 50% i menor del 75% del capital invertido
    String flechaAzulEmpinada = "\u2197";
    //beneficio es al menos el 75% del capital
    String flechaVerdeArriba = "\u2191";
    
    double beneficio= Math.abs(totalObtingut - capitalInvertit);
        if (beneficio<(capitalInvertit*0.25)) {
            return rojo + flechaRojaAbajo + reset;
        }else if (beneficio > (capitalInvertit*0.25) && beneficio < (capitalInvertit*0.50)){
        return amarillo + flechaAmarillaRecta + reset;
        }else if (beneficio > (capitalInvertit*0.50) && beneficio < (capitalInvertit*0.75)){
        return azul + flechaAzulEmpinada + reset;
        }else if (beneficio >= (capitalInvertit*0.75)){
        return verde + flechaVerdeArriba + reset;
        }

    return "";
    }
}
