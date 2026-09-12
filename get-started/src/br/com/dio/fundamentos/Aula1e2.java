package br.com.dio.fundamentos;

import java.util.Scanner;

public class Aula1e2 {
    static void main(String[] args) {
        //Comentário simples
        /*Meu comentário de várias linhas
        Ipsum lorem
        */
        /**Java doc comentário**/
        Scanner input = new Scanner(System.in);
        System.out.print("Olá! Qual seu nome? ");
        String name = input.next();
        System.out.print("Qual sua idade? ");
        int age = input.nextInt();
        System.out.println("Olá " +name+ " sua idade é " +
                age+ " anos.");
    }
}
