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


        System.out.print("Digite o primeiro número: ");
        double firstNumber = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double secondNumber = input.nextDouble();

        // Com printf e com println:
        System.out.printf("%s / %s = %s \n", firstNumber,
                secondNumber, firstNumber / secondNumber);

        System.out.println(firstNumber+
                " / " +secondNumber+ " = "
                +(firstNumber / secondNumber));

        // 10 % 5 = 0; O símbolo de porcentagem retorna o resto da divisão
        // se a divisão não for exata retorna quanto sobrou.
        // EX: 6 % 5 = 1(O resto de 6/5)
    }
}
