package modelo.herencia;

import modelo.Persona;

public class Trabajador extends Persona{
    private String oficio;
    private long sueldo;

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
