package Ejercicios;

public class Vehiculo {
    // Atributos comunes a todos los vehículos
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método para mostrar detalles del vehículo
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
