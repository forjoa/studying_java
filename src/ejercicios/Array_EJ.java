package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Array_EJ {
    // CREACIÓN DE CONSTANTES
    private static final String BIENVENIDA = "Bienvenido a tu calculadora";
    private static final String INTRODUCE_PRIMER_NUMERO = "Introduce el primer número";
    private static final String INTRODUCE_SEGUNDO_NUMERO = "Introduce el segundo número";
    private static final String RESULTADO = "La suma del primer y segundo número es: ";

    // MAIN -> TODO LO QUE SE PINTARÁ
    public static void main(String[] args) {
        System.out.println(BIENVENIDA);
        System.out.println(INTRODUCE_PRIMER_NUMERO);
        Scanner s = new Scanner(System.in);
        int primer_numero = s.nextInt();
        System.out.println(INTRODUCE_SEGUNDO_NUMERO);
        int segundo_numero = s.nextInt();
        suma(primer_numero, segundo_numero);
    }

    // MÉTODOS
    private static void suma(int a, int b) {
        System.out.println(RESULTADO + (a + b));
    }
}
