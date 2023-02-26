package com.mycompany.lista01;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {

    public static void main(String[] args) {
        Integer numeroRandomico = ThreadLocalRandom.current().nextInt(0, 10);
        Integer soma = numeroRandomico;
        do {
            numeroRandomico = ThreadLocalRandom.current().nextInt(0, 10);
            soma += numeroRandomico;
            System.out.println(numeroRandomico);
        } while (numeroRandomico != 0);
        
        System.out.println(String.format("a soma dos números é: %d", soma));
    }
}
