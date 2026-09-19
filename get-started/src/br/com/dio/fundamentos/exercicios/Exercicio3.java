package br.com.dio.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base;
        double height;
        double area;

        System.out.print("Digite o valor da base do retângulo: ");
        base = input.nextDouble();

        System.out.print("Agora digite a altura do retângulo: ");
        height = input.nextDouble();

        area = (base * height);

        System.out.println("A area total do retângulo é: " + area);
    }
}
