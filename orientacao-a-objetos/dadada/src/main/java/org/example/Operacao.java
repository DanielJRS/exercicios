package org.example;

public class Operacao {

    public static void soma (Double x, Double y){
        System.out.println("A soma entre " + x + " e " + y + " = " + (x+y));
    }

    public static void subtracao (Double x, Double y) {
        System.out.println("A subtração entre " + x + " e " + y + " = " + (x-y));
    }

    public static void multiplicacao (Double x, Double y) {
        System.out.println("A multiplicação entre " + x + " e " + y + " = " + (x*y));
    }

    public static void divisao (Double x, Double y) {
        System.out.println("A divisão entre " + x + " e " + y + " = " + (x/y));
    }
}
