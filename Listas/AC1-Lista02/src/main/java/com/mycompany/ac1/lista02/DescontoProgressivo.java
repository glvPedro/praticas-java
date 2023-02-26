package com.mycompany.ac1.lista02;

public class DescontoProgressivo {

    Double calcularDesconto(Double valorProduto, Double quantidadeProduto, Double PorcentagemDesconto) {

        for (Double i = quantidadeProduto; i > 1; i++) {
            PorcentagemDesconto = quantidadeProduto * 0.10;
        }
        return PorcentagemDesconto;
    }

    String exibirNotaFiscal(Double valorProduto, Integer quantidadeProduto, Double valorDesconto) {
        String textoPadronizado = String.format("-------------------------------------------------");

        System.out.println(textoPadronizado);

        System.out.println(String.format("valor do produto: %.2f", valorProduto, "\n"));
        System.out.println(String.format("quantidade do produto: %d", quantidadeProduto));

        System.out.println(textoPadronizado);

        String frase = String.format("valor com desconto: %.2f", valorDesconto);
        return frase;
    }
}
