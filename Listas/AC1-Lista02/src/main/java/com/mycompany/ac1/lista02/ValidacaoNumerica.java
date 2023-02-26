package com.mycompany.ac1.lista02;

public class ValidacaoNumerica {

    String verificarPrimo(Integer numeroUsuario, String frase) {
        if (numeroUsuario < 0) {
            frase = "número inválido. Adeus!";
            return frase;
        } else {
            if (numeroUsuario % 2 == 0) {
                frase = "composto";
                return frase;
            } else {
                frase = "primo";
                return frase;
            }
        }
    }
}
