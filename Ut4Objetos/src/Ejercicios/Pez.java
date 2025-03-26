package Ejercicios;

public class Pez extends Animal implements Nadador {
    // Constructor
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Glu glu");
    }

    // Implementación del método moverse
    @Override
    public String moverse() {
        return "Nada en el agua";
    }

    // Implementación del método nadar
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}

