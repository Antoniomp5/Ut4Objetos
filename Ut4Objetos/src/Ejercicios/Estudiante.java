package Ejercicios;

public class Estudiante extends Persona2 {
    // Atributos
    private String carnetId;
    private double notaMedia;

    // Constructor
    public Estudiante(String nombre, String telefono, String email, Direccion direccion, String carnetId, double notaMedia) {
        super(nombre, telefono, email, direccion);
        this.setCarnetId(carnetId);
        this.notaMedia = notaMedia;
    }

    // Método para determinar si el estudiante es matrícula de honor
    public boolean esMatriculaHonor() {
        return notaMedia >= 9.0;
    }

	public String getCarnetId() {
		return carnetId;
	}

	public void setCarnetId(String carnetId) {
		this.carnetId = carnetId;
	}

}

