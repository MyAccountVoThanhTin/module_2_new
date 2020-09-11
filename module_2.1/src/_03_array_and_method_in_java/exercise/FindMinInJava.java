package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMinInJava {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0;i<array.length;i++){
            System.out.println("Element "+ (i+1)+" : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Min of Array is : "+ findMin(array));
    }
}
