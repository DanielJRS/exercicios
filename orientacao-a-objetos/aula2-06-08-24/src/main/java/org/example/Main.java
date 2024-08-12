package org.example;

import javax.swing.*;
import java.lang.String;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String numberStrg = "123";
//        int number = Integer.parseInt(numberStrg);
//        System.out.println("Convertendo string (texto) para int (número):" + number);
//
//        int num1 = 10;
//        int num2 = 20;
//        int comparisonResult = Integer.compare(num1, num2);
//        System.out.println(comparisonResult);

//        String sdia = JOptionPane.showInputDialog("Digite um número de 1 a 7 e saiba que dia é hoje: ");
        Scanner scanner = new Scanner(System.in); // está definindo o construtor que fará o scanner.
        System.out.print("Digite um número (1 a 7) e saiba qual é o dia da semana: ");
        String sdia = scanner.nextLine(); // está fazendo o construtor pegar os dados inseridos no sout acima.

        int day = Integer.parseInt(sdia); // está passando de string (que veio do construtor) para número (int).


        switch (day) {
            case 1:
                System.out.println("Hoje é domingo.");
//                JOptionPane.showMessageDialog(null, "Hoje é domingo.");
                break;

            case 2:
                System.out.println("Hoje é segunda-feira.");
//                JOptionPane.showMessageDialog(null, "Hoje é segunda-feira.");
                break;

            case 3:
                System.out.println("Hoje é terça-feira.");
//                JOptionPane.showMessageDialog(null, "Hoje é terça-feira.");
                break;

            case 4:
                System.out.println("Hoje é quarta-feira.");
//                JOptionPane.showMessageDialog(null, "Hoje é quarta-feira.");
                break;

            case 5:
                System.out.println("Hoje é quinta-feira.");
//                JOptionPane.showMessageDialog(null, "Hoje é quinta-feira.");
                break;

            case 6:
                System.out.println("Hoje é sexta-feira.");
//                JOptionPane.showMessageDialog(null, "Hoje é sexta-feira.");
                break;

            case 7:
                System.out.println("Hoje é sábado.");
//                JOptionPane.showMessageDialog(null, "Hoje é sábado");
                break;

            default:
                System.out.println("Dia da semana inválido, insira de 1 a 7.");
        }
    }
}