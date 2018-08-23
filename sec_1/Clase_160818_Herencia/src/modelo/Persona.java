package modelo;

public class Persona {

    // Atributos
    private String rut;
    private String nombre;
    private int edad;
    private float altura;

    // settter --> mutadores --> cambian el atri
    // mod_acc tip_ret nombre(parms){// body}
    public void setRut(String rutNuevo) {
        this.rut = rutNuevo;
    }

    public void setAltura(float alturaNueva) {
        this.altura = alturaNueva;
    }

    public void setEdad(int edadNueva) {
        if (edadNueva >= 0) {
            this.edad = edadNueva;
        }else{
            this.edad = 0;
        }
    }
    
    // Accesadores --> get
    // mod_acc tip_ret nombre(parms){// body}
    public String getRut(){
        return this.rut;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public float getAltura(){
        return this.altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
