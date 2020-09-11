package _03_array_and_method_in_java.practise;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size : ");
            size = scanner.nextInt();
        }while (size > 20);
        array = new int[size];
        //truyền giá trị cho mảng
        for (int i = 0; i<array.length;i++){
            System.out.println("Enter element "+(i+1)+": ");
            array[i]=scanner.nextInt();
        }
        //xuất mảng
        System.out.println("Element in array : ");
        for (int j = 0;j <array.length;j++){
            System.out.print(array[j]+"\t");
        }
        System.out.println();
        //đảo chuỗi
       for (int k = 0;k < array.length/2;k++){
           int temp = array[k];
           array[k] = array[size -1 - k];
           array[size - 1 - k] = temp;
       }
        System.out.println("Array after reverse is : ");
       for (int j = 0;j < array.length;j++){
           System.out.print(array[j] +"\t");
       }
    }
}
