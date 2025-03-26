package Ejercicios;

public class MainVehicle {
    public static void main(String[] args) {
        // Crear instancias de Car y Motorcycle
        Car carro = new Car("1234ABC", "Toyota", 2020, FuelType.GASOLINA);
        Motorcycle moto = new Motorcycle("5678XYZ", "Honda", 2019, FuelType.ELECTRICO);

        // Mostrar información de los vehículos
        System.out.println(carro);
        System.out.println("Velocidad del coche: " + carro.calcularVelocidad() + " km/h");
        System.out.println("Próximo mantenimiento del coche: " + carro.obtenerFechaProximoMantenimiento());

        System.out.println();

        System.out.println(moto);
        System.out.println("Velocidad de la motocicleta: " + moto.calcularVelocidad() + " km/h");
        System.out.println("Próximo mantenimiento de la motocicleta: " + moto.obtenerFechaProximoMantenimiento());

        // Mostrar el número total de vehículos creados
        System.out.println("\nTotal de vehículos creados: " + Vehicle.getContadorVehiculos());
    }
}
