package br.com.dio.fundamentos;

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

        System.out.println(operacao);

        //OPERADORES ARITMETICOS DA CLASSE Math

        double number = 20;
        double secondNumber = 10;
        var raiz = Math.sqrt(number);
        System.out.println("Raiz quadrada de " +number
        +" é: " +raiz);

        var potencia = Math.pow(number, 2);
        System.out.println("Potência de " +number
                +" é: " +potencia);

    }
}
