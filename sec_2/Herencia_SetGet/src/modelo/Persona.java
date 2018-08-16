package modelo;

public class Persona {
    // Atributos 
    private String rut;
    private int edad;
    private float altura;
    private String nombre;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Debo crear un método que sume dos números enteros
    // por parámetro, y retorne dicho resultado
    public int sumar(int n1, int n2){
        return n1 + n2;
    }
    
    
}
