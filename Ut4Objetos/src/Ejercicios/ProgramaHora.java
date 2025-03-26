package Ejercicios;

import java.util.Scanner;

public class ProgramaHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la hora por teclado
        System.out.println("Introduce la hora (formato HH:mm:ss):");
        String[] tiempo = scanner.nextLine().split(":");
        int hora = Integer.parseInt(tiempo[0]);
        int minuto = Integer.parseInt(tiempo[1]);
        int segundo = Integer.parseInt(tiempo[2]);

        // Crear un objeto Hora
        Hora horaActual = new Hora(hora, minuto, segundo);

        // Leer el número de segundos
        System.out.println("Introduce el número de segundos:");
        int n = scanner.nextInt();

        // Mostrar la hora actual y las n siguientes
        System.out.println("Hora introducida: " + horaActual);
        for (int i = 0; i < n; i++) {
            horaActual.incrementarSegundo();
            System.out.println("Hora + " + (i + 1) + " segundo: " + horaActual);
        }

        scanner.close();
    }
}