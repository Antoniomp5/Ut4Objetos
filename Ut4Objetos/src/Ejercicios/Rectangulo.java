package Ejercicios;

public class Rectangulo extends Figura {
    // Atributos adicionales
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Sobrescribir el método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

