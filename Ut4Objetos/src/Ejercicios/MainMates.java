package Ejercicios;

public class MainMates {
    public static void main(String[] args) {
        // Ejemplos de uso de MatematicasUtil
        System.out.println("Área del círculo: " + MatematicasUtil.calcularAreaCirculo(5));
        System.out.println("Perímetro del rectángulo: " + MatematicasUtil.calcularPerimetroRectangulo(4, 6));
        System.out.println("¿Es primo 17? " + MatematicasUtil.esPrimo(17));
        System.out.println("Factorial de 5: " + MatematicasUtil.factorial(5));
        System.out.println("Redondear 3.1415 a 2 decimales: " + MatematicasUtil.redondearDecimal(3.1415, 2));
    }
}