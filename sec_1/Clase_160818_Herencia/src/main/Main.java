package main;

import modelo.Docente;
import modelo.Persona;
import modelo.Trabajador;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setRut("11-1");
        p.setAltura(1.73f);
        p.setEdad(18);
        p.setNombre("Alex");
        
        // toString() --> clase cualquiera
        System.out.println(p.getRut());
        System.out.println(p.getEdad());
        System.out.println(p.getAltura());
        
        Trabajador t = new Trabajador();
        
        t.setRut("22-2");
        t.setNombre("nombre 2");
        t.setAltura(1.1f);
        t.setEdad(1);
        t.setSueldo(1);
        
        Docente d = new Docente();
        
        d.setRut("33-3");
        d.setAltura(1.1f);
        d.setEdad(11);
        d.setNombre("nombre 3");
        d.setSueldo(100);
        d.setTitulo("título");
    }
    
}
