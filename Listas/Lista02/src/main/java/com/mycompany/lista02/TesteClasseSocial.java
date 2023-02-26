package com.mycompany.lista02;

import java.util.Scanner;

public class TesteClasseSocial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClasseSocial metodos = new ClasseSocial();

        System.out.println("digite a sua renda:");
        Double rendaUsuario = leitor.nextDouble();

        Double rendaClasseSocial = metodos.rendasSalariais(rendaUsuario);

        String fraseSalariosMinimos = String.format("você recebe aproximadamente: %.2f salários mínimos!", rendaClasseSocial);
        System.out.println(fraseSalariosMinimos);

        String fraseClasseSocial = String.format("você pertênce a classe social:", metodos.devolverClasseSocial(rendaClasseSocial));
        System.out.println(fraseClasseSocial);
    }
}
