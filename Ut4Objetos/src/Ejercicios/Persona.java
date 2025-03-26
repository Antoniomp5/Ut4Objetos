package Ejercicios;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private double estatura;
    private Sexo sexo;

    // Constructor por defecto
    public Persona() {
        this.nombre = "anónimo";
        this.edad = 18;
        this.estatura = 1.70;
        this.sexo = Sexo.HOMBRE; // Valor por defecto
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad, double estatura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
    }

    // Método para cumplir años
    public void cumplirAños() {
        this.edad += 1;
    }

    // Método para crecer
    public void crecer(double incremento) {
        this.estatura += incremento;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    // Método para mostrar la información de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", sexo=" + sexo +
                '}';
    }
}
