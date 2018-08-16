package main;

import modelo.Persona;
import modelo.herencia.Gerente;
import modelo.herencia.Trabajador;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setRut("11-1");
        p.setAltura(1.20f);
        p.setNombre("kbzon");
        p.setEdad(22);
        
        System.out.println(p.getRut());
        System.out.println(p.getAltura());
        System.out.println(p.getEdad());
        System.out.println(p.getNombre());
        
        Trabajador tra = new Trabajador();
        
        tra.setAltura(1.5f);
        tra.setEdad(23);
        tra.setNombre("Basti");
        tra.setOficio("Futbolista");
        tra.setSueldo(135000);
        tra.setRut("11.1");
        
        Gerente ger = new Gerente();
        
        ger.setRut("11-1");
        ger.setSectorTrabajo("Sector B");
        ger.setSueldo(99999999);
        
        Gerente asd = new Gerente();//null
        
        asd.setEdad(2);
        
        int sum = p.sumar(2, 5);
        System.out.println(sum);
    }
    
}
