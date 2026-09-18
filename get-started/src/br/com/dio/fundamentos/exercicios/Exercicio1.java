package br.com.dio.fundamentos.exercicios;

import java.time.Year;
import java.util.Scanner;

public class Exercicio1 {
    /*Escreva um código que receba o nome e o ano de
    nascimento de alguém e imprima na tela a seguinte mensagem:
    "Olá 'Fulano' você tem 'X' anos"*/
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int yearOfBirth;
        int year = Year.now().getValue();

        System.out.print("Qual seu nome? ");
        name = input.nextLine();

        System.out.print("Qual seu ano de nascimento " +name+ "? ");
        yearOfBirth = input.nextInt();

        int age = year - yearOfBirth;


        System.out.println("Olá " +name+ " você tem " +age+ " anos");
    }
}
