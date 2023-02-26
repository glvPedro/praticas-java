package com.mycompany.lista00;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com o seu salário bruto:");
        Double salarioBruto = leitor.nextDouble();

        System.out.println("quanto você gasta em transporte em um dia? (somente ida)");
        Double valorTransporte = leitor.nextDouble();

        Double descontoINSS = salarioBruto * 0.10;
        Double descontoIR = salarioBruto * 0.20;
        Double descontoVR = (salarioBruto * 2) / 22;

        Double totalDescontos = descontoINSS + descontoIR + descontoVR;
        Double salarioLiquido = salarioBruto - descontoINSS - descontoIR - descontoVR;

        System.out.println(String.format("Seu salário bruto é R$%.2f,"
                + " tem um total de R$%.2f em descontos e receberá um líquido"
                + " de R$%.2f", salarioBruto, totalDescontos, salarioLiquido));
    }
}
