package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void deleteArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        System.out.println("Enter size : ");
        size = scanner.nextInt();
        array = new int[size];
        // nhập mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + " is :");
            array[i] = scanner.nextInt();
        }
        // xuất mảng
        System.out.println("Array is : " + Arrays.toString(array));
        //xóa phần tử trong mảng
        System.out.println("Element you want delete is : ");
        int delete = scanner.nextInt();
        boolean check = false;
        for (Integer element : array) {
            if (element == delete) {
                deleteArray(array, delete);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Value " + delete + " NOT in array !");
        }
    }

}
