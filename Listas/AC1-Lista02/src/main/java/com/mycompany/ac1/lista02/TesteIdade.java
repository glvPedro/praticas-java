package com.mycompany.ac1.lista02;

import java.util.Scanner;

public class TesteIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Idade metodos = new Idade();
        
        System.out.println("qual a sua idade?");
        Integer idade = leitor.nextInt();
        
        String exibirFaixaEtaria = metodos.classificaIdade(idade);
        
        String frase = String.format("você é considerado: %s", exibirFaixaEtaria);
        System.out.println(frase);
    }
}
