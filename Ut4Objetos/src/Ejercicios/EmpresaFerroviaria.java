package Ejercicios;

public class EmpresaFerroviaria {
    public static void main(String[] args) {
        // Crear un maquinista
        Maquinista maquinista = new Maquinista("Juan", "12345678A", 2500, "Senior");

        // Crear un mecánico
        Mecanico mecanico = new Mecanico("Ana", "987654321", "motor");

        // Crear una locomotora
        Locomotora locomotora = new Locomotora("L123", 3000, 2010, mecanico);

        // Crear vagones
        Vagon vagon1 = new Vagon(1, 10000, 5000, "carbón");
        Vagon vagon2 = new Vagon(2, 15000, 8000, "grano");

        // Crear un tren
        Tren tren = new Tren(locomotora, maquinista);

        // Enganchar vagones al tren
        tren.engancharVagon(vagon1, 0);
        tren.engancharVagon(vagon2, 1);

        // Desenganchar un vagón
        tren.desengancharVagon(0);

        // Mostrar información del tren
        System.out.println("Tren creado con locomotora: " + tren.getLocomotora().getMatricula());
        System.out.println("Maquinista responsable: " + tren.getMaquinista().getNombre());
    }
}
