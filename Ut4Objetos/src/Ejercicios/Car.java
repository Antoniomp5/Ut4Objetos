package Ejercicios;

public final class Car extends Vehicle {
    // Constructor
    public Car(String matricula, String marca, int anio, FuelType tipoCombustible) {
        super(matricula, marca, anio, tipoCombustible);
    }

    // Implementación del método calcularVelocidad
    @Override
    public double calcularVelocidad() {
        // Lógica para calcular la velocidad de un coche
        return 120.0; // Velocidad en km/h (ejemplo)
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Coche - " + super.toString();
    }
}
