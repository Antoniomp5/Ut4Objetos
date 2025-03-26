package Ejercicios;

public class CalculadoraBasica {

    // Método para sumar dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }
}

