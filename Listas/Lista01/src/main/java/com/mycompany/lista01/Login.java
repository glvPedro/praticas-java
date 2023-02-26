package com.mycompany.lista01;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String login = "admin";
        String senha = "#SPtech2022";

        System.out.println("entre com o seu login de acesso:");
        String loginUsuario = leitor.nextLine();

        System.out.println("entre com a sua senha de acesso:");
        String senhaUsuario = leitor.nextLine();

        if (loginUsuario.equals(login) && senhaUsuario.equals(senha)) {
            System.out.println("login realizado com sucesso!");
        } else {
            System.out.println("login e/ou senha inválidos!");

            do {
                System.out.println("entre com o seu login de acesso:");
                loginUsuario = leitor.nextLine();

                System.out.println("entre com a sua senha de acesso:");
                senhaUsuario = leitor.nextLine();
                System.out.println("login e/ou senha inválidos!");

            } while (!loginUsuario.equals(login) && !senhaUsuario.equals(senha));
        }
    }
}
