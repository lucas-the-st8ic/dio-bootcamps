package br.com.dio.desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação escolhida");
        System.out.println("DEPOSITO / SAQUE / TRANSFERENCIA");
        String operacao = scanner.nextLine();
        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.
        boolean operacaoValida = false;
        if (operacao.equals("DEPOSITO") || operacao.equals("TRANSFERENCIA")
        || operacao.equals("SAQUE")) {
            operacaoValida = true;
        }
        // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.
        scanner.close();
    }
}
