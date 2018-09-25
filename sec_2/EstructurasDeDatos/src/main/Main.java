package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Random ran = new Random();
//        
//        int[] numeros = new int[10];
//        
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = ran.nextInt(101);
//        }
        
//        System.out.print("[");
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print(" "+numeros[i]+" ");
//        }
//        System.out.print("]");
        // valores [20     15     21     2]
        // índices [0  1 2 3  4 5 6  7 8 9]
        
//        int cont = 0;
//        int cont2 = 0;
//        
//        for (int i = 0; i < numeros.length; i++) {
//            if(numeros[i] >= 20){
//                cont++;
//            }else{
//                cont2++;
//            }
//        }
//        
//        System.out.println("Mayores o igual a 20: "+cont);
//        System.out.println("Menores a 20: "+cont2);
        
//        int contMayor = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            if(numeros[i] >= 18){
//                contMayor++;
//            }
//        }
//        
//        System.out.println("Mayores de edad: "+contMayor);

        // crear un vector de numeros llamdo v
        // que tenga 20 elementos
        // solo debe tener numeros impares comenzando del 1
        
//        int[] v = new int[20];
//        
//        int cont = 1;
//        for (int i = 0; i < v.length; i++) {
//            v[i] = cont;
//            cont = cont + 2;
//        }
//        
//        for (int i = 0; i < v.length; i++) {
//            System.out.print(v[i]+"-");
//        }
//        
//        
//        
//        
//        int cantidadNumeros = 10;
        
        // Programación -->
        // generar los números de la sucesión de Fibonacci
        
        
        
        // Matrices
        // ancho y alto
        // filas y columnas
        
//        int[][] numeros = new int[3][3];
//        
//        // llenar con 7
//        for (int i = 0; i < numeros.length; i++) { // filas
//            for (int j = 0; j < numeros[i].length; j++) { // columnas
//                numeros[i][j] = ran.nextInt(10);
//            }
//        }
//        
//        for (int i = 0; i < numeros.length; i++) { // filas
//            for (int j = 0; j < numeros[i].length; j++) { // columnas
//                System.out.print(numeros[i][j]+" ");
//            }
//            System.out.println();
//        }
//        
//        System.out.println("Hola");
//        Object[] arreglo = new Object[3];
//        float[] notas = new float[3];
//        
//        notas[0] = 7;
//        notas[1] = 7;
//        notas[2] = 7;
//        
//        arreglo[0] = 30;
//        arreglo[1] = "Pato Pérez";
//        arreglo[2] = notas;
        
//        System.out.println("Cantidad de argumentos: "+args.length);
//        
//        if(args.length == 0){
//            System.out.println("No hay argumentos");
//        }else{
//            if(args[0].equals("-ip")){
//                System.out.println("La ip del servidor es "+args[1]);
//            }
//        }
//        
//        
        
        // Crear una matriz con numeros del 1 al n
        
        int cont            = 1;
        int filas           = 3;
        int columnas        = 3;
        
        int[][] numeros = new int[filas][columnas]; // 3x6
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = cont;
                cont++;
            }
        }
        
        
        for (int i = 0; i < numeros.length; i++) { // filas
            for (int j = 0; j < numeros[i].length; j++) { // columnas
                // operador ternario
                System.out.print((numeros[i][j] < 10 ? "0"+numeros[i][j]: numeros[i][j])+" ");
            }
            System.out.println();
        }
    }
}
