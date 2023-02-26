package com.mycompany.lista01;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com a base:");
        Integer x = leitor.nextInt();

        System.out.println("entre com o expoente:");
        Integer y = leitor.nextInt();

        Integer resultadoPotencia = x;

        for (int i = 1; i < y; i++) {
            resultadoPotencia *= x;
        }
        System.out.println(String.format("%d elevado a %d é igual a: %d", x, y, resultadoPotencia));
    }
}
