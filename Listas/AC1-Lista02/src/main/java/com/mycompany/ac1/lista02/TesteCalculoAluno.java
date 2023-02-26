package com.mycompany.ac1.lista02;

import java.util.Scanner;

public class TesteCalculoAluno {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        CalculoAluno metodos = new CalculoAluno();

        System.out.println("entre com a sua primeira nota:");
        Double primeiraNota = leitor.nextDouble();

        System.out.println("entre com a sua segunda nota:");
        Double segundaNota = leitor.nextDouble();

        Double mediaFinalNota = metodos.mediaNota(primeiraNota, segundaNota);

        String frase = String.format("sua média é: %.2f", mediaFinalNota);
        System.out.println(frase);
    }
}
