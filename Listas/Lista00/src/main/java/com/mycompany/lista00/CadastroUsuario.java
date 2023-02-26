package com.mycompany.lista00;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("entre com o seu login:");
        String loginUsuario = leitor.nextLine();

        System.out.println("entre com a sua senha:");
        String senhaUsuario = leitor.nextLine();

        System.out.println("quantidade de tentativas até o bloqueio:");
        Integer tentativasUsuario = leitor.nextInt();

        System.out.println(String.format("\"Seu login é %s e sua senha é %s."
                + " Você tem %d tentativas antes de ser bloqueado",
                loginUsuario, senhaUsuario, tentativasUsuario));
    }
}
