package com.mycompany.lista01;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosImpares {

    public static void main(String[] args) {

        for (int i = 0; i <= 90; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
