package br.com.dio.estruturas_condicionais.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    /* Escreva um código onde o usuário entra com
    um número e seja gerada a tabuada de 1 até 10
    desse número; */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i ++) {
            System.out.println(i + " * " + num +
                    " = " +(i * num));
        }
    }

}
