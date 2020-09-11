package _03_array_and_method_in_java.exercise;

import java.util.Arrays;

public class ArrayAggregation {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0;j < arr2.length;j++){
            arr3[arr1.length + j] = arr2[j];
        }
        System.out.println("Array is : " + Arrays.toString(arr3));
    }
}
