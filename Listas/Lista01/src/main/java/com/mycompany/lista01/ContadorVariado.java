package com.mycompany.lista01;

import java.util.concurrent.ThreadLocalRandom;

public class ContadorVariado {

    public static void main(String[] args) {

        for (double i = 0; i < 5; i += 0.15) {
            System.out.println(String.format("%.2f", i));
        }
    }
}
