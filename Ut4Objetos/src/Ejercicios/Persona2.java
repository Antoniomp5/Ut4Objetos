package Ejercicios;

public class Persona2 {
    // Atributos
    private String nombre;
    private String telefono;
    private String email;
    private Direccion direccion;

    // Constructor
    public Persona2(String nombre, String telefono, String email, Direccion direccion) {
        this.nombre = nombre;
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setDireccion(direccion);
    }

    // Método para saludar
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

   
}