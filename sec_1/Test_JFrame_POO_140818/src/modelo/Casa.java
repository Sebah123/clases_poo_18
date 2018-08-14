package modelo;

public class Casa {

    public String numero;
    private int cantHabitaciones;
   
    public Casa() {
        cantHabitaciones = 3;
    }
    public void pintar() {
        System.out.println("Pintando la casa");
    }
}
