package br.com.dio.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    /*Escreva um código que receba o nome e a idade de 2 pessoas e
    imprima a diferença de idade entre elas*/
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Qual seu nome? ");
        name = input.nextLine();

        System.out.print("Qual sua idade " +name+ "? ");
        age = input.nextInt();

        input.nextLine();

        String secondName;
        int age2;

        System.out.print("Qual seu nome? ");
        secondName = input.nextLine();

        System.out.print("Qual sua idade " +secondName+ "? ");
        age2 = input.nextInt();

        int ageDifference = Math.abs(age - age2);

        System.out.println("A diferença de idade entre " +name+
                " e " +secondName+ " é de " +ageDifference+ " anos.");
    }
}

