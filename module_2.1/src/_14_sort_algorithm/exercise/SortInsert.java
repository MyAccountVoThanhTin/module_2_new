package _14_sort_algorithm.exercise;

import java.util.Arrays;

public class SortInsert {
    public static void sortInsert(int[] arr){
       for (int i = 0; i<arr.length;i++){
           int key = arr[i];
           int j = i-1;
           while (j >= 0 && arr[j] > key){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = key;
           System.out.println("Lan :"+(i+1)+" "+ Arrays.toString(arr));
       }
    }
    public static void main(String[] args) {
        int[] arr ={2,4,0,8,1,9,7};
        sortInsert(arr);
        for (int i = 0 ;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
