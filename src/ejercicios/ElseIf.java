package ejercicios;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        System.out.println("Introduce dos numeros");
        Scanner lector = new Scanner(System.in);

        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es el mayor");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es el mayor");
        } else {
            System.out.println("son iguales");
        }
    }
}
