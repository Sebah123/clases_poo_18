package main;

import model.Cancion;

public class App {

    public static void main(String[] args) {
        Cancion can = new Cancion(
            "Bandolero",
            "Don Omar",
            "Los Bandoleros",
            2005,
            320,
            "Reggaeton",
            "Tego Calderón"
        );
        System.out.println(can);
    }

}
