package model;

public class Cancion {
    // Atributos
    private String nombre;
    private String artista;
    private String disco;
    private int anio;
    // 1 hora en segundos?
    private int duracionSegundos;
    private String genero;
    private String artistaColaborador;
    
    // Constructor
    public Cancion(String nombre, String artista, int anio, 
            int duracionSegundos, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
    }

    public Cancion(String nombre, String artista, String disco, int anio, int duracionSegundos, String genero, String artistaColaborador) {
        this.nombre = nombre;
        this.artista = artista;
        this.disco = disco;
        this.anio = anio;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.artistaColaborador = artistaColaborador;
    }

    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public String getDisco() {
        return disco;
    }

    public int getAnio() {
        return anio;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtistaColaborador() {
        return artistaColaborador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cancion{" + "artista=" + artista + ", anio=" + anio + ", duracionSegundos=" + duracionSegundos + '}';
    }

}
