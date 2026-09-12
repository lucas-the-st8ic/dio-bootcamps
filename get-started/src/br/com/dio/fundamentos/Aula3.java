package br.com.dio.fundamentos;

import java.util.Scanner;

public class Aula3 {
    static void main(String[] args) {

        // operador de atribuição =
        //operador de igualdade ==
        // operador de diferença != (x é diferente de y?/ x != y)
        // ! operador de negação inverte o valor booleano, se for verdadeiro vira falso,
        // se for falso vira verdadeiro

        var input = new Scanner(System.in);
        System.out.print("Quanto é 2 + 2 ? ");
        var resultado = input.nextInt();
        System.out.printf("O resultado é 4, você acertou? %s \n", resultado == 4);

        /* Com booleano
        System.out.print("Quanto é 2 + 2 ? ");
        var resultado = input.nextInt();
        var isWrong = result != 4;
        System.out.printf("O resultado é 4, você errou? %s ", isWrong);*/

        System.out.print("\nQuantos anos você tem? ");
        var age = input.nextInt();

        var isLegalAge = age >= 18;

        System.out.printf("Você pode dirigir? %s \n", isLegalAge);
    }
}
