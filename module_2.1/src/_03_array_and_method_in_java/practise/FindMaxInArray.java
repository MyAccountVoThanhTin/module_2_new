package _03_array_and_method_in_java.practise;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter size : ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Input size less 20 !");
            }
        }while (size > 20);
        array = new int[size];
        for (int i = 0 ; i <array.length;i++){
            System.out.println("Enter element "+(i+1)+" :");
            array[i] =scanner.nextInt();
        }
        System.out.println("this Array is :  ");
        for (Integer elemant : array) {
            System.out.print(elemant + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i< array.length;i++){
            if(array[i] >= max){
                max = array[i];
                index = i +1;
            }
        }
        System.out.println();
        System.out.println("The largest property value in the list is: "+max +" in position "+index);
    }
}
