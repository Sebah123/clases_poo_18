package main;

import model.Cancion;

public class App {

    // https://stackoverflow.com/questions/477750/primitive-type-short-casting-in-java
    // https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.2
    public static void main(String[] args) {
        Cancion can = new Cancion(
            "Bandolero",
            "Don Omar",
            "Los Bandoleros",
            (short)2005,
            (short)320,
            "Reggaeton",
            "Tego Calderón"
        );
        System.out.println(can);
    }

}
