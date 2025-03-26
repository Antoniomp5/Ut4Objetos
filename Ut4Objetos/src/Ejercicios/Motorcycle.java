package Ejercicios;

public class Motorcycle extends Vehicle {
    // Constructor
    public Motorcycle(String matricula, String marca, int anio, FuelType tipoCombustible) {
        super(matricula, marca, anio, tipoCombustible);
    }

    // Implementación del método calcularVelocidad
    @Override
    public double calcularVelocidad() {
        // Lógica para calcular la velocidad de una motocicleta
        return 100.0; // Velocidad en km/h (ejemplo)
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Motocicleta - " + super.toString();
    }
}
