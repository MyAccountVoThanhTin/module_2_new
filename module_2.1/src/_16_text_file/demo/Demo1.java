package _16_text_file.demo;

import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        System.out.println("simple message");
//        System.err.println("error message");
//        System.out.println("Enter a char in ASSCI :");
//        int i=System.in.read();
//        System.out.println(i);
        Scanner sc = new Scanner(System.in);
//        char c = 0;
//        String mes = " sai";
//        try {
//            System.out.println("Enter a char : ");
//            c = scanner.next().charAt(1);
//        }catch (StringIndexOutOfBoundsException e){
//            e.getStackTrace();
//        }
//
//        System.out.println("ngoai try catch");
        int sum = 0, count = 0;

        // Check if an int value is available
        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);

    }
}
