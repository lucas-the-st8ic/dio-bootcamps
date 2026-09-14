package br.com.dio.fundamentos;

import java.util.Scanner;

public class Aula4 {
    static void main(String[] args) {
        // OPERADORES ARITMÉTICOS

        var input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        var firstValue = input.nextInt();

        System.out.print("Digite o segundo número: ");
        var secondValue = input.nextInt();

        // Com printf e com println:
        System.out.printf("%s + %s = %s \n", firstValue,
                secondValue, firstValue + secondValue);

        System.out.println(firstValue+
                " + " +secondValue+ " = "
                +(firstValue + secondValue));

    }
}
