package Ejercicios;

public class Pajaro extends Animal implements Volador {
    // Constructor
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    // Implementación del método moverse
    @Override
    public String moverse() {
        return "Vuela por el aire";
    }

    // Implementación del método volar
    @Override
    public void volar() {
        System.out.println("El pájaro está volando.");
    }
}

