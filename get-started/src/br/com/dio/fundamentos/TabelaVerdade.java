package br.com.dio.fundamentos;
public class TabelaVerdade {
    static void main(String[] args) {
        System.out.printf("true && true = %s \n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true && false = %s \n", true && false);
        System.out.printf("false && true = %s \n", false && true);
        System.out.println("==========================");
        System.out.printf("true || true = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true || false = %s \n", true || false);
        System.out.printf("false || true = %s \n", false || true);
        System.out.println("==========================");
        System.out.printf("!true = %s \n", !true);
        System.out.printf("!false = %s \n", !false);
    }
}
