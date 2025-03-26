package Ejercicios;

public class ContadorObjetos {
    // Atributo estático para llevar la cuenta del número total de objetos creados
    private static int totalObjetos = 0;

    // Constructor que incrementa el contador de objetos
    public ContadorObjetos() {
        totalObjetos++;
    }

    // Método estático para mostrar el número total de objetos creados
    public static void mostrarTotalObjetos() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }
}
