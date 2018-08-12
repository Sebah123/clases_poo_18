package main;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(in.nextLine());

        System.out.print("Ingrese su altura: ");
        float altura = Float.parseFloat(in.nextLine());

        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " es menor de edad");
        }

        System.out.println(nombre);
        System.out.println(altura);
        System.out.println(edad);
    }

}
