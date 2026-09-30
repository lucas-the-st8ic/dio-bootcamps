package br.com.dio.estruturas_condicionais.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    /*Escreva um código que o usuário entre com um
    primeiro número, um segundo número maior que o
    primeiro e escolhe entre a opção par e impar,
    com isso o código deve informar todos os números
    pares ou ímpares (de acordo com a seleção inicial)
    no intervalo de números informados,
    incluindo os números informados
    e em ordem decrescente;*/

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = -1;
        int secondNumber = 0;

        while (firstNumber < 0) {
            System.out.print("Digite um número maior ou igual a zero: ");
            firstNumber = input.nextInt();
         if (firstNumber < 0) {
             System.out.println("Número inválido, digite um número maior ou igual a zero.");
         }
        }

        while (secondNumber <= firstNumber) {
            System.out.print("Digite o segundo número maior que o primeiro: ");
            secondNumber = input.nextInt();
            if (secondNumber <= firstNumber) {
                System.out.println("Número inválido, digite um número maior que o primeiro número digitado.");
            }
            System.out.println();
        }

        for(int i = secondNumber; i >= firstNumber; i--) {
           if (i % 2 == 0) {
               System.out.println(i);
           }
        }

    }
}
