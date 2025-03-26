package Ejercicios;

public class Gato extends Animal implements Corredor{
    // Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }

    // Implementación del método moverse
    @Override
    public String moverse() {
        return "Se desliza sigilosamente";
    }

	@Override
	public void correr() {
		   System.out.println("El perro está corriendo.");
    }
}
