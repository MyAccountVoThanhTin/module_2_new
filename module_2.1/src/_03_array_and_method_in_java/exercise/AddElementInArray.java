package _03_array_and_method_in_java.exercise;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        System.out.println("Enter size : ");
        size = scanner.nextInt();
        array = new int[size];
        //nhập mảng
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println("Element " + (i + 1) + " is :");
            array[i] = scanner.nextInt();
        }
        //xuất mảng
        System.out.println("Array is :");
        System.out.println(Arrays.toString(array));
        //thêm phân tử vảo mảng
        System.out.println("Enter position add : ");
        int k = scanner.nextInt();
        if (k <= 1 || k > array.length - 1) {
            System.out.println("NOT Add element in array");
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Enter value add : ");
            int value = scanner.nextInt();
            for (int j = array.length - 1; j > k; j--) {
                array[j] = array[j - 1];
            }
            array[k]=value;
        }
        System.out.println("Array after add is : "+Arrays.toString(array));
    }
}
