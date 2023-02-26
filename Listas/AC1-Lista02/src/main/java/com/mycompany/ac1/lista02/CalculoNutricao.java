package com.mycompany.ac1.lista02;

public class CalculoNutricao {
    Double calculaIMC (Double pesoUsuario, Double alturaUsuario){
        return pesoUsuario / (alturaUsuario * alturaUsuario);
    }
    String exibirCalculo(Double calcularIMC){
        String frase = String.format("o seu IMC correspondente é de: %.2f", calcularIMC);
        return frase;
    }
}
