package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInDoubleArray {
    public static int finMinInDoubleArray(int[][] array) {
        int min = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] < min) {
                    min = array[row][column];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = scanner.nextInt();
        System.out.println("Emter Columns :");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        //Nhập mảng
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Element " + (column + 1) + " of row " + (row + 1) + " is :");
                array[row][column] = scanner.nextInt();
            }
        }
        //xuất mảng
        System.out.println("Array is : ");
        for (int row = 0; row < array.length; row++) {
            System.out.print(Arrays.toString(array[row]) + "\t");
            System.out.println();
        }
        //Giá trị nhỏ nhất trong mảng 2 chiều là
        System.out.println("Min is : " + finMinInDoubleArray(array));
    }
}
