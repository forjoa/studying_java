package Conexion;

public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void informacion() {
        System.out.println("Mi nombre es: " + this.nombre + " y tengo " + this.edad);
    }
}
