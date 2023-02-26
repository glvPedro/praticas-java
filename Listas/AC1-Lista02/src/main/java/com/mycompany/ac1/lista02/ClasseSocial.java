package com.mycompany.ac1.lista02;

public class ClasseSocial {

    Double rendasSalariais(Double rendaUsuario) {
        return rendaUsuario / 1045.00;
    }

    String devolverClasseSocial(Double rendasSalariais) {
        if (rendasSalariais <= 2.0) {
            return "E";
        } else if (rendasSalariais <= 4.0) {
            return "D";
        } else if (rendasSalariais <= 10.0) {
            return "C";
        } else if (rendasSalariais <= 20.0) {
            return "B";
        } else {
            return "A";
        }
    }
}
