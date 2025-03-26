package Ejercicios;

public class Maquinista {
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.setNombre(nombre);
        this.setDni(dni);
        this.setSueldo(sueldo);
        this.setRango(rango);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

}
