package Ejercicios;

public class Mecanico {
    private String nombre;
    private String telefono;
    private String especialidad;

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setEspecialidad(especialidad);
    }

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}

