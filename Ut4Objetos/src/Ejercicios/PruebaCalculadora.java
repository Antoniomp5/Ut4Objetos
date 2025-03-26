package Ejercicios;

public class PruebaCalculadora {
    public static void main(String[] args) {
        double resultadoSuma = CalculadoraBasica.sumar(5, 3);
        double resultadoResta = CalculadoraBasica.restar(10, 4);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
    }
}

