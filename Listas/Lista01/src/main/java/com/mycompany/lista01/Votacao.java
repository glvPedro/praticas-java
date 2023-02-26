package com.mycompany.lista01;

import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int mussarela = 0;
        int calabresa = 0;
        int quatroQueijos = 0;

        System.out.println("vote para a sua pizza favorita!\n"
                + "para mussarela: 5\n"
                + "para calabresa: 25\n"
                + "para quatro queijos: 50");
        Integer votoUsuario;

        for (int i = 0; i < 10; i++) {
            votoUsuario = leitor.nextInt();

            if (votoUsuario == 5) {
                mussarela++;
            } else if (votoUsuario == 25) {
                calabresa++;
            } else if (votoUsuario == 50) {
                quatroQueijos++;
            }
            /*não consegui fazer um else no qual anule outro voto e que saia
            do laço de repetição*/
        }

        System.out.println("os votos foram os seguintes:");

        System.out.println("--------------------------");

        System.out.println("mussarela: " + mussarela);
        System.out.println("calabresa: " + calabresa);
        System.out.println("quatroQueijos: " + quatroQueijos);

        System.out.println("--------------------------");

        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("a pizza com mais votos foia de mussarela!!!");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("a pizza com mais votos foi a de calabresa!!!");
        } else {
            System.out.println("a pizza com mais votos foi a de quatro quejios!!!");
        }
    }
}