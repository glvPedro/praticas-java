package com.mycompany.lista00;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("qual o limite de peso do elevador?");
        Double pesoLimiteElevador = leitor.nextDouble();
        
        System.out.println("qual o limite de pessoas dentro do elevador?");
        Integer limitePessoa = leitor.nextInt();
        
        System.out.println("qual o peso da primeira pessoa que entrou?");
        Double pesoPessoa1 = leitor.nextDouble();
        
        System.out.println("qual o peso da segunda pessoa que entrou?");
        Double pesoPessoa2 = leitor.nextDouble();
        
        System.out.println("qual o peso da terceira pessoa que entrou?");
        Double pesoPessoa3 = leitor.nextDouble();
        
        Double pesoAtual = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;
        
        System.out.println(String.format("entraram 3 pessoas no elevador,"
                + " no qual permitem: %d, pessoas. O peso total no elevador"
                + " é de: %.2f, sendo que ele suporta: %.2f", limitePessoa, pesoAtual,pesoLimiteElevador));
    }
}
