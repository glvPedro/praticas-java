package com.mycompany.lista00;

import java.util.Scanner;

public class CalculoDeRenda {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("quantos filhos de 0 a 4 anos você tem?");
        Integer filhosAte4 = leitor.nextInt();

        System.out.println("quantos filhos de 4 a 16 anos você tem?");
        Integer filhosAte16 = leitor.nextInt();

        System.out.println("quantos filhos de 16 a 18 anos você tem?");
        Integer filhosAte18 = leitor.nextInt();
        
        Integer totalFilhos = filhosAte4 + filhosAte16 + filhosAte18;
        
        Double valorBolsaAte4 = filhosAte4 * 25.12;
        Double valorBolsaAte16 = filhosAte16 * 15.88;
        Double valorBolsaAte18 = filhosAte18 * 12.44;
        
        Double totalBolsa = valorBolsaAte4 + valorBolsaAte16 + valorBolsaAte18;
        
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilhos, totalBolsa));
    }
}