package _03_array_and_method_in_java.practise;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size : ");
            size = scanner.nextInt();
        }while (size <=0 || size >30);
        float[] array = new float[size];
        //nhập mảng
        for (int i = 0;i<array.length;i++){
            do {
                System.out.println("Enter element "+(i+1)+" is :");
                array[i] = scanner.nextFloat();
                if(array[i] < 0 || array[i]>10){
                    System.out.println("Limited!");
                }
            }while (array[i] < 0 || array[i]>10);
        }
        //xuất mảng
        System.out.println("Array is : "+ Arrays.toString(array));
        //điếm sô sv đỗ
        int count = 0;
        for (Float element : array){
            if(element >=5.0){
                count++;
            }
        }
        System.out.println("Total's Student pass is : "+count);
    }
}
