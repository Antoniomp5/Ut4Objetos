**Introducción**:

 En el mundo de la programación orientada a objetos (OOP, por sus siglas en inglés),
 Java es uno de los lenguajes más populares y utilizados debido a su enfoque en objetos, clases, y su principio de encapsulamiento.
 En este portafolio, exploraremos cómo los objetos en Java representan entidades del mundo real y cómo se pueden implementar en aplicaciones utilizando sus propiedades
 y métodos.

**¿Qué son los Objetos en Java?**

 En Java, un objeto es una instancia de una clase. Las clases son plantillas o moldes que definen los atributos y comportamientos comunes de los objetos,
 mientras que los objetos son instancias concretas de esas clases.
 Los objetos pueden tener atributos (también conocidos como propiedades) y métodos (también conocidos como funciones o comportamientos).

**Conceptos Clave**:

	- Clases: Son plantillas que definen las propiedades y comportamientos de los objetos.

	- Atributos: Son variables que almacenan información sobre el estado del objeto.

	- Métodos: Son funciones que definen las acciones o comportamientos que un objeto puede realizar.

	- Instanciación: El proceso de crear un objeto a partir de una clase.

	- Encapsulamiento: El proceso de ocultar los detalles internos de la clase, permitiendo que el acceso a los atributos
	y métodos sea controlado mediante modificadores de acceso.
**Principales Beneficios de los Objetos en Java**:

	- Modularidad: Los objetos permiten dividir un programa en partes más pequeñas y manejables.
 	Cada objeto se encarga de su propia lógica y datos.

	- Reusabilidad: Una vez que una clase está definida, se pueden crear muchos objetos de esa clase,
 	lo que facilita la reutilización del código.

	- Encapsulamiento: Permite ocultar los detalles internos de la clase, exponiendo solo lo necesario a otras partes del programa.
	Esto facilita el mantenimiento y la actualización del código.

	- Herencia: Permite crear nuevas clases basadas en clases existentes,
 	lo que fomenta la reutilización de código y la creación de jerarquías de clases.

	- Polimorfismo: Permite que un objeto de una clase se trate como un objeto de una clase base,
 	lo que ayuda a implementar comportamientos flexibles y extensibles.


public abstract class Animal {
    // Atributos protegidos
    protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto hacerSonido
    public abstract void hacerSonido();

    // Método abstracto moverse
    public abstract String moverse();

    // Método concreto mostrarInformacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        hacerSonido();
        System.out.println("Movimiento: " + moverse());
    }
}


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

public final class Car extends Vehicle {
    // Constructor
    public Car(String matricula, String marca, int anio, FuelType tipoCombustible) {
        super(matricula, marca, anio, tipoCombustible);
    }

    // Implementación del método calcularVelocidad
    @Override
    public double calcularVelocidad() {
        // Lógica para calcular la velocidad de un coche
        return 120.0; // Velocidad en km/h (ejemplo)
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Coche - " + super.toString();
    }
}

public class Circulo extends Figura {
    // Atributo adicional
    private double radio;

    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Sobrescribir el método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Coche extends Vehiculo {
    // Atributo específico de Coche
    private int numPuertas;

    // Constructor
    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio); // Llamada al constructor de Vehiculo
        this.numPuertas = numPuertas;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamada al método de la clase base
        System.out.println("Número de puertas: " + numPuertas);
    }
}
public class ComparacionParametros {
    
    public static void modificarPrimitivo(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método, numero = " + numero);
    }
    
    public static void modificarObjeto(StringBuilder texto) {
        texto.append(" modificado");
        System.out.println("Dentro del método, texto = " + texto);
    }
    
    public static void main(String[] args) {
        int valorPrimitivo = 5;
        StringBuilder valorObjeto = new StringBuilder("Hola");
        
        System.out.println("Antes de llamar al método, valorPrimitivo = " + valorPrimitivo); // 5
        modificarPrimitivo(valorPrimitivo); // 10
        System.out.println("Después de llamar al método, valorPrimitivo = " + valorPrimitivo); // 5
        
        System.out.println("\nAntes de llamar al método, valorObjeto = " + valorObjeto); // hola
        modificarObjeto(valorObjeto); // hola modificado
        System.out.println("Después de llamar al método, valorObjeto = " + valorObjeto); // hola modificado
    }
}


