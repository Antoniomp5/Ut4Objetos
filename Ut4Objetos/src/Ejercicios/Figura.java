package Ejercicios;

public class Figura {
    // Atributo protegido
    protected String nombre;

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método para calcular el área
    public double calcularArea() {
        return 0.0;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
    }
}

