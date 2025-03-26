package Ejercicios;

public abstract class Vehicle implements Maintenance {
    // Atributos privados
    private String matricula;
    private String marca;
    private int anio;
    private FuelType tipoCombustible;
    private static int contadorVehiculos = 0;

    // Constructor
    public Vehicle(String matricula, String marca, int anio, FuelType tipoCombustible) {
        this.matricula = matricula;
        this.marca = marca;
        this.anio = anio;
        this.tipoCombustible = tipoCombustible;
        contadorVehiculos++;
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public FuelType getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(FuelType tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Método abstracto para calcular velocidad
    public abstract double calcularVelocidad();

    // Implementación del método de la interfaz Maintenance
    @Override
    public String obtenerFechaProximoMantenimiento() {
        return "Fecha del próximo mantenimiento: a determinar";
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehicle other = (Vehicle) obj;
        return matricula.equals(other.matricula);
    }

    // Método toString
    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Marca: " + marca + ", Año: " + anio + ", Combustible: " + tipoCombustible;
    }

    // Método estático para obtener el contador de vehículos
    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }
}

