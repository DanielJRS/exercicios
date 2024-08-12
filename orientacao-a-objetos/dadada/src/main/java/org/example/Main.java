package org.example;

import javax.swing.*;

import static org.example.Operacao.soma;

public class Main {
    public static void main(String[] args) {

//        String nome = "Daniel";
//        String nome2 = JOptionPane.showInputDialog("Digite seu nome: ");
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
//
//        System.out.println("Olá " + nome2 + ", você tem " + idade + " anos.");

            Operacao operacao = new Operacao();

            operacao.soma(2.0, 3.0);
            operacao.subtracao(5.0, 4.0);
            operacao.multiplicacao(2.0, 7.0);
            operacao.divisao(8.0, 2.0);
        }
    }