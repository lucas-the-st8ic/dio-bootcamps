package br.com.dio.estruturas_condicionais;

import java.util.Scanner;

public class Aula1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.print("Digite sua idade: ");
        int age = input.nextInt();

        if(age >= 18) {
            System.out.println(name + " você tem " + age + " anos");
            System.out.println("Você pode dirigir.");
        } else {
            System.out.println(name + " tem " + age + " anos");
            System.out.println("Você não pode dirigir.");
        }

        System.out.println("Fim do programa.");
    }
}
