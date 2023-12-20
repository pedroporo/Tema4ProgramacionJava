/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematica;



/**
 *
 * @author batoi
 */
public class Matematica {
    public static void main(String[] args) {
        System.out.println(primo(4));
        System.out.println(primo(2));
        System.out.println(primo(3));
        System.out.println(primo(-12));
        System.out.println(primo(0));
        System.out.println(primo(1));
        System.out.println(obtindreDivisio(0, 0));
        System.out.println(obtindreAreaRectangle(19.4, 42.4));
        System.out.println(obtindreVolumPrisma(19.4, 42.4, 200));
        System.out.println(obtindreEquacioGrau2(12, 34, 7, true));
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
    public static boolean primo(long a){
        if (a <1){
        return false;
        }
            
        for (int i = 2; i < a; i++) {
            if (a % i== 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int obtindreSuma(int num1, int num2) {
        return num1 + num2;
    }

    public static int obtindreResta(int num1, int num2) {
        return num1 - num2;
    }

    public static int obtindreMultiplicacio(int num1, int num2) {
        return num1 * num2;
    }

    public static double obtindreDivisio(int num1, int num2) {
        return num1 / (double)num2;
    }

    public static int obtindreModul(int num1, int num2) {
        return num1 % num2;
    }

    public static double obtindreArrelQuadrada(double num1) {
        return Math.sqrt(num1);
    }

    public static int obtindrePotencia(int base, int exponent) {
        return (int)Math.pow(base, exponent);
    }

    public static int obtindreAreaRectangle(double base, double altura) {
        return obtindreMultiplicacio((int)base,(int)altura);
    }


    public static int obtindreVolumPrisma(double ample, double alt, double profunditat) {
        int anchoPorProfundidad = obtindreMultiplicacio((int)ample,(int)profunditat);
        int volum = obtindreMultiplicacio(anchoPorProfundidad,(int)alt);
        
        return volum;
    }

    //a=12  b=34 c=7  x1=  -0.250  x2=  -2.583

    public static double obtindreEquacioGrau2(int a, int b, int c, boolean solucio1){
        double resultado=0;
        // calculo sin metodos (-b+√(b^2)-(4*a*c)) / 2*a
        //resultado = (- b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        //resultado = (- b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        

        
        /*double raizCuadrada= obtindreArrelQuadrada(obtindreResta(obtindrePotencia(b, 2), obtindreMultiplicacio(obtindreMultiplicacio(4, a), c)));
        System.out.println(raizCuadrada);
        int sumaRaiz;
        sumaRaiz = obtindreSuma(- b, (int)raizCuadrada);
        System.out.println(sumaRaiz);
        int multiplicacionFinal=obtindreMultiplicacio(2, a);
        System.out.println(multiplicacionFinal);
        double divisionFinal = obtindreDivisio(sumaRaiz, multiplicacionFinal);
        System.out.println(divisionFinal);
        resultado= divisionFinal;*/
        if (solucio1== true){
        resultado=obtindreDivisio(obtindreSuma(- b, (int)obtindreArrelQuadrada(obtindreResta(obtindrePotencia(b, 2), obtindreMultiplicacio(obtindreMultiplicacio(4, a), c)))), obtindreMultiplicacio(2, a));
        }else if (solucio1==false){
        resultado=obtindreDivisio(obtindreResta(- b, (int)obtindreArrelQuadrada(obtindreResta(obtindrePotencia(b, 2), obtindreMultiplicacio(obtindreMultiplicacio(4, a), c)))), obtindreMultiplicacio(2, a));
        }
        //resultado = obtindreDivisio(obtindreSuma(- b,obtindreArrelQuadrada(obtindreResta(obtindrePotencia(b, 2), obtindreMultiplicacio(obtindreMultiplicacio(4, a), c)))), obtindreMultiplicacio(2, a));
        return resultado;
    }
}
