package com.mycompany.lista01;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com um número de 1 a 100");
        Integer numeroUsuario = leitor.nextInt();
        Integer numeroSorteado;

        int contador = 0;
        Integer numerosImpares = 0;
        Integer numerosPares = 0;

        do {
            numeroSorteado = ThreadLocalRandom.current().nextInt(1, 100);
            contador++;

            if (numeroSorteado % 3 == 0) {
                numerosImpares++;
            } else {
                numerosPares++;
            }
        } while (contador <= 200 && numeroSorteado != numeroUsuario);

        System.out.println(String.format("o seu número apareceu no %d° sorteio!", contador));
        System.out.println(String.format("foram sorteados %d números impares!", numerosImpares));
        System.out.println(String.format("foram sorteados %d número pares!", numerosPares));
    }
}
