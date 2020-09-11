package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter colums : ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        //nhập mảng
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println("Element " + (col + 1) + " of rows " + (row + 1) + " is :");
                array[row][col] = scanner.nextInt();
            }
        }
        //xuất mảng
        System.out.println("Array is :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
            System.out.println();
        }
        //tinh tong duong cheo
        int sum1 = 0, sum2 = 0, count = 0;
        int count2 = columns-1;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (col == count) {
                    sum1 += array[row][count];
                    count++;
                    break;
                }
            }
            for (int col2 = array[row].length - 1; col2 >= 0; col2--) {
                if (col2 == count2) {
                    sum2 += array[row][count2];
                    count2--;
                    break;
                }
            }
        }
        System.out.println("Sum is : " + (sum1 + sum2));
    }
}
