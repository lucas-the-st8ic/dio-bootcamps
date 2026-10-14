package br.com.dio.estruturas_condicionais.exercicios;

import java.util.Scanner;

public class Exercicio4 {

/*Escreva um código onde o usuário informa um número
inicial, posteriormente irá informar outros N números,
a execução do código irá continuar até que o número
informado dividido pelo primeiro número tenha resto
diferente de 0 na divisão, números menores que o
primeiro número devem ser ignorados.     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        int secondNumber;
        int result = 0;
        while (number <= 0) {
            System.out.print("Digite um número maior do que zero: ");
            number = input.nextInt();

            if (number <= 0) System.out.println("Número inválido, insira um valor maior do que zero");
        }

        while (result == 0) {
            System.out.print("Digite um número para realizar o resto da divisão: ");
            secondNumber = input.nextInt();

            if (secondNumber < number) {
                System.out.println("O segundo número não pode ser menor que o primeiro número digitado.");
            } else {
                result = secondNumber % number;
                System.out.print("Resultado do resto da divisão: " +result);
                System.out.println();
            }
        }
    }
}
