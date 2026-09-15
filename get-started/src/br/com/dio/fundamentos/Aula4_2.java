package br.com.dio.fundamentos;

import java.util.Scanner;

public class Aula4_2 {
    static void main(String[] args) {
        // PRECEDENCIA

        /*Para alterar a precedencia, basta adicionar a operacao
        * entre parenteses.
        * EX: (5 + 9) * (10 - 5) / 2 = 35*/

        var operacao = 5 + 9 * 10 - 5 / 2;
        // 5 + 90 - 2
        // 5 + 90 = 95
        //95 - 2 = 93

        System.out.print(operacao);
    }
}
