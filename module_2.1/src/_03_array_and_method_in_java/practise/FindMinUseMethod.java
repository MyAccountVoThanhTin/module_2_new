package _03_array_and_method_in_java.practise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinUseMethod {
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {12, 4, 25, 45, 40, 22, 1, -3, -2};
        System.out.println("Value min in list " + Arrays.toString(array) + " is: ");
        System.out.println(min(array));
    }
}
