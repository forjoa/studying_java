import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print in the console
        System.out.println("Hola, ¿cómo vas?");

        // read something in the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String name = sc.nextLine();
        System.out.println("Bienvenido " + name);

        // conditionals
        if (name.equalsIgnoreCase("joaquin")) {
            System.out.println("Sí eres bienvenido");
        } else {
            System.out.println("No eres bienvenido");
        }

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Estamos en la vuelta del bucle número: " + i);
        }

        // for indexed
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");

            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        // functions
        calculate(2, 4);
    }

    // functions: we couldn't create a function inside a function
    public static void calculate(int a, int b) {
        System.out.println("La suma de ambos es: " + (a + b));
    }
}