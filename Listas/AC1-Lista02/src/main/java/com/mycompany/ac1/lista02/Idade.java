package com.mycompany.ac1.lista02;

public class Idade {

    String classificaIdade(Integer idade) {
        if (idade <= 2) {
            return "bebê";
        } else if (idade <= 11) {
            return "criança";
        } else if (idade <= 19) {
            return "adolescente";
        } else if (idade <= 30) {
            return "jovem";
        } else if (idade <= 60) {
            return "adulto";
        } else {
            return "idoso";
        }
    }
}
