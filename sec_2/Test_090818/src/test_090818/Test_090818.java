package test_090818;

public class Test_090818 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        // Juego --> nombre y precio
//        String nombre = "LOL";
//        int precio = 0;
//        
//        String nombre2 = "God of war";
//        int precio2 = 40000;
//        
//        String nombre3 = "Minecraft";
//        int precio3 = 10000;
        Juego juego1 = new Juego();

        juego1.nombre = "Lig of lellends";
        juego1.precio = 0;

//        lol.nombre = "god of war";
//        lol.precio = 400000;
        Juego juego2 = new Juego();

        juego2.nombre = "god of war";
        juego2.precio = 40000;

        Disco disco = new Disco();
        disco.anio = 1999;
        disco.nombre = "sinfonic";
        disco.pais = "USA";

    }
}
