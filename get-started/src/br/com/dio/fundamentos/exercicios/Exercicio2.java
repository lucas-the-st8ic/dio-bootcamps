package br.com.dio.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    /*Escreva um código que receba o tamanho do lado de um quadrado,
    calcule sua área e exiba na tela.
        - Fórmula: área=lado X lado*/

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side;
        double area;

        System.out.print("Informe o tamanho de um dos lados de um quadrado: ");
        side = input.nextDouble();

        area = side * side;

        System.out.println("A área do quadrado é: " + area);
    }
}
