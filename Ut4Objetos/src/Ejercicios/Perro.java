package Ejercicios;

public class Perro extends Animal implements Corredor {
    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    // Implementación del método moverse
    @Override
    public String moverse() {
        return "Corre en cuatro patas";
    }

    // Implementación del método correr
    @Override
    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}

