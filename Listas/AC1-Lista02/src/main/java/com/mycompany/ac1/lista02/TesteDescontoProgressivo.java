package com.mycompany.ac1.lista02;

import java.util.Scanner;

public class TesteDescontoProgressivo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo metodos = new DescontoProgressivo();

        System.out.println("seja bem vindo ao sistema de desconto progressivo!\n");

        System.out.println("digite o valor unitario do produto:");
        Double valorProduto = leitor.nextDouble();

        System.out.println("digite a quantidade:");
        Integer quantidadeProduto = leitor.nextInt();
        
        String exibir = metodos.exibirNotaFiscal(valorProduto, quantidadeProduto, valorProduto);
        System.out.println(exibir);
    }
}
