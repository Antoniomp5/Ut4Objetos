package Ejercicios;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private String fechaNombramiento;

    public JefeEstacion(String nombre, String dni, String fechaNombramiento) {
        this.setNombre(nombre);
        this.setDni(dni);
        this.setFechaNombramiento(fechaNombramiento);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNombramiento() {
		return fechaNombramiento;
	}

	public void setFechaNombramiento(String fechaNombramiento) {
		this.fechaNombramiento = fechaNombramiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


}

