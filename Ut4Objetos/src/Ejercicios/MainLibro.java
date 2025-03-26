package Ejercicios;

public class MainLibro {
    public static void main(String[] args) {
        // Crear varios objetos Libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789", 1605);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321", 1967);
        Libro libro3 = new Libro("El Quijote", "Miguel de Cervantes", "123456789", 1605);
        Libro libro4 = new Libro("Rayuela", "Julio Cortázar", "111213141", 1963);

        // Imprimir cada libro usando el método toString()
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);

        // Comparar dos libros con el mismo ISBN
        System.out.println("\nComparando libro1 y libro3 (mismo ISBN):");
        System.out.println(libro1.equals(libro3)); // Debe imprimir true

        // Comparar dos libros con ISBN diferentes
        System.out.println("\nComparando libro1 y libro2 (ISBN diferentes):");
        System.out.println(libro1.equals(libro2)); // Debe imprimir false
    }
}
