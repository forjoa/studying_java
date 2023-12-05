package ejercicios;

import java.util.*;

public class ajedrez {
    public static void main(String[] args) {
        int[] array_con_longitud = new int[10]; // el array tendrá una longitud de 10 elementos
        int[] array_con_valores = new int[]{10, 22, 3}; // el array tendrá 3 elementos: 10, 22 y 3

        // RECOGER DATOS DE UN ARRAY
        array_con_longitud[2] = 12;

        // Como imprimir un array sin que te salgan errores
        System.out.println(Arrays.toString(array_con_longitud));

    }

}
