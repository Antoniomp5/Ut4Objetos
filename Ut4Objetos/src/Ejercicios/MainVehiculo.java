package Ejercicios;

public class MainVehiculo {
    public static void main(String[] args) {
        // Crear un array de tipo Figura
        Figura[] figuras = new Figura[2];

        // Agregar instancias de Circulo y Rectangulo
        figuras[0] = new Circulo("Círculo", 5.0);
        figuras[1] = new Rectangulo("Rectángulo", 4.0, 6.0);

        // Recorrer el array y llamar a los métodos
        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println();
        }
    }
}
