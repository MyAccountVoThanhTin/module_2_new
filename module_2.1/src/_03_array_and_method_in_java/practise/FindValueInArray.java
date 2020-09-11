package _03_array_and_method_in_java.practise;

import java.util.Arrays;
import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] student = {"tin","vo","quyen","duy","vu","cuong"} ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value want find is : ");
        String str = scanner.nextLine();
        boolean check = false;
        int position = 0;
        for (int i = 0 ;i<student.length;i++){
            if(student[i].equals(str)){
                check = true;
                position = i +1;
                break;
            }
        }
        if(check){
            System.out.println("Position of student in list "+ Arrays.toString(student) + " is "+position);
        }else {
            System.out.println("NOT found "+ str + " in array");
        }
    }
}
