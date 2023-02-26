package com.mycompany.lista00;

import java.util.Scanner;

public class Calorias {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("quantos minutos você dedica se aquecendo?");
        Integer minutosAquecimento = leitor.nextInt();

        System.out.println("quantos minutos você dedica no aeróbico?");
        Integer minutosAerobico = leitor.nextInt();

        System.out.println("quantos minutos você dedica na musculação?");
        Integer minutosMusculacao = leitor.nextInt();

        Integer caloriasAquecimento = minutosAquecimento * 12;
        Integer caloriasAerobico = minutosAerobico * 20;
        Integer caloriasMusculacao = minutosMusculacao * 25;

        Integer totalMinutos = minutosAquecimento + minutosAerobico + minutosMusculacao;
        Integer totalCalorias = caloriasAquecimento + caloriasAerobico + caloriasMusculacao;

        System.out.println(String.format("Olá, Jorge. Você fez um total de "
                + "%d minutos de exercícios e perdeu cerca de %d calorias",
                 totalMinutos, totalCalorias));
    }
}
