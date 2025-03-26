package Ejercicios;

public class Profesor extends Persona2 {
    // Atributos
    private String departamento;

    // Constructor
    public Profesor(String nombre, String telefono, String email, Direccion direccion, String departamento) {
        super(nombre, telefono, email, direccion);
        this.setDepartamento(departamento);
    }

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

  
}

