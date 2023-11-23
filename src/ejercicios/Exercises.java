package ejercicios;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        // Exercise 1
        int a = 15;
        int b = 8;

        System.out.println("La suma de las variables es: " + (a + b));
        System.out.println("La resta de las variables es: " + (a - b));
        System.out.println("La multiplicación de las variables es: " + (a * b));
        System.out.println("La división de las variables es: " + (a / b));
        System.out.println("El módulo de las variables es: " + (a % b));

        // Exercise 2
        int z = 10;
        int y = 10;

        if (z > y) {
            System.out.println(z + " es mayor que " + y);
        } else if (y > z) {
            System.out.println(y + " es mayor que " + z);
        } else {
            System.out.println("Ambos números son iguales ");
        }

        // Exercise 3
        String name = "Joaquin";
        System.out.println("Bienvenid@ " + name);

        // Exercise 4
        Scanner sc = new Scanner(System.in);
        String nameConsole = sc.nextLine();
        System.out.println("Bienvenid@ " + nameConsole);

        // Exercise 5
        System.out.println("Introduce el radio del círculo para calcular su área");
        double ratio = sc.nextDouble();
        System.out.println("El área del círculo es: " + (Math.PI * Math.pow(ratio, 2)));

        // Exercise 6
        System.out.println("Introduce un número por pantalla para saber si es par o impar");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }

        // Exercise 7
        System.out.println("Introduce un número y te diremos su ASCII");
        int numASCII = sc.nextInt();
        System.out.println("Su letra en ASCII es: " + (char) numASCII);

        // Exercise 8
        System.out.println("Introduce un carácter y te diremos el número ASCII");
        String charASCII = sc.next();
        System.out.println("Su número en ASCII es: " + (int) charASCII.charAt(0));

        // Exercise 9
        System.out.println("Introduce el precio de tu producto");
        double numIVA = sc.nextInt();
        numIVA += numIVA * ((double) 21 / 100);
        System.out.println("El precio del producto con el IVA es: " + numIVA);
    }
}
