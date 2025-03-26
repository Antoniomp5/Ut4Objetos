package Ejercicios;

public class Motocicleta extends Vehiculo {
    // Atributo específico de Motocicleta
    private boolean tieneSidecar;

    // Constructor
    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio); // Llamada al constructor de Vehiculo
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamada al método de la clase base
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

