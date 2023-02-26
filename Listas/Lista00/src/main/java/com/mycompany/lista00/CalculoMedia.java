package com.mycompany.lista00;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("entre com o seu nome:");
        String nomeUsuario = leitor.nextLine();
        
        System.out.println("entre com o seu nome:");
        Integer primeiraNota = leitor.nextInt();
        
        System.out.println("entre com o seu nome:");
        Integer segundaNota = leitor.nextInt();
        
        double mediaNota = (primeiraNota + segundaNota) / 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de: %.1f", nomeUsuario, mediaNota));
    }
}
