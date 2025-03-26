package Ejercicios;

public abstract class Animal {
    // Atributos protegidos
    protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto hacerSonido
    public abstract void hacerSonido();

    // Método abstracto moverse
    public abstract String moverse();

    // Método concreto mostrarInformacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        hacerSonido();
        System.out.println("Movimiento: " + moverse());
    }
}
