package Ejercicios;

public class Direccion {
    // Atributos
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;

    // Constructor
    public Direccion(String calle, String ciudad, String provincia, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    // Métodos para validar e imprimir la dirección
    public boolean validar() {
        // Lógica para validar la dirección
        return !calle.isEmpty() && !ciudad.isEmpty() && !provincia.isEmpty() && !codigoPostal.isEmpty() && !pais.isEmpty();
    }

    public void imprimir() {
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal + ", " + pais);
    }


}

