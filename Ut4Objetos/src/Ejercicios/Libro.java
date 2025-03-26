package Ejercicios;

public class Libro {
    // Atributos de la clase
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
    }

    // Sobrescribir el método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Libro otroLibro = (Libro) obj;
        return isbn.equals(otroLibro.isbn);
    }

}

