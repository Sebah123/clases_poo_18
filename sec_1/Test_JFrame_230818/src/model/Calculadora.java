package model;

public class Calculadora {
    private String nombre;
    private int num1;
    private int num2;

    public Calculadora(String nombre, int num1, int num2) {
        this.nombre = nombre;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    public int getSuma(){
        return num1 + num2;
    }
}
