package com.mycompany.ac1.lista02;

import java.util.Scanner;

public class TesteCalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoNutricao metodos = new CalculoNutricao();

        System.out.println("entre com o seu peso:");
        Double pesoUsuario = leitor.nextDouble();

        System.out.println("entre com a sua altura:");
        Double alturaUsuario = leitor.nextDouble();
       
        Double calculo = metodos.calculaIMC(pesoUsuario, alturaUsuario);
        String frase = String.format("o seu IMC correspondente é de: %.2f", calculo);
        System.out.println(frase);
    }
}
