package Ejercicios;

public class PruebaContadorObjetos {
    public static void main(String[] args) {
        // Crear varios objetos de la clase ContadorObjetos
        ContadorObjetos objeto1 = new ContadorObjetos();
        ContadorObjetos objeto2 = new ContadorObjetos();
        ContadorObjetos objeto3 = new ContadorObjetos();

        // Mostrar el número total de objetos creados
        ContadorObjetos.mostrarTotalObjetos();
    }
}
