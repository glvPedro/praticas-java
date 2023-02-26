package com.mycompany.lista01;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com um número de 0 a 10:");
        Integer numeroUsuario = leitor.nextInt();

        Integer numeroRandomico = ThreadLocalRandom.current().nextInt(0, 10);
        Integer contador = 0;

        do {
            contador++;
            numeroRandomico = ThreadLocalRandom.current().nextInt(0, 10);
        } while (numeroRandomico != numeroUsuario);

        if (contador <= 3) {
            System.out.println("você é MUITO sortudo!");

        } else if (contador <= 10) {
            System.out.println("você é sortudo");

        } else {
            System.out.println("é melhor você trocar de profissão.");
        }
    }
}
