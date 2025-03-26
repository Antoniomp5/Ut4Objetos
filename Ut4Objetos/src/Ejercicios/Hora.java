package Ejercicios;

public class Hora {
    // Atributos de la clase
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor por defecto
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Constructor con parámetros
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        validarHora();
    }

    // Métodos getters y setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
        validarHora();
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
        validarHora();
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
        validarHora();
    }

    // Método para incrementar un segundo
    public void incrementarSegundo() {
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }

    // Método para validar la hora
    private void validarHora() {
        if (segundo >= 60) {
            segundo %= 60;
            minuto++;
        }
        if (minuto >= 60) {
            minuto %= 60;
            hora++;
        }
        if (hora >= 24) {
            hora %= 24;
        }
    }

    // Método para mostrar la hora
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
