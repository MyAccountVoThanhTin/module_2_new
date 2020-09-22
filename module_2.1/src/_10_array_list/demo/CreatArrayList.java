package _10_array_list.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatArrayList {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = 5;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
        //add element in arr
        for (int i =0 ;i<n -2;i++){
            System.out.println("Element "+(i+1)+" is :" );
           int temp   = scanner.nextInt();
            arrayList.add(temp);
        }
        System.out.println(arrayList);

        // remove element not index
//        arrayList.remove(3);
//        System.out.println(arrayList);
        // Printing elements one by one
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
    }

}
