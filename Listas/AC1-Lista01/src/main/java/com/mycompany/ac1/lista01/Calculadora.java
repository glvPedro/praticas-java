package com.mycompany.ac1.lista01;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número correspondente a operação desejada:\n"
                + "1 - Soma\n"
                + "2 - Multiplicação\n"
                + "3 - Divisão\n"
                + "4 - Subtração\n"
                + "5 - potência\n"
                + "6 - resto\n"
                + "0 – Sair");

        Integer opcaoEscolhida = leitor.nextInt();

        if (opcaoEscolhida < 0 || opcaoEscolhida > 6) {
            System.out.println("Opção inválida, tente novamente");
        } else {

            System.out.println("Digite um número inteiro:");
            Integer numeroUsuario = leitor.nextInt();

            for (int i = 1; i <= 10; i++) {

                switch (opcaoEscolhida) {
                    case 1:
                        Integer soma = numeroUsuario + i;
                        System.out.println(String.format(
                                "%d + %d = %d", numeroUsuario, i, soma));
                        break;
                    case 2:
                        Integer multiplicacao = numeroUsuario * i;
                        System.out.println(String.format(
                                "%d * %d = %d", numeroUsuario, i, multiplicacao));
                        break;
                    case 3:
                        Integer divisao = numeroUsuario / i;
                        System.out.println(String.format(
                                "%d / %d = %d", numeroUsuario, i, divisao));
                        break;
                    case 4:
                        Integer subtracao = numeroUsuario - i;
                        System.out.println(String.format(
                                "%d - %d = %d", numeroUsuario, i, subtracao));
                        break;
                    case 5:
                        Integer potencia = numeroUsuario;

                        for (i = numeroUsuario; i <= 10; i++) {
                            potencia *= numeroUsuario;
                            System.out.println(String.format(
                                    "%d ** %d = %d", numeroUsuario, i, potencia));
                        }

                        break;
                    case 6:
                        Integer resto = numeroUsuario % i;
                        System.out.println(String.format(
                                "%d // %d = %d", numeroUsuario, i, resto));
                        break;
                    case 0:
                        System.out.println("até logo!");
                        break;
                }
            }
        }
    }
}
