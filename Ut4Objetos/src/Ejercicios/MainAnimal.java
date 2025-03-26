package Ejercicios;

public class MainAnimal {
    public static void main(String[] args) {
        // Crear un array de Animal con instancias de cada animal
        Animal[] animales = new Animal[]{
            new Perro("Buddy", 3),
            new Pez("Nemo", 1),
            new Pajaro("Tweety", 2)
        };

        // Recorrer el array y llamar a los métodos
        for (Animal animal : animales) {
            animal.mostrarInformacion();
            System.out.println();

            // Verificar y llamar a las capacidades adicionales
            if (animal instanceof Volador) {
                ((Volador) animal).volar();
            }
            if (animal instanceof Nadador) {
                ((Nadador) animal).nadar();
            }
            if (animal instanceof Corredor) {
                ((Corredor) animal).correr();
            }

            System.out.println();
        }
    }
}

