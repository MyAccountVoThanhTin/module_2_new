package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfRowInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns : ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        // nhập mảng
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println("Element " + (col + 1) + " of row " + (row + 1) + " is :");
                array[row][col] = scanner.nextInt();
            }
        }
        //xuất mảng
        System.out.println("Array is :");
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
            System.out.println();
        }
        //tinh tỏng
        int num;
        int sum = 0;
        do {
            System.out.println("Enter row to total : ");
            num = scanner.nextInt();
        } while (num <= 0 || num > rows);
        for (int i =0;i<array[num-1].length;i++){
            sum += array[num-1][i];
        }
        System.out.println("Total of row "+(num+1)+" is : "+ sum);
    }
}
