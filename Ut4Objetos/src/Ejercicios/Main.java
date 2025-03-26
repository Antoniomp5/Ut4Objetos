package Ejercicios;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020, 4);

        // Crear un objeto de la clase Motocicleta
        Motocicleta miMoto = new Motocicleta("Harley-Davidson", "Street 750", 2019, false);

        // Mostrar detalles de cada vehículo
        System.out.println("Detalles del Coche:");
        miCoche.mostrarDetalles();

        System.out.println("\nDetalles de la Motocicleta:");
        miMoto.mostrarDetalles();
    }
}

