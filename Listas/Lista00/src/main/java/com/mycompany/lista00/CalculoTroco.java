package com.mycompany.lista00;

import java.util.Scanner;

public class CalculoTroco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual o valor do produto?");
        Double valorProduto = leitor.nextDouble();

        System.out.println("qual a quantidade comprada?");
        Double quantidadeProduto = leitor.nextDouble();

        System.out.println("qual o valor pago pelo produto?");
        Double valorPago = leitor.nextDouble();
        
        Double troco = -((valorProduto * quantidadeProduto) - valorPago);
        
        System.out.println(String.format("Seu troco será de R$ %.2f", troco));
    }
}
