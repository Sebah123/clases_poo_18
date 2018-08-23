package model;

public class Vehiculo {
    private String patente;     //
    private String marca;       // *
    private String modelo;      // *
    private int anio;           // *
    private String duenio;      // 

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        // patente --> null
        // duenio  --> null
        this.patente = "n/a";
        this.duenio = "s/d";
    }

    public Vehiculo(String patente, String marca, String modelo, int anio, String duenio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.duenio = duenio;
    }

    public Vehiculo(String marca, String modelo, int anio, String duenio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.duenio = duenio;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getDuenio() {
        return duenio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", duenio=" + duenio + '}';
    }

   
    
    
}
