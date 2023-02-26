package com.mycompany.ac1.lista02;

import java.util.Scanner;

public class TesteValidacaoNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica metodos = new ValidacaoNumerica();

        System.out.println("entre com um número positivo:");
        Integer numeroUsuario = leitor.nextInt();
        String frase = "";
        
        String exibir = metodos.verificarPrimo(numeroUsuario, frase);
        System.out.println(exibir);
    }
}
