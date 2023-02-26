package com.mycompany.lista00;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("antes de iniciarmos, qual o seu nome?");
        String nomeUsuario = leitor.nextLine();
        
        System.out.println(String.format("olá %s, qual foi o ano do seu nascimento?", nomeUsuario));
        Integer anoNascimentoUsuario = leitor.nextInt();
        
        Integer idadeFutura = 2030 - anoNascimentoUsuario;
        
        System.out.println(String.format("“Em 2030 você terá %d anos!", idadeFutura));
    }
}
