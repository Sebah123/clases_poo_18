package modelo.herencia;

public class Gerente extends Trabajador{
    private String sectorTrabajo;

    public String getSectorTrabajo() {
        return sectorTrabajo;
    }

    public void setSectorTrabajo(String sectorTrabajo) {
        this.sectorTrabajo = sectorTrabajo;
    }
}
