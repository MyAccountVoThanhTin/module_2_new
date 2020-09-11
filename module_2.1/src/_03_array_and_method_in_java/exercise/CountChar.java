package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountChar {
//    public static int count(String str, char c) {
//        int count = 0;
//        for (int i=0; i < str.length(); i++)
//        {
//            if (str.charAt(i) == c)
//            {
//                count++;
//            }
//        }
//        return count;
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scanner.nextLine();
        // System.out.println(count(str,'c'));
        // str.replace(".", "") --> thay tất cả dấu chấm bằng chuỗi rỗng
        // 
        int replace = str.length() - str.replace(".", "").length();
        System.out.println("replace = " + replace);
    }
}

