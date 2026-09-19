package br.com.dio.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
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
