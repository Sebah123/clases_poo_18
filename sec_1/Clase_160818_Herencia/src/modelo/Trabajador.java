package modelo;

// extends --> tipo de...
public class Trabajador extends Persona{
    private long sueldo;

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
}
