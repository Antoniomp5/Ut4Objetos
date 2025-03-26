package Ejercicios;

public class Circulo extends Figura {
    // Atributo adicional
    private double radio;

    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Sobrescribir el método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}


