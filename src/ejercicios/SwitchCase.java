package ejercicios;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce un número del 1 al 5");
        int numero = lector.nextInt();

        switch (numero) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            default:
                System.out.println("no introdujiste bien");
                break;
        }
    }
}
