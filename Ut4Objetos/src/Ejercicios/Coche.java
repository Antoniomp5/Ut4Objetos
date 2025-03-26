package Ejercicios;

public class Coche extends Vehiculo {
    // Atributo específico de Coche
    private int numPuertas;

    // Constructor
    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio); // Llamada al constructor de Vehiculo
        this.numPuertas = numPuertas;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamada al método de la clase base
        System.out.println("Número de puertas: " + numPuertas);
    }
}
