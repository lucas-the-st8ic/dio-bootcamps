package br.com.dio.fundamentos;

public class Aula4_3 {
    static void main(String[] args) {
        //INCREMENTO E DECREMENTO
        //++ Adiciona 1 ao valor atual da variável,
        // -- Subtrai 1 do valor atual da variável
        /*
        += Adição e atribuição: x += y; equivale a x = x + y,
        -= Subtração e atribuição x -= y; equivale a x = x - y,
        *= Multiplicação e atribuição x *= y; equivale a x = x * y,
        /= Divisão e atribuição x/= y; equivale a x = x / y,
        %= Módulo(resto da divisão) e atribuição:
            x %= y; equivale a x = x % y.
        */
        var value = 50;
        System.out.println(++value);
        System.out.println(value);
    }
    
}
