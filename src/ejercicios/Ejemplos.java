package ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejemplos {

    // float numero_decimal = 1.5;
    int numero_entero = 12;
    String nombre = "Joaquin";
    char caracter = 'a';
    boolean c = true;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre");

        String nombre2 = lector.nextLine();

        System.out.println("Bienvenido " + nombre2);

        System.out.println("introduce tu edad");

        int edad = lector.nextInt();

        System.out.println("Tu edad es: " + edad);

        int i = 0;
        while (i < 10) {
            System.out.println("hola");
            i++;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("adios");
        }

        int z = 0;
        do {
            System.out.println("que tal");
            z++;
        } while (z < 10);

        if (edad > 18) {
            System.out.println("eres una adulto");
        } else {
            System.out.println("eres menor");
        }
    }

}
