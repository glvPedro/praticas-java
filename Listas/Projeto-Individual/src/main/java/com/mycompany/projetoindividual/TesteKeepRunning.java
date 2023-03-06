package com.mycompany.projetoindividual;

import java.util.Scanner;

public class TesteKeepRunning {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n"
                + "1 - Saiba quantas calorias você gasta em uma corrida!\n"
                + "2 - Calcular IMC\n"
                + "3 - Veja algumas curiosidades sobre a corrida e suas modalidades!\n"
                + "4 - Sair\n");

        Integer opcaoEscolhida = leitor.nextInt();

        if (opcaoEscolhida.equals(1) || opcaoEscolhida.equals(2) || opcaoEscolhida.equals(3) || opcaoEscolhida.equals(4)) {
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("qual o seu peso?");
                    Double pesoUsuario = leitor.nextDouble();

                    System.out.println("qual a sua altura?");
                    Double alturaUsuario = leitor.nextDouble();

                    Double calculoIMC = pesoUsuario / (alturaUsuario * alturaUsuario);
                    String frase = "";
                    if (calculoIMC < 18.5) {
                        frase = "abaixo do peso ideial";
                    } else if (calculoIMC < 24.9) {
                        frase = "no peso ideial";
                    } else if (calculoIMC < 29.9) {
                        frase = "acima do peso";
                    } else if (calculoIMC < 34.5) {
                        frase = "com obesidade grau |";
                    } else if (calculoIMC < 39.9) {
                        frase = "com obesidade grau ||";
                    } else {
                        frase = "com obesidade grau |||";
                    }

                    System.out.println(String.format("o seu IMC é de: %.2f. E você está: %s", calculoIMC, frase));
                    break;
                case 2:

                    System.out.println("qual o seu peso?");
                    pesoUsuario = leitor.nextDouble();

                    System.out.println("em qual velocidade você correu?");
                    Integer kmHora = leitor.nextInt();

                    Double caloriasGasta = kmHora * pesoUsuario * 0.0175;

                    Double caloriasGastaEm1Hora = caloriasGasta * 60;
                    System.out.println(String.format("você gasta um total de:"
                            + " %.1f calorias por minuto. Em 1 hora, você gasta"
                            + " um total de: %.1f", caloriasGasta, caloriasGastaEm1Hora));
                    break;
                case 3:
                    System.out.println("Caminhada - Caminhar acelerado "
                            + "30 minutos por dia diminui o risco de um ataque "
                            + "cardíaco em 34%, tanto em homens com em mulheres!\n\n"
                            + "Cooper - Também conhecida como Jogging, "
                            + "foi criada em 1968 pelo Dr. Kenneth Cooper com o intúito"
                            + "de medir o nível de aptidão física dos integrantes "
                            + "das forças armadas americanas. Em um teste de corrida com duração de 12 minutos.\n\n"
                            + "100 Metros Rasos - Em um tiro de 100 metros, o "
                            + "homem mais rápido do mundo Usain Bolt, "
                            + "gasta menos calorias que alguém sentado por 15 "
                            + "minutos numa reunião. Ou até mesmo do que competidores em disputas de arco e flecha!");
                    break;
                case 4:
                    System.out.println("até logo! :)");
                    break;
            }

        } else {
            do {
                System.out.println("Opção inválida, tente novamente!\n");

                System.out.println("Escolha uma opção:\n"
                        + "1 - Saiba quantas calorias você gasta em uma corrida!\n"
                        + "2 - Calcular IMC\n"
                        + "3 - Veja algumas curiosidades sobre a corrida e suas modalidades!\n"
                        + "4 - Sair\n");
                opcaoEscolhida = leitor.nextInt();
            } while (opcaoEscolhida != 1 && opcaoEscolhida != 2 && opcaoEscolhida != 3 && opcaoEscolhida != 4);
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("qual o seu peso?");
                    Double pesoUsuario = leitor.nextDouble();

                    System.out.println("qual a sua altura?");
                    Double alturaUsuario = leitor.nextDouble();

                    Double calculoIMC = pesoUsuario / (alturaUsuario * alturaUsuario);
                    String frase = "";
                    if (calculoIMC < 18.5) {
                        frase = "abaixo do peso ideial";
                    } else if (calculoIMC < 24.9) {
                        frase = "no peso ideial";
                    } else if (calculoIMC < 29.9) {
                        frase = "acima do peso";
                    } else if (calculoIMC < 34.5) {
                        frase = "com obesidade grau |";
                    } else if (calculoIMC < 39.9) {
                        frase = "com obesidade grau ||";
                    } else {
                        frase = "com obesidade grau |||";
                    }

                    System.out.println(String.format("o seu IMC é de: %.2f. E você está: %s", calculoIMC, frase));
                    break;
                case 2:

                    System.out.println("qual o seu peso?");
                    pesoUsuario = leitor.nextDouble();

                    System.out.println("em qual velocidade você correu?");
                    Integer kmHora = leitor.nextInt();

                    Double caloriasGasta = kmHora * pesoUsuario * 0.0175;

                    Double caloriasGastaEm1Hora = caloriasGasta * 60;
                    System.out.println(String.format("você gasta um total de:"
                            + " %.1f calorias por minuto. Em 1 hora, você gasta"
                            + " um total de: %.1f", caloriasGasta, caloriasGastaEm1Hora));
                    break;
                case 3:
                    System.out.println("Caminhada - Caminhar acelerado"
                            + " Caminhada - 30 minutos por dia diminui o risco de um ataque"
                            + " cardíaco em 34%, tanto em homens com em mulheres.\n"
                            + "Cooper - Também conhecida como Jogging,"
                            + "foi criada em 1968, pelo médico e preparador"
                            + "físico norte-americano Dr. Kenneth Cooper criou"
                            + "um teste de corrida de 12 minutos para classificar"
                            + "o nível de aptidão física dos integrantes das"
                            + "forças armadas americanas.\n"
                            + "100 Metros Rasos - Em um tiro de 10 metros, o"
                            + "homem mais rápido do mundo Usain Bolt,"
                            + "gasta menos calorias que alguém sentado por 15"
                            + "minutos numa reunião. Ou até mesmo do que numa competição de arco e flecha.");
                    break;
                case 4:
                    System.out.println("até logo! :)");
                    break;
            }
        }
    }
}