package com.mycompany.lista00;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com o primeiro número real:");
        int x = leitor.nextInt();

        System.out.println("entre com o segundo número real:");
        int y = leitor.nextInt();

        int soma = x + y;
        int subtracao = -(x - y);
        int multiplicacao = x * y;
        double divisao = x / y;

        double resto = x % y;
        double exponente = x;

        for(int i = 1; i < y; i++){
            exponente *= x;
        }

        System.out.println(String.format("o resultado da soma é: %d\n"
                + "o resultado da subtração é: %d\n"
                + "o resultado da multiplicação é: %d\n"
                + "o resultado da divisão é: %.1f\n"
                + "o resto da divisão é: %.1f\n"
                + "a potênciação entre ambos é de: %.1f",
                soma, subtracao, multiplicacao, divisao, resto, exponente
        ));
    }
}
