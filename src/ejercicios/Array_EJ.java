package ejercicios;

import java.util.Arrays;

public class Array_EJ {

    public static void main(String[] args) {
        // create an array of integers
        int[] numb = new int[3];

        for (int i = 0; i < numb.length; i++) {
            numb[i] = i;
        }

        // for each
        for (int num : numb) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(numb));
    }
}
