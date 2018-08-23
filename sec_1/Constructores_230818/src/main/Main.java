package main;

import model.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Ferrari", "Enzo", 2002);
        
        System.out.println(v);
        
        System.out.println("Cambiando de dueño");
        v.setDuenio("Bastian Sanhueza");
        v.setPatente("aabb-11");
        
        System.out.println(v);
        
        System.out.println("Cambiando de dueño");
        v.setDuenio("José Villaseca");
        
        System.out.println(v.toString());
    }
    
}
