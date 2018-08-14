package modelo;

public class Computador {
    // Atributos
    // modificador_de_acceso tipo nombre
    public String marca;
    public String velRam;
    public String almcenamiento;
    public String modelo;
    public int precio;
    public String descripcion;
    private boolean encendido;
    
    // Constructor (es)
    public Computador(){
        // constructor vacío
        encendido = true;
        System.out.println("el computador se creo encendido");// comp encendido
    }
    
    // Métodos
    
    // mod_acceso tipo_retorno nombre()
    public void encender(){
        encendido = true;
        System.out.println("Encendido");
    }
    
    public void apagar(){
        encendido = false;
        System.out.println("Apagado.");
    }
    
}
